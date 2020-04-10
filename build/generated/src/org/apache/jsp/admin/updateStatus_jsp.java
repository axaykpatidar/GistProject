package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.News;
import beans.Reporter;
import daos.NewsDao;
import daos.ReporterDao;
import java.util.ArrayList;
import java.sql.*;

public final class updateStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title> Update Status</title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body id=\"page-top\">\n");
      out.write("        ");

            if (session.getAttribute("admin") == null) {
                response.sendRedirect("../newsLogin.jsp");
                return;
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("                <!-- Content Wrapper -->\n");
      out.write("                <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                    <!-- Main Content -->\n");
      out.write("                    <div id=\"content\">\n");
      out.write("\n");
      out.write("                        <!-- Topbar -->\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("                        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                        <!-- Begin Page Content -->\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                            <!-- Page Heading -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                            ");

                                String op = request.getParameter("op");
                                System.out.println("op:" + op);
                                NewsDao nd = new NewsDao();
                                News news = null;
                                if (op != null && op.equalsIgnoreCase("update_status")) {
                                    int newsid = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
                                    news = nd.getById(newsid);
                            
      out.write("\n");
      out.write("                            <div class=\"card col col-md-10\" style=\" text-align: justify;text-justify: inter-word;\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4 class=\"card-title\">");
      out.print(news.getTitle());
      out.write("</h4>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(news.getDescription());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img class=\"card-img-bottom\" src=\"../");
      out.print(news.getImage());
      out.write("\" alt=\"Card image\" style=\"width:20%\">\n");
      out.write("                                <br/><br/>\n");
      out.write("                                <a href=\"");
      out.print(request.getHeader("referer"));
      out.write("\" class=\"btn btn-primary\">Back </a>\n");
      out.write("                                <form method=\"post\">\n");
      out.write("                                    <h4>Change Status </h4>\n");
      out.write("                                    <p><input type=\"radio\" name=\"status\" value=\"Pending\" ");
if (news.getStatus().equals("Pending")) {
                                            out.println(" checked");
                                        } 
      out.write("/>Pending </p>  \n");
      out.write("                                    <p><input type=\"radio\" name=\"status\" value=\"Approved\" ");
if (news.getStatus().equals("Approved")) {
                                            out.println(" checked");
                                        } 
      out.write("/>Approved </p>\n");
      out.write("                                    <p><input type=\"radio\" name=\"status\" value=\"Rejected\" ");
if (news.getStatus().equals("Rejected")) {
                                            out.println(" checked");
                                        } 
      out.write("/>Rejected </p>\n");
      out.write("\n");
      out.write("                                    <p>Reason to Change Status :</p>\n");
      out.write("                                    <p><input type=\"text\" name=\"status_text\" /> </p>\n");
      out.write("                                    <p><input type=\"submit\" name=\"submit\" value=\"Save and Return\" class=\"btn btn-primary form-control\"/></p>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("                    <!-- Footer -->\n");
      out.write("                    <!-- End of Footer -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Scroll to Top Button-->\n");
      out.write("            <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("                <i class=\"fas fa-angle-up\"></i>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Bootstrap core JavaScript-->\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    ");
 if (request.getParameter("submit") != null) {
            nd = new NewsDao();
            if (nd.updateNewsStatus(news.getId(), request.getParameter("status"), request.getParameter("status_text"))) {
                System.out.println("status updated!");
                //response.sendRedirect("AllNews.jsp");
                return;
            }
        }
      out.write("\n");
      out.write("</html>");
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
