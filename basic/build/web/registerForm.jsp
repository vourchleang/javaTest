<%-- 
    Document   : registerForm
    Created on : Feb 25, 2019, 10:46:36 AM
    Author     : SDF-ITD
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP</title>
    </head>
    <body>
       
        <div class="wrap">
             <h3>Register Form</h3>
             <form action="connection" method="POST" enctype="multipart/form-data">
            <label>UserID : </label><input type="text" name="txtid" value="" /><br/>
            <label>UserName : </label><input type="text" name="txtusrname" value="" /><br/>
            <label>Email :</label> <input type="text" name="txtemail" value="" /><br/>
            <label>Password : </label><input type="password" name="txtpwd" value="" /><br/>
            <label>Position : </label><input type="text" name="txtpos" value="" /><br/>
            <label>Picture : </label><input type="file" name="txtpic" value="" size="30" /><br/>
            <input type="submit" value="Register" />
        </form>
        </div>
        
    </body>
</html>
