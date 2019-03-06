package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <script>\n");
      out.write("var request;\n");
      out.write("function sendInfo()\n");
      out.write("{\n");
      out.write("var v=document.myform.username.value;\n");
      out.write("var url=\"findname.jsp?val=\"+v;\n");
      out.write("if(window.XMLHttpRequest){\n");
      out.write("request=new XMLHttpRequest();\n");
      out.write("}\n");
      out.write("else if(window.ActiveXObject){\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("}\n");
      out.write("try\n");
      out.write("{\n");
      out.write("request.onreadystatechange=getInfo;\n");
      out.write("request.open(\"GET\",url,true);\n");
      out.write("request.send();\n");
      out.write("}\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function getInfo(){\n");
      out.write("if(request.readyState==4){\n");
      out.write("var val=request.responseText;\n");
      out.write("document.getElementById('location').innerHTML=val;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head><body>\n");
      out.write("  \n");
      out.write("<div id=\"main_container\">\n");
      out.write("\t<div class=\"main_content\">\n");
      out.write("    \t<div id=\"header\">\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("        <div class=\"top_center_box\"></div>\n");
      out.write("        <div class=\"center_box\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("            <div id=\"menu_tab\">                                     \n");
      out.write("                    <ul class=\"menu\">                                                                              \n");
      out.write("                         <li><a href=\"home.jsp\" class=\"nav\">Home</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         <li><a href=\"takequiz.jsp\" class=\"nav\">Take Quiz</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         <li><a href=\"ask.jsp\" class=\"nav\">Ask Ques.</a></li>\n");
      out.write("                         <li class=\"divider\"></li>\n");
      out.write("                         \n");
      out.write("\t\t\t\t\t\t <li><a href=\"makequiz.jsp\" class=\"nav\">Make quiz</a></li> \n");
      out.write("\t\t\t\t\t\t <li class=\"divider\"></li>\n");
      out.write("<li><a href=\"contact.html\" class=\"nav\">Contact</a></li>\n");
      out.write("<li class=\"divider\"></li>\n");
      out.write(" <li><a href=\"register.jsp\" class=\"nav\">Registration</a></li>\n");
      out.write("                         \t   \n");
      out.write("                         \t \n");
      out.write("                    </ul>\n");
      out.write("            </div> \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <div class=\"middle_box\">\n");
      out.write("            \t<div class=\"middle_box_text_content\">\n");
      out.write("                \t<div class=\"middle_box_title\"></div>\n");
      out.write("                    <p class=\"middle_text\">\n");
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"left_content\">\n");
      out.write("            \n");
      out.write("            \t<div class=\"calendar_box\">\n");
      out.write("            \t\n");
      out.write("                \t<div class=\"calendar_box_content1\">\n");
      out.write("                \t\n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\n");
      out.write("                \t\t   <p><div id=\"location\"></div>\n");
      out.write("                \t\t<form method=\"post\" action=\"registerprocess.jsp\" name=\"myform\" >\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr><td style=\"color:navy;\"><B>Registration</B></td></tr>\n");
      out.write("\t\t\t\t\t<tr><td>User Name:</td><td><input type=\"text\" name=\"username\" onkeyup=\"sendInfo()\"/></td></tr>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr><td>Password:</td><td><input type=\"password\" name=\"userpass\"/></td></tr>\n");
      out.write("\t\t\t\t\t<tr><td>Category:</td><td><select name=\"category\">\n");
      out.write("\t\t\t\t\t<option>Select a Category</option>\n");
      out.write("\t\t\t\t\t<option>Teacher</option>\n");
      out.write("\t\t\t\t\t<option>Student</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</td></tr>\n");
      out.write("\t\t\t\t\t<tr><td>Email:</td><td><input type=\"text\" name=\"email\"/></td></tr>\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr><td>      </td>\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"Register\"></td></tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("                     </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                \t</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("             <div class=\"news_left\">\n");
      out.write("                <h1>Latest News</h1>\n");
      out.write("                \t<div class=\"news_box\">\n");
      out.write("                    \t<div class=\"calendar\">23</div>\n");
      out.write("                        <div class=\"news_content\">\n");
      out.write("\t\t\t\t\t\t<p><span></span>\n");
      out.write("\t\t\t\t\t\tnow learn  how to develop android application free of cost</p><br>\n");
      out.write("                        <a href=\"www.javatpoint.com\" class=\"read_more\">read more</a>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                \t<div class=\"news_box\">\n");
      out.write("                    \t<div class=\"calendar\">23</div>\n");
      out.write("                        <div class=\"news_content\">\n");
      out.write("\t\t\t\t\t\t<p><span></span>\n");
      out.write("\t\t\t\t\t\twe have latest projects uploaded on my site</p>\n");
      out.write("                        <a href=\"www.cstpoint.com\" class=\"read_more\">read more</a>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <!--end of left content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"right_content\">\n");
      out.write("            \n");
      out.write("         \n");
      out.write("                <h1>Latest Projects</h1>\n");
      out.write("                \n");
      out.write("                <div class=\"project_box\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/p1.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\n");
      out.write("                    <p>\n");
      out.write("                    <span> Description:</span><br>\n");
      out.write("                    Payment billing System\n");
      out.write("                    Online Quiz<br>\n");
      out.write("                    Matrimonial\n");
      out.write("                    \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"project_box\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/p2.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\n");
      out.write("                    <p>\n");
      out.write("                    <span> Description:</span><br>\n");
      out.write("                    \n");
      out.write("                  \t\tGmail Account<br>\n");
      out.write("                  \t\tLatest Quiz\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div>\n");
      out.write("                \n");
      out.write("              <h1 ><br>Our main Services</h1>          \n");
      out.write(" </div>                   \n");
      out.write("                  <div class=\"services\">\n");
      out.write("                    <ul>                                        \n");
      out.write("                       <li><a href=\"www.javatpoint.com\">Java tutorial</a></li>\n");
      out.write("                       <li><a href=\"www.cstpoint.com\">CSE tutorial</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"services\">\n");
      out.write("                    <ul>                                        \n");
      out.write("                       <li><a href=\"www.javatpoint.com\">Java tutorial</a></li>\n");
      out.write("                       <li><a href=\"www.cstpoint.com\">CSE tutorial</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>  \n");
      out.write("                   \n");
      out.write("            \n");
      out.write("            </div><!--end of right content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div> <!--end of center box-->\n");
      out.write("\t</div> <!--end of main content-->\n");
      out.write("</div> <!--end of main container-->\n");
      out.write("        \n");
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
