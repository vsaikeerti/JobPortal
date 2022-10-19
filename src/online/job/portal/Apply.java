/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author Sai Keerti
 */
public class Apply extends JFrame implements ActionListener {
    
    Choice cpack;
    JLabel addusername,addemail;
    JTextField addperc;
    JButton check,apply,back;
    JMenuItem upload;
    JMenu addresume;
    JMenuBar mb;
    //JTextArea ta;
    String username;
    
    Apply(String username){
        this.username=username;
        setSize(800,500);
        setLocation(150,100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,900,50);
        p1.setLayout(null);
        add(p1);
        
        JLabel heading =new JLabel("FIND YOUR DREAM JOB");
        heading.setBounds(300,10,400,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("ALGERIAN",Font.BOLD,20));
        p1.add(heading);
        
        JLabel ausername=new JLabel("Username");
        ausername.setBounds(40,70,150,25);
        add(ausername);
        
        addusername=new JLabel();
        addusername.setBounds(250,70,150,25);
        add(addusername);
        
        JLabel aemail=new JLabel("EmailId");
        aemail.setBounds(40,130,150,25);
        add(aemail);
        
        addemail=new JLabel();
        addemail.setBounds(250,130,150,25);
        add(addemail);
        
        JLabel id=new JLabel(" Job Search");
        id.setBounds(40,190,150,25);
        add(id);
        
        cpack=new Choice();
        cpack.add("TCS");
        cpack.add("COMAKEIT");
        cpack.add("AMAZON");
        cpack.setBounds(250,190,180,25);
        add(cpack);
        
        JLabel resume=new JLabel("Upload Resume");
        resume.setBounds(40,250,100,25);
        add(resume);
        
        upload=new JMenuItem("Add Resume");
        upload.addActionListener(this);
        
        addresume=new JMenu("Upload");
        addresume.add(upload);
        
        mb=new JMenuBar();
        mb.setBounds(250,250,150,25);
        mb.add(addresume);
        add(mb);
        
        
        try{
            Dbconn c=new Dbconn();
            String query="select * from employee where username='"+username+"'";
            ResultSet r=c.s.executeQuery(query);
            while(r.next()){
                addusername.setText(r.getString("username"));
                addemail.setText(r.getString("emailid"));

            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        check=new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(60,320,120,25);
        check.addActionListener(this);
        add(check);
        
        apply=new JButton("Apply");
        apply.setBackground(Color.BLACK);
        apply.setForeground(Color.WHITE);
        apply.setBounds(200,320,120,25);
        apply.addActionListener(this);
        add(apply);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,320,120,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/apply.jpg"));
        Image i2=i1.getImage().getScaledInstance(250,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500,50,250,300);
        add(image);
       
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==check){
            String job=cpack.getSelectedItem();
            JOptionPane.showMessageDialog(null,"  Available ");
        }
        else if(ae.getSource()==apply){
            try{
                Dbconn c=new Dbconn();
                c.s.executeUpdate("insert into applyj values('"+addusername.getText()+"','"+addemail.getText()+"','"+cpack.getSelectedItem()+"')");  //update or modify the database
                
                JOptionPane.showMessageDialog(null,"Applied Successfully");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
         else if(ae.getSource()==upload){    
         JFileChooser fc=new JFileChooser();   
         int i=fc.showOpenDialog(this);    
         if(i==JFileChooser.APPROVE_OPTION){    
         File f=fc.getSelectedFile();    
         String filepath=f.getPath();  
           try{  
        BufferedReader br=new BufferedReader(new FileReader(filepath));    
        String s1="",s2="";                         
        while((s1=br.readLine())!=null){    
        s2+=s1+"\n";    
        }    
        //ta.setText(s2);    
        br.close();
        }catch (Exception e) {
            e.printStackTrace();
        }  
       }     
      }
        else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Apply("");
    }
    
}
