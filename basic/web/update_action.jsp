<%-- 
    Document   : update_action.jsp
    Created on : Feb 28, 2019, 9:19:19 AM
    Author     : SDF-ITD
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process</title>
    </head>
    <body>
        <h2>Update Users</h2>
        <%
            String id = request.getParameter("txtid");
            String username = request.getParameter("txtname");
            String email = request.getParameter("txtemail");
            String pwd = request.getParameter("txtpwd");
            String pos = request.getParameter("txtpos");
//            String profile = request.getParameter("txtprofile");
          
//            int image = Integer.parseInt(profile);
            out.println(id+","+username+","+email+","+pwd+","+pos);
            if(id != null){
               
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/myweb";
                    Connection con = DriverManager.getConnection(url,"root","");
                    String sql = "Update user"
                            + "set id=?,username=?,email=?,pwd=?,position=?"
                            + "where id="+id;
                    java.sql.PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, id);
                    ps.setString(2, username);
                    ps.setString(3, email);
                    ps.setString(4, pwd);
                    ps.setString(5, pos);
//                    ps.setString(6, profile);
                    int i = ps.executeUpdate();
                        if(i>0)out.println("User update is successful...");
                        else out.println("User update is fail...");
                    con.close();
                }catch(SQLException ex){
                    request.setAttribute("error", ex);
                    out.print(ex);
                }
            }else {
                out.println("Data is wrong...");
            }
         %>
    </body>
</html>
