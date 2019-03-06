<%-- 
    Document   : image
    Created on : Mar 6, 2019, 8:25:51 AM
    Author     : SDF-ITD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image</title>
    </head>
    <body>
        <form  enctype="multipart/form-data">
            <input type="file" name="file" value="" size="30"/>
        <input type="submit" value="upload" />
        </form>
        <%
             String file = request.getParameter("file");
             
        %>
    </body>
</html>
