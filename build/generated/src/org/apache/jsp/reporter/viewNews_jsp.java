package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import daos.ReporterDao;
import java.sql.*;
import daos.NewsDao;
import beans.*;
import java.util.ArrayList;

public final class viewNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                function submitForm() {\n");
      out.write("                    document.getElementById(\"f1\").submit();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.4/examples/dashboard/\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <!-- Favicons -->\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"/docs/4.4/assets/img/favicons/apple-touch-icon.png\" sizes=\"180x180\">\n");
      out.write("<link rel=\"icon\" href=\"/docs/4.4/assets/img/favicons/favicon-32x32.png\" sizes=\"32x32\" type=\"image/png\">\n");
      out.write("<link rel=\"icon\" href=\"/docs/4.4/assets/img/favicons/favicon-16x16.png\" sizes=\"16x16\" type=\"image/png\">\n");
      out.write("<link rel=\"manifest\" href=\"/docs/4.4/assets/img/favicons/manifest.json\">\n");
      out.write("<link rel=\"mask-icon\" href=\"/docs/4.4/assets/img/favicons/safari-pinned-tab.svg\" color=\"#563d7c\">\n");
      out.write("<link rel=\"icon\" href=\"/docs/4.4/assets/img/favicons/favicon.ico\">\n");
      out.write("<meta name=\"msapplication-config\" content=\"/docs/4.4/assets/img/favicons/browserconfig.xml\">\n");
      out.write("<meta name=\"theme-color\" content=\"#563d7c\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        -ms-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("      ");

          if(session.getAttribute("reporter")==null){
              response.sendRedirect("../newsLogin.jsp");
              return;
          }
      
      out.write("\n");
      out.write("     \n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("      \n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("    <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-4\">\n");
      out.write("      <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\n");
      out.write("         \n");
      out.write("        \n");
      out.write("       \n");
      out.write("            <form id=\"f1\" method=\"get\">\n");
      out.write("                <div class=\"container\"><br><br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      \n");
      out.write("                        <select onchange=\"submitForm();\" name=\"cat_id\" id=\"cat_id\" class=\"dropdown dropdown-header form-control\">\n");
      out.write("                            <option value=\"-1\" >select news category</option>\n");
      out.write("                            <option value=\"\">All News</option>\n");
      out.write("                        ");


                            NewsDao ndo = new NewsDao();
                            ArrayList<NewsCategory> category = new ArrayList();
                            category = ndo.getNewsCategory();
                            for (NewsCategory cat : category) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(cat.getId());
      out.write('"');
      out.write('>');
      out.print(cat.getName());
      out.write("<br/>\n");
      out.write("\n");
      out.write("                        ");
}


                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    ");
                    
                        int start = request.getParameter("start") != null ? Integer.parseInt(request.getParameter("start")) : 0;
                        int end = 3;
                        int total = ndo.getRecordCount();
                        ArrayList<News> rows = new ArrayList();
                         Reporter reporter = (Reporter)session.getAttribute("reporter");
                        String cat_id = request.getParameter("cat_id");
                        if (cat_id == null || cat_id.equals("")) {
                            rows = ndo.getNewsByLimit(start, end, reporter.getId());
                        } else {
                            rows = ndo.getNewsByCategory(cat_id,reporter.getId());
                        }

                        //  System.out.println("rows:"+rows);
                        for (News news : rows) {
      out.write("\n");
      out.write("                    <div class=\"card col col-md-4\">\n");
      out.write("                        <img src=\"../");
      out.print(news.getImage());
      out.write("\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print(news.getTitle());
      out.write("</h5>\n");
      out.write("                            ");

                                String description = news.getDescription().trim();
                                if (description.length() > 100) {
                                    description = description.substring(0, 100);
                                }
                            
      out.write("\n");
      out.write("                            <p class=\"card-text\">");
      out.print(description);
      out.write("</p>\n");
      out.write("                            <a href=\"../detailNews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"btn btn-primary\">view more</a>\n");
      out.write("                            <a href=\"../NewsController?id=");
      out.print(news.getId());
      out.write("&op=delete\" class=\"btn btn-outline-danger\">Delete</a>\n");
      out.write("                            <a href=\"editNews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"btn btn-outline-primary\">update</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("                ");

                    int pages = total / end + (total % end == 0 ? 0 : 1);
                    for (int i = 0; i < pages; i++) {
      out.write("\n");
      out.write("                <span style=\"text-decoration: none; align-content: center;  ");
 if (Math.floor(start / end) == i) {
               out.println("background-color: orange");
           }
      out.write("\" class=\"btn btn-dark\"><a href=\"viewNews.jsp?start=");
      out.print(end * i);
      out.write("\">Page ");
      out.print(i + 1);
      out.write("</a></span> \n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("            </center>\n");
      out.write("            <span style=\"float:left\"><a href=\"viewNews.jsp?start=");
      out.print(start - end);
      out.write("\" class=\"btn btn-primary ");
 if (start == 0) {
              out.println(" disabled");
          }
      out.write(" \">PREVIOUS</a></span>\n");
      out.write("\n");
      out.write("            <span style=\"float:right\"><a href=\"viewNews.jsp?start=");
      out.print(start + end);
      out.write("\" class=\"btn btn-primary ");
 if (start + end >= total) {
                out.println(" disabled");
            }
      out.write(" \">NEXT</a></span>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("   </body>\n");
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
