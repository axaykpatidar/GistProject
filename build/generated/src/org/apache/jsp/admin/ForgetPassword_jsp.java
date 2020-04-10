package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ForgetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>forget password</title>\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  \n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("   <script>\n");
      out.write("                function cmpPassword(x, y)\n");
      out.write("                {\n");
      out.write("                    if (x === y)\n");
      out.write("                        return true;\n");
      out.write("                    else {\n");
      out.write("                        alert('password not matched..!');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /* $(\"#sendEmail\").blur(function () {\n");
      out.write("                 $(\"#s1\").load(\"../EmailSender?op=sendEmail&email=\" + $(this).val());\n");
      out.write("                 });*/\n");
      out.write("\n");
      out.write("                function sendOtp(x, y)\n");
      out.write("                {\n");
      out.write("                     ajax = new XMLHttpRequest();\n");
      out.write("                    ajax.open(\"GET\", \"../ReporterController?op=sendotp&email=\" + x, true);\n");
      out.write("                    //alert(x);\n");
      out.write("                    ajax.send();\n");
      out.write("\n");
      out.write("                    ajax.onreadystatechange = function ()\n");
      out.write("                    {\n");
      out.write("                        if (this.readyState == 4 && this.status == 200)\n");
      out.write("                        {\n");
      out.write("\n");
      out.write("                            output = this.responseText;\n");
      out.write("                            //alert('output:'+output);\n");
      out.write("                            y.innerHTML = output;\n");
      out.write("                            document.getElementById(\"otp1\").innerHTML = output;\n");
      out.write("                            //alert(output);\n");
      out.write("                             div1.style.display = 'block';\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                }\n");
      out.write("                function validateOtp(x,y) {\n");
      out.write("                    x=x.trim();\n");
      out.write("                    y=y.trim();\n");
      out.write("                    \n");
      out.write("                    if (x===y)\n");
      out.write("                    {\n");
      out.write("                       // window.location.assign(\"SetNewPassword.jsp\");\n");
      out.write("                       alert(\"matched!\");\n");
      out.write("                    } else {\n");
      out.write("                        alert(\"Invalid Otp\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    ");

         
                          String userid = request.getParameter("userid");
                         System.out.println(userid);
                     
     
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("     <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Topbar -->\n");
      out.write("         <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("          <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Change Password</h1>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("          <!-- Content Row -->\n");
      out.write("             <div>\n");
      out.write("                 <span id=\"otp1\" style=\"visibility: hidden\"></span><br/> \n");
      out.write("                    ");

                    String uid = request.getParameter("userid");
                    System.out.println("userid:"+uid);
                    
      out.write("\n");
      out.write("                    <form class=\"form\" action=\"SetNewPassword.jsp\">\n");
      out.write("                        \n");
      out.write("                        <input type=\"hidden\" name=\"userid\" value=\"");
      out.print(uid);
      out.write("\"><br>\n");
      out.write("                        <input type=\"text\" name=\"email\" id=\"email\" required=\"required\"/> <br/><br>\n");
      out.write("                        <input type=\"button\" value=\"Send OTP\" name=\"otpbtn\" class=\"btn btn-primary\" onclick=\"sendOtp(email.value,s1);\"/><br>\n");
      out.write("                        <span id=\"s1\"> </span><br/>\n");
      out.write("\n");
      out.write("                        <div id=\"div1\" style=\"display: none\">\n");
      out.write("                            Type OTP Here <input type=\"text\" name=\"otp\" id=\"otp\"/> <br/>\n");
      out.write("                            <input type=\"submit\" value=\"submit\" name=\"validate\" class=\"btn btn-primary\" onsubmit=\"validateOtp(otp.value,otp1.innerHTML);\"/>\n");
      out.write("                        </div>\n");
      out.write("                         \n");
      out.write("                    </form>\n");
      out.write("               \n");
      out.write("            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("             </div><!-- Earnings (Monthly) Card Example -->\n");
      out.write("            \n");
      out.write("            <!-- Pending Requests Card Example -->\n");
      out.write("             \n");
      out.write("          <!-- Content Row -->\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Area Chart -->\n");
      out.write("                 <!-- Card Body -->\n");
      out.write("              \n");
      out.write("            <!-- Pie Chart -->\n");
      out.write("                 <!-- Card Body -->\n");
      out.write("              \n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Content Column -->\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\n");
      out.write("\n");
      out.write("              <!-- Project Card Example -->\n");
      out.write("             \n");
      out.write("              <!-- Color System -->\n");
      out.write("               <!-- Illustrations -->\n");
      out.write("               \n");
      out.write("              <!-- Approach -->\n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("      <footer class=\"sticky-footer bg-white\">\n");
      out.write("         \n");
      out.write("      </footer>\n");
      out.write("      <!-- End of Footer -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button-->\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Logout Modal-->\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
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
