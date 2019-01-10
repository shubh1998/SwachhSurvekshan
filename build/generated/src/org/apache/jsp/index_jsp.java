package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<!-- your webpage info goes here -->\n");
      out.write("\n");
      out.write("    <title>SwachhSurvekshan.com</title>\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/enak1.png\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\t\n");
      out.write("<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n");
      out.write("\t<meta name=\"viewport\" contant=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- webpage content goes here in the body -->\n");
      out.write("\t\n");
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
      out.write("    </body>");
      out.write("\n");
      out.write("\t<section>\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"images/c1.jpg\" height=420vh style=\"width:100%\">\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"images/c2.jpg\" height=420vh style=\"width:100%\">\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"images/c3.jpg\" height=420vh style=\"width:100%\">\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"images/c4.jpg\" height=420vh style=\"width:100%\">\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"images/c5.jpg\" height=420vh style=\"width:100%\">\n");
      out.write("\t\t\t<img class=\"mySlides\" src=\"images/c6.jpg\" height=420vh style=\"width:100%\">\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script>\n");
      out.write("\t\t// Automatic Slideshow - change image every 3 seconds\n");
      out.write("\t\t\tvar myIndex = 0;\n");
      out.write("\t\t\tcarousel();\n");
      out.write("\n");
      out.write("\t\t\tfunction carousel() \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\tvar i;\n");
      out.write("\t\t\tvar x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("\t\t\tfor (i = 0; i < x.length; i++) \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tx[i].style.display = \"none\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tmyIndex++;\n");
      out.write("\t\t\tif (myIndex > x.length) {myIndex = 1}\n");
      out.write("\t\t\tx[myIndex-1].style.display = \"block\";\n");
      out.write("\t\t\tsetTimeout(carousel, 3000);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("  \t\t<div id= \"logo\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h1><a href=\"/\" id=\"logoLink\"; style= \"font-size:22px ; color:orange\" align = \"left\"><br/><br/>\n");
      out.write("                            <b>Swachh </b></a> <a href=\"#\" id=\"logoLink\"; style= \"font-size:22px ; color:green\" align = \"left\"> \n");
      out.write("                            <b>Sarvekshan</b></a> <a href=\"#\" id=\"logoLink\"; style= \"font-size:22px ; color:black\" align = \"left\"> \n");
      out.write("                            <b>2018</b></a></h1>\n");
      out.write("                </div><br><br><br><br><br>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<img src=\"images/swachhbharat.jpg\" alt=\"\" width=\"400px\" height=\"200px\" align=\"right\">\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tAs a prelude to encouraging cities to improve urban sanitation, Minister of Housing and Urban Affairs (formerly Ministry of Urban Development) had conducted 'Swachh Survekshan-2016' survey for the rating of 73 cities in January 2016 followed by 'Swachh Survekshan-2017' conducted in January- February 2017 ranking 434 cities. In a bid to scale up the coverage of the ranking exercise and encourage towns and cities to actively implement mission initiatives in a timely and innovative manner, MoHUA now proposes to conduct its third survey to rank all 4041 cities based on assessment of progress from January 2017 till December 2017 under Swachh Bharat Mission-Urban (SBM-U).\n");
      out.write("\t\t\t</p><br/>\n");
      out.write("\t\t\t<img src=\"images/enak.jpg\" alt=\"\" width=\"400ppx\" height=\"200px\" align=\"left\">\n");
      out.write("\t\t\t<p> \n");
      out.write("\t\t\t\tThe objective of the survey is to encourage large scale citizen participation and create awareness amongst all sections of society about the importance of working together towards making towns and cities a better place to live in. Additionally, the survey also intends to foster a spirit of healthy competition among towns and cities to improve their service delivery to citizens, towards creating cleaner cities.  \n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tIn order for cities to reap the maximum developmental bene ts from the survey, concerted efforts are being taken to strengthen the capacities of the cities to understand the modalities and spirit of the survey. In addition to giving towns and cities more time to prepare for the survey, there will be intensive interactions with ULBs to familiarize them with the survey methodology, survey process and output indicators, and also clarifying their expectations from the survey. \n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tSince citizen participation is a very crucial component of this survey, social media and other traditional media channels will be used strategically at both national, state and city levels in order to educate citizens about the objectives of the survey and survey methodology, as well as to reinforce the importance of their participation in the survey, in order to ensure signi cantly higher levels of participation from all citizens. \n");
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<video width=\"600\" height=\"340\" controls>\n");
      out.write("\t\t\t\t<source src=\"video/video.mp4\" type=\"video/mp4\">\n");
      out.write("\t\t\t\tYour browser does not support the video tag.\n");
      out.write("\t\t\t</video>\n");
      out.write("\t\t\t<video width=\"600\" height=\"340\" controls>\n");
      out.write("\t\t\t\t<source src=\"video/video1.mp4\" type=\"video/mp4\">\n");
      out.write("\t\t\t\tYour browser does not support the video tag.\n");
      out.write("\t\t\t</video>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tWebpage made by <a href=\"/\" target=\"_blank\">[Shubham Gupta]</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
