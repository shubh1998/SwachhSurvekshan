<%-- 
    Document   : login
    Created on : Apr 22, 2018, 7:34:04 PM
    Author     : RAJESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="css/loginstyle.css">
        <link rel="stylesheet" href="css/responsive.css">
               <link rel="stylesheet" href="css/style.css">

        <link rel="icon" type="image/png" href="images/enak1.png"/>
        <meta name="viewport" contant="width=device-width, initial-scale=1.0">
    </head>

    <body class="login">
        	    <%@include file="header.jsp" %>

        <div>
            <h1 style="text-align:center; font-family:Georgia, serif; color:white; font-size: 25px;">User Login</h1>
            <form action="login" method="post">
                <div class="row">
                    <div class="col-25">
                        <label for="email">Email</label>
                    </div>
                    <div class="col-75">
                        <input type="email" name="email" placeholder="Swachhsarvekshan@gmail.com" >
                    </div>
                </div>
                <div class="row">
                    <div class="col-25">
                        <label for="upass">Password</label>
                    </div>
                    <div class="col-75">
                        <input type="password" name="upass" placeholder="Password">
                    </div>
                </div>
                <div class="row">
                    <input type="submit" value="Login">
                </div>
            </form>
        </div>
    </body>
</html>