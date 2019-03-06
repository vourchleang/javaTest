<%-- 
    Document   : home
    Created on : Feb 27, 2019, 10:13:12 AM
    Author     : SDF-ITD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>Login</title>
    </head>
    <body>
        <div class="wrap">
            <form action="validation_page.jsp" method="POST">
            <h2>User Login</h2>
            Email :    <input type="text" name="txtemail" value="" placeholder="your email" required/><br/>
            Password : <input type="password" name="txtpwd" value="" placeholder="your password" required/><br/>
            <input type="submit" value="Login" />
        </form>
    </div>
    </body>
</html>
