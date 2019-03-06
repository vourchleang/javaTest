<%-- 
    Document   : show_profile.jsp
    Created on : Mar 1, 2019, 10:31:15 AM
    Author     : SDF-ITD
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile</title>
    </head>
    <body>
        <h2>Show Profile User</h2>
         <%
             ResultSet rs = null;
             byte[ ]imgdata = null;
             Blob profile = null;
             Connection con = null;
             Statement st = null;
            try {
              
                String id = request.getParameter("id");
//                String profile = request.getParameter("profile");
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/myweb";
                String user = "root";
                String password = "";
                con = DriverManager.getConnection(url, user, password);
                String sql= "Select profile from user where id=?"+id; 
                st = con.createStatement();
                rs = st.executeQuery(sql);
                if(rs.next()){
                   profile = rs.getBlob(id);
                    imgdata = profile.getBytes(1,(int)profile.length());
//                     response.setContentLength(img.length);
//                     response.getOutputStream().write(img);
//                     request.setAttribute ("profile",img);

                }else {
                    out.println("Display Blob Example");
                    out.println("image not found for given id");
                    return;
                
                }  // display the image
                    response.setContentType("Profile/*");
                    OutputStream o = response.getOutputStream();
                    o.write(imgdata);
                    o.flush();
                    o.close();
                } catch (Exception e) {
                    out.println("Unable To Display image");
                    out.println("Image Display Error=" + e.getMessage());
                    return;
                }finally {
                try {
                    rs.close();
                    st.close();
                    con.close();
                   
                }catch(SQLException e){
                    out.print("Error...");
                }
         }
        %>
       
   </body>
</html>
   