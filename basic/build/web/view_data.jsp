<%-- 
    Document   : update_user
    Created on : Feb 27, 2019, 11:36:13 PM
    Author     : vourchleang
--%>

<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/style.css"/>
        <title>Update</title>
    </head>
    <body>
        <div class="view">
        <h3>Veiw Users</h3>
        <h4><a href="registerForm.jsp">Add Value</a></h4>
        <input type="search" name="txtsearch" value="" placeholder="Search" class="search" />
        <a href="search.jsp">Find</a>
        
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
            out.print(search);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/myweb";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                
              
                String query = "Select * from user";
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
