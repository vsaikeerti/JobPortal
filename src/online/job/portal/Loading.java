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
public class Loading extends JFrame implements Runnable {
    Thread t; //it will call the run method
    JProgressBar bar;
    String username;
    
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max=bar.getMaximum();  //it will give the max value 100
                int value=bar.getValue(); //it will give current value
                
                if(value<max)
                    bar.setValue(bar.getValue() +1);
                else{
                    setVisible(false);
                    new Dashboard(username);
                }
                
                
                Thread.sleep(50);
            
            }
        }catch(Exception e) {
          e.printStackTrace();
      }
    }
    Loading(String username){
        this.username=username;  //local var in global var
        
        t=new Thread(this);
        setSize(650,400);
        setLocation(250,150);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        JLabel text=new JLabel("ONLINE JOB PORTAL");
        text.setBounds(120,20,600,40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("ALGERIAN",Font.ITALIC,40));
        add(text);
        
        bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel load=new JLabel("Loading,Please Wait....");
        load.setBounds(230,130,300,30);
        load.setForeground(Color.RED);
        load.setFont(new Font("RALEWAY",Font.ITALIC,16));
        add(load);
        
        JLabel lusername=new JLabel("WELCOME " +username+"!");
        lusername.setBounds(20,320,400,40);
        lusername.setForeground(Color.RED);
        lusername.setFont(new Font("RALEWAY",Font.BOLD,16));
        add(lusername);
        
        t.start();
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Loading("");
    }
    
}
