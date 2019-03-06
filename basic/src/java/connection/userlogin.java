/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SDF-ITD
 */
public class userlogin extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        resp.setContentType("text/html");
        String email = req.getParameter("txtemail");
        String pwd = req.getParameter("txtpwd");
            if(email.isEmpty()|| pwd.isEmpty()){
                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                out.println("<font color = red> Please fill all the fields</font>");
                rd.include(req, resp);
            }
    }
        
}
//RequestDispatcher rd = request.getRequestDispatcher("registerForm.jsp");
//                out.println("<font color=red>Please fill all the fields</font>");
//                rd.include(request, response);