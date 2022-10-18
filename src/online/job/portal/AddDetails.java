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
public class AddDetails extends JFrame implements ActionListener{
    
    JLabel addusername,addemail,addphone;
    JTextField tid,taddress,tcollege,tcourse;
    JRadioButton rmale,rfemale;
    JButton add,back;
    String username;
    
    AddDetails(String username){
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
        
        JLabel heading =new JLabel("ADD PERSONAL DETAILS");
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
        
        tid=new JTextField();
        tid.setBounds(180,100,300,30);
        add(tid);
        
        JLabel aemail=new JLabel("EmailId");
        aemail.setBounds(30,150,150,25);
        add(aemail);
        
        addemail=new JLabel();
        addemail.setBounds(180,150,150,25);
        add(addemail);
        
        JLabel agender=new JLabel("Gender");
        agender.setBounds(30,200,150,25);
        add(agender);
        
        rmale=new JRadioButton("Male");
        rmale.setBounds(180,200,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        
        rfemale=new JRadioButton("Female");
        rfemale.setBounds(260,200,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg=new ButtonGroup();  //this class allows to select only one option
        bg.add(rmale);
        bg.add(rfemale);
        
        JLabel adress=new JLabel("Address");
        adress.setBounds(30,250,300,25);
        add(adress);
        
        taddress=new JTextField();
        taddress.setBounds(180,250,300,30);
        add(taddress);
        
        JLabel aphone=new JLabel("Phone Number");
        aphone.setBounds(30,300,150,25);
        add(aphone);
        
        addphone=new JLabel();
        addphone.setBounds(180,300,150,25);
        add(addphone);
        
        JLabel college=new JLabel("College Name");
        college.setBounds(30,350,300,25);
        add(college);
        
        tcollege=new JTextField();
        tcollege.setBounds(180,350,300,30);
        add(tcollege);
        
        JLabel course=new JLabel("Course");
        course.setBounds(30,400,300,25);
        add(course);
        
        tcourse=new JTextField();
        tcourse.setBounds(180,400,300,30);
        add(tcourse);
        
        add=new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(90,450,100,25);
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(280,450,100,25);
        back.addActionListener(this);
        add(back);
        
        try{
            Dbconn c=new Dbconn();
            ResultSet r=c.s.executeQuery("select * from account where username='"+username+"'");
            while(r.next()){
                addusername.setText(r.getString("username"));
                addemail.setText(r.getString("emailid"));
                addphone.setText(r.getString("phonenumber"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username=addusername.getText();
            String aadhaar=tid.getText();
            String emailid=addemail.getText();
            String gender=null;
            
            if(rmale.isSelected()){  //it tells which otion is selected
                gender="Male";
            }
            else{
                gender="Female";
            }
            String address=taddress.getText();
            String phonenumber=addphone.getText();
            String college=tcollege.getText();
            String course=tcourse.getText();
            
            try{
                Dbconn c=new Dbconn();
                String query="insert into employee values('"+username+"','"+aadhaar+"','"+emailid+"','"+gender+"','"+address+"','"+phonenumber+"','"+college+"','"+course+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Details Added Successfully");
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
        new AddDetails("");
    }
    
}
