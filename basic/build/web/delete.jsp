<%-- 
    Document   : delete.jsp
    Created on : Feb 28, 2019, 8:10:22 AM
    Author     : SDF-ITD
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <h3>Delete Users</h3>
        <%
            String id = request.getParameter("id");
            if(id != null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/myweb";
                Connection con = DriverManager.getConnection(url,"root","");
                String sql = "Delete from user where id ="+id;
                PreparedStatement ps = con.prepareStatement(sql);
                int i = ps.executeUpdate(sql);
                    if(i>0)out.println("User Delete is sucessful...");
                    else out.println("User Delete is fail...");
                con.close();
            }catch(Exception ex){
                request.setAttribute("Error", ex);
                out.print(ex);
            }
            }else out.print("Havenot user id in table...");
        %>
    </body>
</html>
