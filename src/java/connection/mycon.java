/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
public class mycon {
            static Connection con=null;
    static{
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             System.out.println("Driver load successfully....");
         }
         catch(ClassNotFoundException e)
         {
             System.out.println(e);
         }
        
    }
    public static Connection myConnection()
    {
         try
         {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/liberary","root","root");
             System.out.println("java is successfully connected to database.....");
         }
         catch(SQLException e)
         {
             System.out.println(e);
         }
         return con;
    }   
}

