/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import connection.mycon;
import model.User;
import java.sql.*;

public class logindao 
{
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    int n=0; 
    public User checkLogin(String username)throws Exception
    {
        User l=new User();
        con=mycon.myConnection();
       String sql="select * from login1 where email=?";
       ps=con.prepareStatement(sql);
       ps.setString(1,username);
       rs=ps.executeQuery();
           if (rs.next())
           {   
           l.setEmail(rs.getString("email"));
           l.setPass(rs.getString("password"));
           l.setName(rs.getString("name"));
           
           }
           else
           {
              l=null;
           }
           return l;
    } 
     public boolean registration (User l)throws Exception
    {
         con=mycon.myConnection();
         String name,email,contactno,address,city,gender,pass;
         name=l.getName();
         email=l.getEmail();
         contactno=l.getContactno();
         address=l.getAddress();
         city=l.getCity();
         gender=l.getGender();
         pass=l.getPass();
         String sql="insert login1 values(?,?,?,?,?,?,?)";
         ps=con.prepareStatement(sql);
         ps.setString(1,name);
         ps.setString(2,email);
         ps.setString(3,contactno);
         ps.setString(4,address);
         ps.setString(5,city);
         ps.setString(6,gender);
         ps.setString(7,pass);
         int n=ps.executeUpdate();
         if(n>0)
         return true;
         return false;
    }
}
