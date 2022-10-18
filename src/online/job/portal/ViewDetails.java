/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author Sai Keerti
 */
public class ViewDetails extends JFrame implements ActionListener{
    
    JLabel addusername,addid,addemail,addgender,addaddress,addphone,addcollege,addcourse;
    JButton back;
    String username;
    
    ViewDetails(String username){
        this.username=username;
        setSize(800,530);
        setLocation(200,130);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,900,50);
        p1.setLayout(null);
        add(p1);
        
        JLabel heading =new JLabel("PERSONAL DETAILS");
        heading.setBounds(250,10,400,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("ALGERIAN",Font.BOLD,30));
        p1.add(heading);
        
        JLabel ausername=new JLabel("Username");
        ausername.setBounds(30,60,150,25);
        add(ausername);
        
        addusername=new JLabel();
        addusername.setBounds(180,60,150,25);
        add(addusername);
        
        JLabel id=new JLabel("Aadhaar Number");
        id.setBounds(30,120,120,25);
        add(id);
        
        addid=new JLabel();
        addid.setBounds(180,120,300,30);
        add(addid);
        
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
        
        JLabel adress=new JLabel("Address");
        adress.setBounds(400,60,300,25);
        add(adress);
        
        addaddress=new JLabel();
        addaddress.setBounds(550,60,300,30);
        add(addaddress);
        
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
        
        JLabel course=new JLabel("Course");
        course.setBounds(400,240,300,25);
        add(course);
        
        addcourse=new JLabel();
        addcourse.setBounds(550,240,300,30);
        add(addcourse);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300,300,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(70,320,600,200);
        add(image);
        
        try{
            Dbconn c=new Dbconn();
            String query="select * from employee where username='"+username+"'";
            ResultSet r=c.s.executeQuery(query);
            while(r.next()){
                addusername.setText(r.getString("username"));
                addid.setText(r.getString("aadhaar"));
                addemail.setText(r.getString("emailid"));
                addgender.setText(r.getString("gender"));
                addaddress.setText(r.getString("address"));
                addphone.setText(r.getString("phonenumber"));
                addcollege.setText(r.getString("college"));
                addcourse.setText(r.getString("course"));


            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args){
        new ViewDetails("");
    }
}
