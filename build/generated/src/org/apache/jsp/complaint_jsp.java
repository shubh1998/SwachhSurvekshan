package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complaint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>ComplaintForm</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/loginstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/enak1.png\"/>\n");
      out.write("        <meta name=\"viewport\" contant=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class= \"complaint\">\n");
      out.write("        \n");
      out.write("        ");

            if(session.getAttribute("user")==null)
            {
                response.sendRedirect("login.jsp");
            }
            
            
      out.write("\n");
      out.write("        \n");
      out.write("\t    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/loginstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/enak1.png\"/>\n");
      out.write("        <meta name=\"viewport\" contant=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \t\t<div id=\"page\">\n");
      out.write("        <p>\n");
      out.write("\t\t<div id=\"img\">\n");
      out.write("\t\t<img  src=\"images/indiangov.png\" height=\"60px\" width=\"210px\" alt=\"\"/>\n");
      out.write(" \t\t<img  src=\"images/logo.png\" height=\"60px\" width=\"210px\" hspace=\"360\" alt=\"\"/> \n");
      out.write("\t\t<img  src=\"images/enak.jpg\" height=\"57px\" width=\"210px\" hspace=\"0\" alt=\"\"/>\n");
      out.write("\t\t</div>\n");
      out.write("        </p>\n");
      out.write("\t\t\n");
      out.write("          \t<div class=\"navbar\">\n");
      out.write("\t\t\t\t<a href=\"index.jsp\"><b>Home</b></a>\n");
      out.write("\t\t\t\t<a href=\"pdf/Swachh Survekshan 2018.pdf\"><b>Survekshan 2018</b></a>\n");
      out.write("\t\t\t\t<a href=\"pdf/SS_2017_Report.pdf\"><b>Previous Survey</b></a>\n");
      out.write("\t\t\t\t<a href=\"complaint.jsp\"><b>Complaint</b></a>\n");
      out.write("\t\t\t\t<a href=\"feedback.jsp\"><b>Citzen Feedback</b></a>\n");
      out.write("\t\t\t\t<a href=\"contact.jsp\"><b>Contact Us</b></a>\n");
      out.write("\t\t\t\t<a href=\"about.jsp\"><b>About Us</b></a>\n");
      out.write("                                ");
if(session.getAttribute("user")==null){ 
      out.write("\n");
      out.write("\t\t\t\t<a href=\"login.jsp\"><b>Login</b></a>\n");
      out.write("\t\t\t\t<a href=\"register.jsp\"><b>Register</b></a>\n");
      out.write("                                ");
}
                                else
                                {
                                
      out.write("\n");
      out.write("                                <a href=\"mycomplaint.jsp\"><b>My complaint</b></a>\n");
      out.write("                                <a href=\"logout.jsp\"><b>Logout</b></a>\n");
      out.write("                                <a href=\"#\"><b> ");
      out.print(session.getAttribute("user").toString());
      out.write(" </b></a>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br/><br/><br/><br/><br/><br/><br/><br><br>\n");
      out.write("\n");
      out.write("    </body>");
      out.write("\n");
      out.write("       <div>\n");
      out.write("            <h1 style=\"text-align:center; font-family:Georgia, serif; color:white; font-size: 25px;\">Complaint Form</h1><br/><br/>\n");
      out.write("            <form method=\"post\" action=\"insertcomplaint\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-25\">\n");
      out.write("\t\t\t\t\t<label for=\"DOC\">Date Of Complaint</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-75\">\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"DOC\" placeholder=\"DD/MM/YYYY\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-25\">\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"col-75\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"swachhsarvekshan@gmail.com\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-25\">\n");
      out.write("                        <label for=\"title\">Complaint Title</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-75\">\n");
      out.write("                        <input type=\"text\" name=\"title\" placeholder=\"Title\">\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-25\">\n");
      out.write("                        <label for=\"complaint\">Complaint</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-75\">\n");
      out.write("                        <textarea id=\"complaint\" name=\"complaint\" value=\"hi\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input type=\"submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
