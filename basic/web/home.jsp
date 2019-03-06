<%-- 
    Document   : home
    Created on : Feb 27, 2019, 10:22:55 PM
    Author     : vourchleang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="">
            <input type="text" placeholder="first name" name="fname"> <br><br>
            <input type="text" placeholder="last name" name="lname"> <br> <br>
            <input type="submit" value="submit"><br>
        </form>
    <%request.getAttribute("profile"); %>
    </body>
</html>
