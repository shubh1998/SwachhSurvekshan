<%-- 
    Document   : complaint
    Created on : Apr 22, 2018, 7:32:51 PM
    Author     : RAJESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
        <title>ComplaintForm</title>
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
            <h1 style="text-align:center; font-family:Georgia, serif; color:white; font-size: 25px;">Complaint Form</h1><br/><br/>
            <form method="post" action="insertcomplaint">
                
                
                <div class="row">
				<div class="col-25">
					<label for="DOC">Date Of Complaint</label>
				</div>
				<div class="col-75">
					<input type="date" name="DOC" placeholder="DD/MM/YYYY">
                                </div></div>
                <div class="row">
				<div class="col-25">
					<label for="email">Email</label>
				</div>
				<div class="col-75">
					<input type="email" name="email" placeholder="swachhsarvekshan@gmail.com">
				</div></div>
                <div class="row">
                    <div class="col-25">
                        <label for="title">Complaint Title</label>
                    </div>
                    <div class="col-75">
                        <input type="text" name="title" placeholder="Title">
                    </div>
                  </div>
                <div class="row">
                    <div class="col-25">
                        <label for="complaint">Complaint</label>
                    </div>
                    <div class="col-75">
                        <textarea id="complaint" name="complaint"   placeholder="Write something.." style="height:200px"></textarea>
                    </div>
                </div>
                <div class="row">
                    <input type="submit" value="Submit">
                </div>
            </form>
        </div>
    </body>
</html>