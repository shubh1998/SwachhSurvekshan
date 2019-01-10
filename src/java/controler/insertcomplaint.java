/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;

import DAO.complaintdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.complaint;


public class insertcomplaint extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String title,complaint,email,date;
         PrintWriter out=response.getWriter();
         date=request.getParameter("DOC");
         email=request.getParameter("email");
         title=request.getParameter("title");
         complaint=request.getParameter("complaint");
         complaint c=new complaint();
         c.setDate(date);
         c.setEmail(email);
         c.setTitle(title);
         c.setComplaint(complaint);
         complaintdao cd=new complaintdao();
         if (cd.createComplent(c))
             out.println("Record Inserted..........");
         else
             out.println("Record Not Inserted..........");       
    }
}
