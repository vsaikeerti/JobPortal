/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sai Keerti
 */
public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton personal,view,update,jobs,apply,help,delapply,viewapply;
    
    Dashboard(String username){
       this.username=username;
        
       // setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//maximizes the length and breadth of the screen
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1400,65);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard1.jpg"));
        Image i2=i1.getImage().getScaledInstance(55,55,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,5,55,55);
        p1.add(icon);
        
        JLabel heading =new JLabel("DASHBOARD");
        heading.setBounds(70,15,280,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("ALGERIAN",Font.BOLD,35));
        p1.add(heading);
       
        
        JPanel p2=new JPanel();
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        p2.setLayout(null);
        add(p2);
        
        personal=new JButton("Add Personal Details");
        personal.setBounds(0,10,300,50);
        personal.setBackground(new Color(0,0,102));
        personal.setForeground(Color.YELLOW);
        personal.setFont(new Font("Tahoma",Font.PLAIN,20));
        personal.addActionListener(this);
        p2.add(personal);
        
        update=new JButton("Update Personal Details");
        update.setBounds(0,70,300,50);
        update.setBackground(new Color(0,0,102));
        update.setForeground(Color.YELLOW);
        update.setFont(new Font("Tahoma",Font.PLAIN,20));
        update.addActionListener(this);
        p2.add(update);
        
        view=new JButton("View Details");
        view.setBounds(0,140,300,50);
        view.setBackground(new Color(0,0,102));
        view.setForeground(Color.YELLOW);
        view.setFont(new Font("Tahoma",Font.PLAIN,20));
        view.addActionListener(this);
        p2.add(view);
        
        jobs=new JButton("Jobs Available");
        jobs.setBounds(0,210,300,50);
        jobs.setBackground(new Color(0,0,102));
        jobs.setForeground(Color.YELLOW);
        jobs.setFont(new Font("Tahoma",Font.PLAIN,20));
        jobs.addActionListener(this);
        p2.add(jobs);
        
        
        apply=new JButton("Apply");
        apply.setBounds(0,280,300,50);
        apply.setBackground(new Color(0,0,102));
        apply.setForeground(Color.YELLOW);
        apply.setFont(new Font("Tahoma",Font.PLAIN,20));
        apply.addActionListener(this);
        p2.add(apply);
        
        viewapply=new JButton("View Application");
        viewapply.setBounds(0,350,300,50);
        viewapply.setBackground(new Color(0,0,102));
        viewapply.setForeground(Color.YELLOW);
        viewapply.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewapply.addActionListener(this);
        p2.add(viewapply);
        
        delapply=new JButton("Delete Personal Details");
        delapply.setBounds(0,420,300,50);
        delapply.setBackground(new Color(0,0,102));
        delapply.setForeground(Color.YELLOW);
        delapply.setFont(new Font("Tahoma",Font.PLAIN,20));
        delapply.addActionListener(this);
        p2.add(delapply);
        
        help=new JButton("Logout");
        help.setBounds(0,490,300,50);
        help.setBackground(new Color(0,0,102));
        help.setForeground(Color.YELLOW);
        help.setFont(new Font("Tahoma",Font.PLAIN,20));
        help.addActionListener(this);
        p2.add(help);
        
        JLabel lusername=new JLabel("Hi " +username+"!");
        lusername.setBounds(1150,15,400,40);
        lusername.setForeground(Color.WHITE);
        lusername.setFont(new Font("RALEWAY",Font.BOLD,20));
        p1.add(lusername);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/dash.png"));
        Image i5=i4.getImage().getScaledInstance(1000,600,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel icon1=new JLabel(i6);
        icon1.setBounds(300,90,1000,600);
        add(icon1);
        
        JLabel text=new JLabel("ONLINE JOB PORTAL");
        text.setBounds(200,10,1000,70);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma",Font.BOLD,60));
        icon1.add(text);
        
        setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==personal){
            new AddDetails(username);
        }
        else if(ae.getSource()==view){
            new ViewDetails(username);
        }
        else if(ae.getSource()==update){
            new UpdateDetails(username);
        }
        else if(ae.getSource()==jobs){
            new JobAvailability(username);
        }
        else if(ae.getSource()==apply){
            new Apply(username);
        }
        else if(ae.getSource()==viewapply){
            new ViewApplication(username);
        }
        else if(ae.getSource()==delapply){
            new DeleteDetails(username);
        }
        else if(ae.getSource()==help){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){
        new Dashboard("");
    }
    
}
