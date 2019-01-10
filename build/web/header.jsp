<%-- 
    Document   : header
    Created on : Apr 22, 2018, 9:33:35 PM
    Author     : RAJESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <head>
        <title>Login</title>
        <link rel="stylesheet" href="css/loginstyle.css">
        <link rel="stylesheet" href="css/responsive.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="icon" type="image/png" href="images/enak1.png"/>
        <meta name="viewport" contant="width=device-width, initial-scale=1.0">
    </head>
    <body>
        		<div id="page">
        <p>
		<div id="img">
		<img  src="images/indiangov.png" height="60px" width="210px" alt=""/>
 		<img  src="images/logo.png" height="60px" width="210px" hspace="360" alt=""/> 
		<img  src="images/enak.jpg" height="57px" width="210px" hspace="0" alt=""/>
		</div>
        </p>
		
          	<div class="navbar">
				<a href="index.jsp"><b>Home</b></a>
				<a href="pdf/Swachh Survekshan 2018.pdf"><b>Survekshan 2018</b></a>
				<a href="pdf/SS_2017_Report.pdf"><b>Previous Survey</b></a>
				<a href="complaint.jsp"><b>Complaint</b></a>
				<a href="feedback.jsp"><b>Citzen Feedback</b></a>
				<a href="contact.jsp"><b>Contact Us</b></a>
				<a href="about.jsp"><b>About Us</b></a>
                                <%if(session.getAttribute("user")==null){ %>
				<a href="login.jsp"><b>Login</b></a>
				<a href="register.jsp"><b>Register</b></a>
                                <%}
                                else
                                {
                                %>
                                <a href="mycomplaint.jsp"><b>My complaint</b></a>
                                <a href="logout.jsp"><b>Logout</b></a>
                                <a href="#"><b> <%=session.getAttribute("user").toString()%> </b></a>
                                <% } %>
				
		</div>
		<br/><br/><br/><br/><br/><br/><br/><br><br>
    </body>