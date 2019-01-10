<%-- 
    Document   : logout
    Created on : Apr 22, 2018, 8:01:01 PM
    Author     : RAJESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                session.setAttribute("user", null);
                response.sendRedirect("index.jsp");
        %>
    </body>
</html>
