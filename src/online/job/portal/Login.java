/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Sai Keerti
 */
public class Login extends JFrame implements ActionListener{
    
    JButton login,signup;
    JTextField tusername;
    JPasswordField tpassword;
    
    Login(){
        setSize(900,400);
        setLocation(250,150);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,194,223));//Color is in awt
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);  //setBounds will only work when setLayout is null
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(110,100, 150,150);  //to place the image on the frame
        p1.add(image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel username=new JLabel("Username:");
        username.setBounds(60,20,100,25); //to place on frame
        username.setFont(new Font("CALIBRI",Font.BOLD,21));
        p2.add(username); //to add on p2 panel

        tusername=new JTextField();
        tusername.setBounds(60,50,300,30);
        tusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tusername);
        
        JLabel password=new JLabel("Password:");
        password.setBounds(60,110,100,25); //to place on frame
        password.setFont(new Font("CALIBRI",Font.BOLD,21));
        p2.add(password); //to add on p2 panel

        tpassword=new JPasswordField();
        tpassword.setBounds(60,140,300,30);
        tpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tpassword);
        
        login=new JButton("Login");
        login.setBounds(60,220,130,30);
        login.setBackground(new Color(132,190,230));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,190,230)));
        login.addActionListener(this);
        p2.add(login);
        
        signup=new JButton("SignUp");
        signup.setBounds(230,220,130,30);
        signup.setBackground(new Color(132,190,230));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,190,230)));
        signup.addActionListener(this);
        p2.add(signup);
        
        
        setVisible(true);
    }
    @Override
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==login) {//returns the object on which the event is performed 
             try{
                 String username=tusername.getText();
                 String password=tpassword.getText();
                 
                 String query="select * from account where username='"+username+"' AND password='"+password+"'";
                 Dbconn c=new Dbconn();  //opening the connection
                 ResultSet r=c.s.executeQuery(query);  //the result is stored in the resultset object of the query
                 
                 if(r.next()){  //.next() returns true or false whether the r object contains anything or not
                     setVisible(false);
                     new Loading(username);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Incorrect username or password");
                 }
                 
             }catch(Exception e){
                 e.printStackTrace();
             }
             
         }
         else if(ae.getSource()==signup){
             setVisible(false);
             new Signup();
         }
         
     }
    public static void main(String[] args){
        new Login();
        
    }
    
}
