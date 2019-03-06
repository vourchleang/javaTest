<%-- 
    Document   : search.jsp
    Created on : Mar 6, 2019, 8:14:14 AM
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
        <title>Search</title>
    </head>
    <body>
        <div class="view">
        <h3>Veiw Users</h3>
        <h4><a href="registerForm.jsp">Add Value</a></h4>
        <table border ="1" class="table">
                <td>UserID</td>
                <td>UserName</td>
                <td>Email</td>
                <td>Password</td>
                <td>Position</td>
                <td>Profile</td>
                <td>Update</td>
                <td>Delete</td>
            </tr>
        <%
            String search = request.getParameter("txtsearch");
            String id = request.getParameter("id");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/myweb";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                String query = "Select * from user where id='"+search+"' ";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
          %>    
          <tr>
              <td><%= rs.getString("id") %></td>
              <td><%= rs.getString("username") %></td>
              <td><%= rs.getString("email") %></td>
              <td><%= rs.getString("pwd") %></td>
              <td><%= rs.getString("position") %></td>
              
              <td><a href="show_profile.jsp?id=<%= rs.getString("id") %>">Show Profile</td>
              <td><a href="update.jsp?id=<%= rs.getString("id") %>">Update</a></td>
              <td><a href="delete.jsp?id=<%= rs.getString("id") %>">Delete</a></td>
          </tr>
          <%    
                }
                 con.close();
                
            }catch(Exception e){
                out.print("Something went wrong ...");
            }
        %>
        </table>
        </div>
    </body>
</html>
