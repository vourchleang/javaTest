/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SDF-ITD
 */
public class RegistrationController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String name = request.getParameter("fullname");
  String username = request.getParameter("userName");
  String pass = request.getParameter("pass");
  String addr = request.getParameter("address");
  String age = request.getParameter("age");
  String qual = request.getParameter("qual");
  String percent = request.getParameter("percent");
  String year = request.getParameter("yop");

  // validate given input
  if (name.isEmpty() || addr.isEmpty() || age.isEmpty() || qual.isEmpty() || percent.isEmpty() || year.isEmpty()) {
   RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
   out.println("<font color=red>Please fill all the fields</font>");
   rd.include(request, response);
  } else {
   try{
    Class.forName("com.mysql.jdbc.Driver");
    // loads mysql driver

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myweb", "root", ""); 

    String query = "insert into test values(?,?,?,?,?,?,?,?)";

    PreparedStatement ps = con.prepareStatement(query); // generates sql query

    ps.setString(1, name);
    ps.setString(2, username);
    ps.setString(3, pass);
    ps.setString(4, addr);
    ps.setInt(5, Integer.parseInt(age));
    ps.setString(6, qual);
    ps.setString(7, percent);
    ps.setString(8, year);

    ps.executeUpdate(); // execute it on test database
    System.out.println("successfuly inserted");
    ps.close();
    con.close();
   } catch (ClassNotFoundException | SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
   rd.forward(request, response);
  }
 }

}
