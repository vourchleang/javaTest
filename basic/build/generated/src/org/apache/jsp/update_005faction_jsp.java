package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class update_005faction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Process</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Update Users</h2>\n");
      out.write("        ");

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
         
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
