/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.job.portal;

import java.sql.*;
/**
 *
 * @author Sai Keerti
 */
public class Dbconn {
    
    Connection conn;
    Statement s;
    Dbconn(){
        //register the driver
        //establishing conn
        //creating the statement
        //executing mysql queries
        //closing the connections
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//for is a static method in class
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinejobportal","root","Keerti@2002"); //get is static method in drivermanager class
            s=conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
