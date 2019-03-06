<%-- 
    Document   : validation_page
    Created on : Feb 27, 2019, 9:47:13 PM
    Author     : vourchleang
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation Page</title>
    </head>
    <body>
        <%
            try{
                String email = request.getParameter("txtemail");
                String pwd = request.getParameter("txtpwd");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myweb","root","");
                    PreparedStatement ps = con.prepareStatement("Select * from user where email=? and pwd=?");
                    ps.setString(1, email);
                    ps.setString(2, pwd);
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        System.out.print("Successful...");
                        RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                        rd.forward(request, response); 
                    } 
                    else out.println("Invalid login credentials<br/>Please try again...");
                
            }catch(Exception e){
                out.println("Something went wrong !! Please try again");
            }
        %>
    </body>
</html>
