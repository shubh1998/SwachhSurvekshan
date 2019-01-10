<%-- 
    Document   : mycomplaint
    Created on : Apr 22, 2018, 7:37:48 PM
    Author     : RAJESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
   <head>
        <title>ViewComplaint</title>
        <link rel="stylesheet" href="css/loginstyle.css">
        <link rel="stylesheet" href="css/responsive.css">
        <link rel="stylesheet" href="css/style.css" type="text/css" />
        <link rel="icon" type="image/png" href="images/enak1.png"/>
        <meta name="viewport" contant="width=device-width, initial-scale=1.0">
    </head>

    <body class= "complaint">
        
        <%
            if(session.getAttribute("user")==null)
            {
                response.sendRedirect("login.jsp");
            }
            
            %>
        
	    <%@include file="header.jsp" %>

        <div>
            <h1 style="text-align:center; font-family:Georgia, serif; color:white; font-size: 25px;">View Complaint</h1><br/><br/>
            <form method="post" action="searchcomplaint">
                <div class="row">
				<div class="col-25">
					<label for="email">Email</label>
				</div>
                            
				<div class="col-75">
					<input type="email" name="email" placeholder="swachhsarvekshan@gmail.com">
				</div>
			</div>
            
                
                   </div>

                <div class="row">
                    <input type="submit" value="Submit">

                </div>
            </form>
        </div>
    </body>
</html>
