package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import daos.QueryDao;
import java.sql.*;
import daos.NewsDao;
import daos.SubscribersDao;
import beans.Subscribers;
import beans.News;
import beans.Reporter;
import daos.ReporterDao;

public final class pendingNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>admin dashboard</title>\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  \n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    ");

         NewsDao nd = new NewsDao();
         ArrayList<News> newsList = new ArrayList();
         newsList = nd.getAllNews("pending");
    
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("    <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Topbar -->\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("           \n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row table-responsive\" >\n");
      out.write("                 <table class=\"table\">\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Title</td><td>status</td>\n");
      out.write("                  </tr>\n");
      out.write("                 ");

                 for(News news : newsList){
      out.write("\n");
      out.write("                 <tr><td>");
      out.print(news.getTitle());
      out.write("</td></tr>\n");
      out.write("                 ");
}
                 
      out.write("\n");
      out.write("                 </table>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("             <!-- Earnings (Monthly) Card Example -->\n");
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
