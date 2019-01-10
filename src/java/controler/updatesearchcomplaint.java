
package controler;

import DAO.complaintdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.complaint;

public class updatesearchcomplaint extends HttpServlet 
{

    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String name;
        PrintWriter out=response.getWriter();
        name=request.getParameter("txtname");
        complaintdao d1=new complaintdao();
        complaint c=new complaint();
        try
        {    
          c=d1.searchComplaint(name);
          if (c!=null)
          {
           //out.printf("<html> <body><center><table border=1><tr><th>Name</th><th>Roll Number</th><th>Physics</th><th>Chemistry</th><th>Maths</th></tr><tr><td>"+s.getName()+"</td><td>"+s.getRollno()+"</td><td>"+s.getPhysics()+"</td><td>"+s.getChemistery()+"</td><td>"+s.getMaths()+"</td></tr></table></center></body></html>");
           out.println("<html>");
           out.println("<body>");
           out.println("<center>");
           out.println("<form method=post action=updatecomplaint>");
           out.println("<table border=1>");
           out.println("<tr>");
             out.println("<th>Name</th>");
               out.println("<td><input type=text name=txtname value="+c.getName()+">");
                 out.println("</td>");
           out.println("</tr>");
           out.println("<tr>");
             out.println("<th>Email</th>");
               out.println("<td><input type=text name=txtemail value="+c.getEmail()+">");
                 out.println("</td>");
           out.println("</tr>");
           out.println("<tr>");
             out.println("<th>Address</th>");
               out.println("<td><input type=text name=txtaddress value="+c.getAddress()+">");
                 out.println("</td>");
           out.println("</tr>");
           out.println("<tr>");
             out.println("<th>City</th>");
               out.println("<td><input type=text name=txtcity value="+c.getCity()+">");
                 out.println("</td>");
           out.println("</tr>");
           out.println("<tr>");
             out.println("<th>Country</th>");
               out.println("<td><input type=text name=txtcountry value="+c.getCountry()+">");
                 out.println("</td>");
           out.println("</tr>");
            out.println("<tr>");
             out.println("<th>Sex</th>");
               out.println("<td><input type=text name=txtsex value="+c.getSex()+">");
                 out.println("</td>");
           out.println("</tr>");
              out.println("<tr>");
             out.println("<th>Complaint Details</th>");
               out.println("<td><input type=text name=txtcomplaint value="+c.getComplain()+">");
                 out.println("</td>");
           out.println("</tr>");
           
              out.println("<tr>");
             out.println("<th>Desired Outcome</th>");
               out.println("<td><input type=text name=txtdesired value="+c.getDesired()+">");
                 out.println("</td>");
           out.println("</tr>");
           
           out.println("<tr>");
           out.println("<td>");
           out.println("<input type=submit value=update>");
           out.println("</td>");
           out.println("</tr>");
           out.println("</table>");
           out.println("</form>");
           out.println("</center>");
           out.println("</body>");
           out.println("</html>");   
         }    
          else
            out.println("no such record found related to given Roll Number......");
        }
        catch(Exception e)
        {
            out.println(e);
        }  
    }
}
