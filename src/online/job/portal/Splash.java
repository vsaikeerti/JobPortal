/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Sai Keerti
 */
public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash() {
        //setSize(1200,600);
        //setLocation(200,100);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splashimg.jpeg"));  //Adding an image to the frame
        Image i2=i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT); //Scaling the image bydefault
        ImageIcon i3=new ImageIcon(i2); //to covert image into imageicon
        JLabel image=new JLabel(i3); //we cant directly store i2 so we are creating an object called jlabel we can write text on frame
        add(image);
        
        
        setVisible(true);
        thread =new Thread(this);
        thread.start();
        
            
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            
        }
        
    }
    
    public static void main(String[] args){
        Splash frame=new Splash();
        int x=1;
        for(int i=1;i<=500;x+=6,i+=6){
           frame.setLocation(700-(x+i)/2,400-(i/2)); 
           frame.setSize(x+i,i);
           try{
               Thread.sleep(10);
              
           }catch(Exception e){
               
           }
        }
        
    }
    
}
