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
import javax.servlet.http.HttpSession;
import model.complaint;
/**
 *
 * @author RAJESH
 */
public class searchcomplaint extends HttpServlet 
{
    String email1;

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
            out.println("<title>Servlet searchcomplaint</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet searchcomplaint at " + request.getContextPath() + "</h1>");
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
        PrintWriter out=response.getWriter();
        String email;
       //HttpSession session=null;
       //out.println (session.getAttribute("user").toString());
        email=request.getParameter("email");
        complaintdao d1=new complaintdao();
        complaint c=new complaint();
        try
        {    
          c=d1.searchComplaint(email);
          if (c!=null)
          {
           //out.printf("<html> <body><center><table border=1><tr><th>Name</th><th>Roll Number</th><th>Physics</th><th>Chemistry</th><th>Maths</th></tr><tr><td>"+s.getName()+"</td><td>"+s.getRollno()+"</td><td>"+s.getPhysics()+"</td><td>"+s.getChemistery()+"</td><td>"+s.getMaths()+"</td></tr></table></center></body></html>");
           out.println("<html>");
           out.println("<head> <title>ComplaintForm</title>\n" +
"        <link rel=\"stylesheet\" href=\"css/loginstyle.css\">\n" +
"        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n" +
"        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n" +
"        <link rel=\"icon\" type=\"image/png\" href=\"images/enak1.png\"/>\n" +
"        <meta name=\"viewport\" contant=\"width=device-width, initial-scale=1.0\">");
           out.println("</head>");
           out.println("<body class= \"complaint\"> <div>\n" +
"            <h1 style=\"text-align:center; font-family:Georgia, serif; color:white; font-size: 25px;\">Complaint Form</h1><br/><br/>\n");
           out.println("<form <div class=\"row\">\n" +
"                    <div class=\"col-25\">\n" +
"                        <label for=\"title\">Complaint Title</label>\n" +
"                    </div>\n" +
"                    <div class=\"col-75\">\n" +
"                        <input type=\"text\" name=\"title\" value="+c.getTitle()+" placeholder=\"Title\">\n  " +
"                    </div>\n" +
"                  </div>\n" +
"                \n" +
"                <div class=\"row\">\n" +
"                    <div class=\"col-25\">\n" +
"                        <label for=\"complaint\">Complaint</label>\n" +
"                    </div>\n" +
"                    <div class=\"col-75\">\n" +
"                        <textarea id=\"complaint\" name=\"complaint\"  style=\"height:200px\">"+c.getComplaint()+"</textarea>\n" +
"                    </div>\n" +
"                </div>> </form>\n" +
"        </div>\n" +
"    </body>\n" +
"\n" +
"</html>");  
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
