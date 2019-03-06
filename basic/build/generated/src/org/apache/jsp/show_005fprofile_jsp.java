package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.io.OutputStream;
import java.sql.SQLException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class show_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Show Profile User</h2>\n");
      out.write("         ");

             ResultSet rs = null;
             byte[ ]imgdata = null;
             Blob image = null;
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
                   image = rs.getBlob(id);
                    imgdata = image.getBytes(1,(int)image.length());
//                     response.setContentLength(img.length);
//                     response.getOutputStream().write(img);
//                     request.setAttribute ("profile",img);

                }else {
                    out.println("Display Blob Example");
                    out.println("image not found for given id>");
                    return;
                
                }  // display the image
                    response.setContentType("image/*");
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
        
      out.write("\n");
      out.write("       \n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("   ");
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
