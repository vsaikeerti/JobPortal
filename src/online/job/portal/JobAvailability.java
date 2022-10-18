/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.awt.event.*;
/**
 *
 * @author Sai Keerti
 */
public class JobAvailability extends JFrame implements ActionListener{
    
    JButton app1;
    String username;
    
    JobAvailability(String username){
        this.username=username;
        setSize(900,560);
        setLocation(150,100);
        //setLayout(null);
        
       
        JTabbedPane tab=new JTabbedPane(); //it is used to create tabs
        
        ImageIcon icon1 = new ImageIcon(Objects.requireNonNull(
     this.getClass().getResource("/icons/tcss.jpeg")));
        
        ImageIcon icon2 = new ImageIcon(Objects.requireNonNull(
     this.getClass().getResource("/icons/comakeit.png")));
        
        ImageIcon icon3 = new ImageIcon(Objects.requireNonNull(
     this.getClass().getResource("/icons/amazonn.jpg")));
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1=new JLabel("TATA CONSULTANCY SERVICES");
        l1.setBounds(150,35,800,40);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("ALGERIAN",Font.ITALIC,40));
        p1.add(l1);
        
        JLabel l2=new JLabel("BE AN ASSET TO OUR INNOVATION AND COLLECTIVE KNOWLEDGE");
        l2.setBounds(120,100,900,35);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("CALIBRI",Font.BOLD,25));
        p1.add(l2);
        
        JLabel l3=new JLabel("JOB DESCRIPTION:");
        l3.setBounds(80,200,600,40);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l3);
        
        JLabel l4=new JLabel("POSITION  :  Production & Application Support");
        l4.setBounds(80,280,800,40);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l4);
        
        JLabel l5=new JLabel("LAST DATE  :  31-October-2022");
        l5.setBounds(80,350,800,40);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l5);
        
        JLabel l6=new JLabel("LOCATION  :  Bhubaneshwar");
        l6.setBounds(80,420,800,40);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l6);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        
        JLabel l7=new JLabel("COMAKEIT-PART OF XEBIA");
        l7.setBounds(150,35,800,40);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("ALGERIAN",Font.ITALIC,45));
        p2.add(l7);
        
        JLabel l8=new JLabel("Product Thinking and co-Creation");
        l8.setBounds(220,100,900,35);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("CALIBRI",Font.BOLD,30));
        p2.add(l8);
        
        JLabel l9=new JLabel("JOB DESCRIPTION");
        l9.setBounds(80,200,600,40);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma",Font.BOLD,30));
        p2.add(l9);
        
        JLabel l10=new JLabel("POSITION  :  Software Engineer");
        l10.setBounds(80,280,800,40);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Tahoma",Font.BOLD,20));
        p2.add(l10);
        
        JLabel l11=new JLabel("LAST DATE  :  31-December-2022");
        l11.setBounds(80,350,800,40);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Tahoma",Font.BOLD,20));
        p2.add(l11);
        
        JLabel l12=new JLabel("LOCATION  :  Hyderabad");
        l12.setBounds(80,420,800,40);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Tahoma",Font.BOLD,20));
        p2.add(l12);
        
        JPanel p3=new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.WHITE);
        
        JLabel l13=new JLabel("AMAZON");
        l13.setBounds(350,35,800,40);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("ALGERIAN",Font.ITALIC,45));
        p3.add(l13);
        
        JLabel l14=new JLabel("A VAST INTERNET-BASED ENTERPRISE");
        l14.setBounds(250,100,900,35);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("CALIBRI",Font.BOLD,30));
        p3.add(l14);
        
        JLabel l15=new JLabel("JOB DESCRIPTION");
        l15.setBounds(80,200,600,40);
        l15.setForeground(Color.BLACK);
        l15.setFont(new Font("Tahoma",Font.BOLD,30));
        p3.add(l15);
        
        JLabel l16=new JLabel("POSITION  :  Database Administrator");
        l16.setBounds(80,280,800,40);
        l16.setForeground(Color.BLACK);
        l16.setFont(new Font("Tahoma",Font.BOLD,20));
        p3.add(l16);
        
        JLabel l17=new JLabel("LAST DATE  :  31-November-2022");
        l17.setBounds(80,350,800,40);
        l17.setForeground(Color.BLACK);
        l17.setFont(new Font("Tahoma",Font.BOLD,20));
        p3.add(l17);
        
        JLabel l18=new JLabel("LOCATION  :  Banglore");
        l18.setBounds(80,420,800,40);
        l18.setForeground(Color.BLACK);
        l18.setFont(new Font("Tahoma",Font.BOLD,20));
        p3.add(l18);
        
        app1=new JButton("Apply Now");
        app1.setBackground(Color.RED);
        app1.setForeground(Color.WHITE);
        app1.setBounds(650,450,100,25);
        app1.addActionListener(this);
        add(app1);
       
        tab.addTab(null,icon1,p1);
       
        tab.addTab(null,icon2,p2);
        
        tab.addTab(null,icon3,p3);
        
        add(tab);
        
        //this.add(tab,BorderLayout.CENTER);
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==app1){
            setVisible(false);
            new Apply(username);
        }
    }
    
    public static void main(String args[]){
        new JobAvailability("");
        
    }
    
}
