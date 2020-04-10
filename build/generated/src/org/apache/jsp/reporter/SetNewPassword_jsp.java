package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Reporter;

public final class SetNewPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#f1\").submit(function (e) {\n");
      out.write("                    x = $(\"#password\").val();\n");
      out.write("                    y = $(\"#cpassword\").val();\n");
      out.write("                    alert(x,y)\n");
      out.write("                    if (x === y)\n");
      out.write("                        return true;\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        alert('password not matched !');\n");
      out.write("                        e.preventDefault();\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        Reporter reporter = (Reporter)session.getAttribute("reporter");
        
      out.write("\n");
      out.write("        <h1>Set New Password</h1>\n");
      out.write("        <form  id=\"f1\" action=\"../ReporterController?op=setPassword\" method=\"post\"> \n");
      out.write("            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <input type=\"password\" placeholder=\"enter new password\" pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\" name=\"password\" id=\"password\" class=\"form-control\"/>\n");
      out.write("             password must contains atleast one lower and 8 char and one special char\n");
      out.write("           <br> <input type=\"password\" placeholder=\"confirm password\" name=\"cpassword\" id=\"cpassword\" class=\"form-control\"  />\n");
      out.write("  \n");
      out.write("    <br><input type=\"submit\" name=\"submit\" class=\"btn btn-primary\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
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
