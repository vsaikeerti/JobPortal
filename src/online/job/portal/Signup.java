/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Sai Keerti
 */
public class Signup extends JFrame implements ActionListener{
    
    JButton register,back;
    JTextField situsername,sitemailid,sitphone;
    JPasswordField sitpassword,sitconpass;
    
    Signup() {
        setSize(900,400);
        setLocation(250,150);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
  
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(130,193,230));
        p1.setBounds(0,0,500,400);  //set position and size of components
        p1.setLayout(null);
        add(p1);
        
        JLabel siusername=new JLabel("Username:");
        siusername.setFont(new Font("Tahoma",Font.PLAIN,15));
        siusername.setBounds(60,20,125,25);
        p1.add(siusername);
        
        situsername=new JTextField();
        situsername.setBounds(190,20,200,25);
        situsername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(situsername);
       
        
        JLabel siemailid=new JLabel("EmailId:");
        siemailid.setFont(new Font("Tahoma",Font.PLAIN,15));
        siemailid.setBounds(60,60,125,25);
        p1.add(siemailid);
        
        sitemailid=new JTextField();
        sitemailid.setBounds(190,60,200,25);
        sitemailid.setBorder(BorderFactory.createEmptyBorder());
        p1.add(sitemailid);
        
        JLabel sipassword=new JLabel("Password:");
        sipassword.setFont(new Font("Tahoma",Font.PLAIN,15));
        sipassword.setBounds(60,100,125,25);
        p1.add(sipassword);
        
        sitpassword=new JPasswordField();
        sitpassword.setBounds(190,100,200,25);
        sitpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(sitpassword);
        
        JLabel siconpass=new JLabel("Confirm Password:");
        siconpass.setFont(new Font("Tahoma",Font.PLAIN,15));
        siconpass.setBounds(60,140,125,25);
        p1.add(siconpass);
        
        sitconpass=new JPasswordField();
        sitconpass.setBounds(190,140,200,25);
        sitconpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(sitconpass);
        
        JLabel siphone=new JLabel("Phone Number:");
        siphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        siphone.setBounds(60,180,125,25);
        p1.add(siphone);
        
        sitphone=new JTextField();
        sitphone.setBounds(190,180,200,25);
        sitphone.setBorder(BorderFactory.createEmptyBorder());
        p1.add(sitphone);
        
        register=new JButton("Register");
        register.setBackground(Color.WHITE);
        register.setFont(new Font("Tahoma",Font.BOLD,16));
        register.setForeground(new Color(130,190,230));
        register.setBounds(100,250,150,30);
        register.addActionListener(this);
        p1.add(register);
        
        back=new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        back.setForeground(new Color(130,190,230));
        back.setBounds(300,250,150,30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/register.jpeg"));  //Classloader is a static class get is method
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT); //get is a function
        ImageIcon i3=new ImageIcon(i2); //to covert image into imageicon
        JLabel image=new JLabel(i3); //jlabel constructor will on only accept object of imageicon not of image 
        image.setBounds(550,30,280,280);
        add(image);
        
        setVisible(true);
    
}
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==register){
             String username=situsername.getText();  //it retrieves the text written by user
             String emailid=sitemailid.getText();
             String password=sitpassword.getText();
             String conpassword=sitconpass.getText();
             String phonenumber=sitphone.getText();
             
             String query="insert into account values('"+username+"','"+emailid+"','"+password+"','"+conpassword+"','"+phonenumber+"')";
             
             try{
                 Dbconn c=new Dbconn();
                 c.s.executeUpdate(query);  //it is used to execute the query
                 
                 JOptionPane.showMessageDialog(null,"Account Created Successfully");
                 
                 setVisible(false);
                 new Login();
                 
             }catch(Exception e){
                 e.printStackTrace();
             }
         }
         else if(ae.getSource() ==back) {
             setVisible(false);
             new Login();
         }
    }
    
    public static void main(String[] args){
        Signup s=new Signup();
    }
    
}
