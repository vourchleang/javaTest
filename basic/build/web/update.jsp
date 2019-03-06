<%-- 
    Document   : update.jsp
    Created on : Feb 28, 2019, 8:09:36 AM
    Author     : SDF-ITD
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
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
        <link rel="stylesheet" type="text/css" href="css/view.css">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <%
            String id = request.getParameter("id");
            try {
              Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/myweb";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                String query = "Select * from user where id = "+id;
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
        %>
           <div class="wrap">
            <h2>Update Users</h2>
        <form action="update_action.jsp" method="POST" enctype="multipart/form-data">
             User ID :<input type="text" name="txtid" value="<%= rs.getString("id") %>" /><br/>
             <input type="hidden" name="txtid" value="<%= rs.getString("id") %>" /><br/>
             UserName : <input type="text" name="txtname" value="<%= rs.getString("username") %>" /><br/>
             Email :<input type="text" name="txtemail" value="<%= rs.getString("email") %>" /><br/>
             PassWord : <input type="text" name="txtpwd" value="<%= rs.getString("pwd") %>" /><br/>
             Position : <input type="text" name="txtpos" value="<%= rs.getString("position") %>" /><br/>

            <input type="submit" name="" value="Submit" />
        </form>
        </div>   
        <%
                }
                con.close();
            }catch(Exception e){
                out.println("Something went wrong...");
            }
        %>
    </body>
</html>
