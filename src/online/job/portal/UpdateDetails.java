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
public class UpdateDetails extends JFrame implements ActionListener {

    JLabel addusername,addemail,addphone;
    JTextField tphone,taddress,tcollege,tcourse,tuid,tugender;
    JRadioButton rmale,rfemale;
    JButton update,back;
    String username;
    
        UpdateDetails(String username){
            this.username=username;
        //setBounds(450,200,850,550);
        setSize(800,530);
        setLocation(200,130);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,900,50);
        p1.setLayout(null);
        add(p1);
        
        JLabel heading =new JLabel("UPDATE PERSONAL DETAILS");
        heading.setBounds(300,10,400,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("ALGERIAN",Font.BOLD,20));
        p1.add(heading);
        
        JLabel ausername=new JLabel("Username");
        ausername.setBounds(30,60,150,25);
        add(ausername);
        
        addusername=new JLabel();
        addusername.setBounds(180,60,150,25);
        add(addusername);
        
        JLabel id=new JLabel("Aadhaar Number");
        id.setBounds(30,100,120,25);
        add(id);
        
        tuid=new JTextField();
        tuid.setBounds(180,100,200,30);
        add(tuid);
        
        JLabel aemail=new JLabel("EmailId");
        aemail.setBounds(30,150,150,25);
        add(aemail);
        
        addemail=new JLabel();
        addemail.setBounds(180,150,150,25);
        add(addemail);
        
        JLabel agender=new JLabel("Gender");
        agender.setBounds(30,200,150,25);
        add(agender);
        
        tugender=new JTextField();
        tugender.setBounds(180,200,200,30);
        add(tugender);
        
        JLabel adress=new JLabel("Address");
        adress.setBounds(30,250,300,25);
        add(adress);
        
        taddress=new JTextField();
        taddress.setBounds(180,250,200,30);
        add(taddress);
        
        JLabel aphone=new JLabel("Phone Number");
        aphone.setBounds(30,300,150,25);
        add(aphone);
        
        tphone=new JTextField();
        tphone.setBounds(180,300,200,30);
        add(tphone);
        
        JLabel college=new JLabel("College Name");
        college.setBounds(30,350,300,25);
        add(college);
        
        tcollege=new JTextField();
        tcollege.setBounds(180,350,200,30);
        add(tcollege);
        
        JLabel course=new JLabel("Course");
        course.setBounds(30,400,300,25);
        add(course);
        
        tcourse=new JTextField();
        tcourse.setBounds(180,400,200,30);
        add(tcourse);
        
        update=new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(90,450,100,25);
        update.addActionListener(this);
        add(update);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(280,450,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2=i1.getImage().getScaledInstance(350,380,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(380,80,400,380);
        add(image);
        
        try{
            Dbconn c=new Dbconn();
            ResultSet r=c.s.executeQuery("select * from employee where username='"+username+"'");  //retrieve data from database
            while(r.next()){
                addusername.setText(r.getString("username"));
                tuid.setText(r.getString("aadhaar"));
                addemail.setText(r.getString("emailid"));
                tugender.setText(r.getString("gender"));
                taddress.setText(r.getString("address"));
                tphone.setText(r.getString("phonenumber"));
                tcollege.setText(r.getString("college"));
                tcourse.setText(r.getString("course"));
                

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==update){
            String username=addusername.getText();
            String aadhaar=tuid.getText();
            String emailid=addemail.getText();
            String gender=tugender.getText();
            String address=taddress.getText();
            String phonenumber=tphone.getText();
            String college=tcollege.getText();
            String course=tcourse.getText();
            
            try{
                Dbconn c=new Dbconn();
                String query="update employee set username='"+username+"',aadhaar='"+aadhaar+"',emailid='"+emailid+"',gender='"+gender+"',address='"+address+"',phonenumber='"+phonenumber+"',college='"+college+"',course='"+course+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
                
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new UpdateDetails("");
    }
    
}

    

