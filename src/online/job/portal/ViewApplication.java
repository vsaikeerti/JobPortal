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
public class ViewApplication extends JFrame {
    
    JLabel addusername,addemail,addgender,addcollege,addjob,addphone;
    
    ViewApplication(){
        
        
        setSize(700,450);
        setLocation(250,130);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,700,50);
        p1.setLayout(null);
        add(p1);
        
        JLabel heading =new JLabel("VIEW APPLICATION");
        heading.setBounds(200,10,400,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("ALGERIAN",Font.BOLD,30));
        p1.add(heading);
        
        JLabel ausername=new JLabel("Username");
        ausername.setBounds(30,60,150,25);
        add(ausername);
        
        addusername=new JLabel();
        addusername.setBounds(180,60,150,25);
        add(addusername);
        
        JLabel aemail=new JLabel("EmailId");
        aemail.setBounds(30,180,150,25);
        add(aemail);
        
        addemail=new JLabel();
        addemail.setBounds(180,180,150,25);
        add(addemail);
        
        JLabel agender=new JLabel("Gender");
        agender.setBounds(30,240,150,25);
        add(agender);
        
        addgender=new JLabel();
        addgender.setBounds(180,240,70,25);
        addgender.setBackground(Color.WHITE);
        add(addgender);
        
        JLabel ajob=new JLabel("Job Applied");
        agender.setBounds(30,240,150,25);
        add(ajob);
        
        addjob=new JLabel();
        addjob.setBounds(180,240,70,25);
        addjob.setBackground(Color.WHITE);
        add(addjob);
        
        JLabel aphone=new JLabel("Phone Number");
        aphone.setBounds(400,120,150,25);
        add(aphone);
        
        addphone=new JLabel();
        addphone.setBounds(550,120,150,25);
        add(addphone);
        
        JLabel college=new JLabel("College Name");
        college.setBounds(400,180,300,25);
        add(college);
        
        addcollege=new JLabel();
        addcollege.setBounds(550,180,300,30);
        add(addcollege);
        
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new ViewApplication();
    }
    
}