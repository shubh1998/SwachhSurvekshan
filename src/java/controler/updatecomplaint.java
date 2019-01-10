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

/**
 *
 * @author RAJESH
 */
public class updatecomplaint extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updatecomplaint</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatecomplaint at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
             String name,email,address,city,country,sex,complaint,desired;
         PrintWriter out=response.getWriter();
         name=request.getParameter("txtname");
         email=request.getParameter("txtemail");
         address=request.getParameter("txtaddress");
         city=request.getParameter("txtcity");
         country=request.getParameter("txtcountry");
         sex=request.getParameter("txtsex");
         complaint=request.getParameter("txtcomplaint");
         desired=request.getParameter("txtdesired");
         complaint c=new complaint();
         c.setName(name);
         c.setEmail(email);
         c.setAddress(address);
         c.setCity(city);
         c.setCountry(country);
         c.setSex(sex);
         c.setComplain(complaint);
         c.setDesired(desired);
         complaintdao cd=new complaintdao();
         try
         {
           if (cd.updateComplaint(c))
           out.println("record updated.........");
       else
           out.println("record not found.......");
      }
      catch (Exception e)
      {
          out.println(e);
      } 
    }   
}
