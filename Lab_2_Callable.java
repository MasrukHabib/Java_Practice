/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Masruk Habib
 */
public class Lab_2 {
    public static void main (String[] args){
        
        final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
        final String DB_Url="jdbc:mysql://localhost:3306/unit1";
        final String UserName="root";
        final String Password="";
        
        Connection con=null;
        
        try{
            Class.forName(JDBC_Driver);
            con= DriverManager.getConnection(DB_Url,UserName,Password);
            CallableStatement  cs=con.prepareCall("{call getCity(?,?)}");
            
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Employee ID: ");
            int Id=sc.nextInt();
            
            cs.setInt(1, Id);
            cs.registerOutParameter(2,java.sql.Types.VARCHAR);
            cs.execute();
            
            System.out.println("The Employee City is " + cs.getString(2)); 
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("It's Not Connected with the DB!");
        }     
    }
    
}
