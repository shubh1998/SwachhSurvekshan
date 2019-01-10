/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import model.complaint;
import connection.mycon;
import java.sql.*;

public class complaintdao {
     Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
     int n=0;
public boolean createComplent(complaint c) 
{
    String sql="insert complaintform(useremail,title,details,date) values(?,?,?,?)";
    con=mycon.myConnection();
    try
    { 
    ps=con.prepareStatement(sql);  
    ps.setString(1,c.getEmail());
    ps.setString(2,c.getTitle());
    ps.setString(3,c.getComplaint());
    ps.setString(4,c.getDate());
    n=ps.executeUpdate();
    }
    catch (Exception e)
    {
       System.out.println(e);
    }
    if(n>0)
        return true;
    else
    return false;
}
public boolean feedback(complaint c) 
{
    String sql="insert feedback values(?,?,?)";
    con=mycon.myConnection();
    try
    { 
    ps=con.prepareStatement(sql);  
    ps.setString(1,c.getEmail());
    ps.setInt(2,c.getRating());
    ps.setString(3,c.getFeedback());
    n=ps.executeUpdate();
    }
    catch (Exception e)
    {
       System.out.println(e);
    }
    if(n>0)
        return true;
    else
    return false;
 }
public complaint searchComplaint(String email) throws Exception
{
    con=mycon.myConnection();
    complaint c=new complaint();
    String sql="select * from complaintform where useremail=?";
    ps=con.prepareStatement(sql);
    ps.setString(1,email);
    rs=ps.executeQuery();
    if(rs.next())
    {
        c.setTitle(rs.getString("title"));
        c.setComplaint(rs.getString("details"));
        
    }
    else
    {
        c=null;
    }
   return c;
}
/*public boolean updateComplaint(complaint c) throws Exception
{
    con=mycon.myConnection();
    String name,email,address,city,country,sex,complaint,desired,sql;
    name=c.getName();
    email=c.getEmail();
    address=c.getAddress();
    city=c.getCity();
    country=c.getCountry();
    sex=c.getSex();
    complaint=c.getComplain();
    desired=c.getDesired();
    sql="update complaintform set name=?,email=?,address=?,city=?,country=?,sex=?,complaintdetails=?,desiredoutcome=? where name=?";
    ps=con.prepareStatement(sql);
    ps.setString(1,name);
    ps.setString(2,email);
    ps.setString(3,address);
    ps.setString(4,city);
    ps.setString(5,country);
    ps.setString(6,sex);
    ps.setString(7,complaint);
    ps.setString(8,desired);
    ps.setString(9,name);
   int n=ps.executeUpdate();
   if (n>0)
       return true;
   return false;
  }*/
public boolean deleteComplaint(complaint c) throws Exception
 {
    String sql="delete from complaintform where name=?";
    con=mycon.myConnection();
    ps=con.prepareStatement(sql);
    //ps.setString(1,c.getName());
    int n=0;
    n=ps.executeUpdate();
    if(n>0) 
        return true;
    return false;
 }

}
