package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daos.QueryDao;
import java.sql.*;
import java.util.ArrayList;
import daos.NewsDao;
import daos.SubscribersDao;
import beans.Subscribers;
import beans.News;
import beans.Reporter;
import daos.ReporterDao;

public final class updateReporterStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        if(session.getAttribute("admin")==null)
        {
            response.sendRedirect("../newsLogin.jsp");
            return;
        }
        
     
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
      out.write("          <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"><i class=\"fas fa-download fa-sm text-white-50\"></i> Generate Report</a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row table-responsive\" >\n");
      out.write("                \n");
      out.write("              ");

                                    String op = request.getParameter("op");
                                    System.out.println("op:"+op);
                                    if(op==null || op.equals("")){
                                        
                                            if(request.getParameter("submit")!=null){
                                              ReporterDao rd=new ReporterDao();
                                                String check_ids[] = request.getParameterValues("check");
                                                String status[] = new String[check_ids.length];
                                                int index=0;
                                                for(String s : check_ids){
                                                    status[index++] = request.getParameter("status"+s);
                                                }
                                            if(rd.updateStatus(check_ids, status)){
                                                response.sendRedirect("dashboard.jsp");
                                                return;
                                            }
                                                
                                            }
                             

                                
      out.write("\n");
      out.write("                                        <form method=\"post\">\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Name</td><td>current status</td><td>Action</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                       ");
 ReporterDao rd = new ReporterDao();
                                        ArrayList<Reporter> repo = rd.getAllRecords();
                                        for(Reporter r : repo){
                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                            <input type=\"hidden\" name=\"ids\"id=\"ids\"/>\n");
      out.write("                                                <td>");
      out.print(r.getName());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(r.getStatus());
      out.write("</td>\n");
      out.write("                                                <td><input type=\"radio\" name=\"status");
      out.print(r.getId());
      out.write("\" id=\"s1\" value=\"reject\">reject\n");
      out.write("                                                    <input type=\"radio\" name=\"status");
      out.print(r.getId());
      out.write("\" id=\"s2\" value=\"block\">block</td>\n");
      out.write("                                                <td><input type=\"checkbox\" name=\"check\" value=\"");
      out.print(r.getId());
      out.write("\"></td>\n");
      out.write("                                \n");
      out.write("                                            </tr>   \n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("                                    <input type=\"submit\" name=\"submit\" value=\"submit\">\n");
      out.write("                                        </form>\n");
      out.write("                                        \n");
      out.write("                                     \n");
      out.write("                                  \n");
      out.write("                                ");
}     
                                
      out.write("\n");
      out.write("                                  \n");
      out.write("                                    \n");
      out.write("                              \n");
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
