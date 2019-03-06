/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author SDF-ITD
 */
public class connection extends HttpServlet{
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
         
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         String id = request.getParameter("txtid");
         String username = request.getParameter("txtusrname");
         String email = request.getParameter("txtemail");
         String pwd = request.getParameter("txtpwd");
         String position = request.getParameter("txtpos");
         String image = request.getParameter("txtpic");
    //         out.print(id+username+email+pwd+position+image);
         
            if(id.isEmpty()||username.isEmpty()||email.isEmpty()||pwd.isEmpty()||position.isEmpty()||image.isEmpty()){
                RequestDispatcher rd = request.getRequestDispatcher("registerForm.jsp");
                out.println("<font color=red>Please fill all the fields</font>");
                rd.include(request, response);

            }else { 
               try {
                Connection con;
                //file image
                 File img = new File(image);
                FileInputStream profile = new FileInputStream(img);
                String url = "jdbc:mysql://localhost:3306/myweb";
                String user = "root";
                String password = "";
            
                Class.forName("com.mysql.jdbc.Driver");
                  
                con = DriverManager.getConnection(url,user,password);
                  
                PreparedStatement ps = con.prepareStatement("insert into user value(?,?,?,?,?,?)");
                    ps.setString(1, id);
                    ps.setString(2, username);
                    ps.setString(3, email);
                    ps.setString(4, pwd);
                    ps.setString(5, position);
                     //insert image
                    profile = new FileInputStream(img);
                    ps.setBinaryStream(6, profile);
                    
                    ps.executeUpdate();
                    
                    ps.close();
                    con.close();
                    System.out.println("successfuly inserted");
             } catch (ClassNotFoundException | SQLException ex) {
                 ex.printStackTrace();
             }
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response); 
    }
}
    }
