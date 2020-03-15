package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import beans.*;
import daos.NewsDao;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/ico\" href=\"assets/images/c2.ico\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("         \n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"assets/css/shop-homepage.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("            <style>\n");
      out.write("                /* #grad\n");
      out.write("                 {\n");
      out.write("                     height: \"100%\";\n");
      out.write("                     background-color:#6633ff;\n");
      out.write("                     background-image: linear-gradient(purple,yellow);\n");
      out.write("                 }*/\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <!-- Navigation -->\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                    <!-- /.col-lg-3 -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-9\">\n");
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "crousel.jsp", out, false);
      out.write("\n");
      out.write("                        <div class=\"row\" id=\"livenews\">\n");
      out.write("\n");
      out.write("                        ");

                            NewsDao ndo = new NewsDao();
                            int start = request.getParameter("start") != null ? Integer.parseInt(request.getParameter("start")) : 0;
                            int end = 3;
                             int total = ndo.getRecordCount();
                            ArrayList<News> rows = new ArrayList();
                            String cat_id = request.getParameter("cat_id");
                            if (cat_id == null || cat_id.equals("")) {
                                rows = ndo.getNewsByLimit(start, end,"approved");
                            } else {
                                rows = ndo.getNewsByCategory(cat_id,"approved");
                                }
                                
                                for (News news : rows) {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                            <div class=\"card h-100\">\n");
      out.write("\n");
      out.write("                                <a href=\"#\"><img class=\"card-img-top\" src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"></a>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4 class=\"card-title\">\n");
      out.write("                                        <a href=\"#\">");
      out.print(news.getTitle());
      out.write("</a> \n");
      out.write("                                    </h4>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    String description = news.getDescription().trim();
                                    if (description.length() > 100) {
                                        description = description.substring(0, 100);
                                    }
                                    System.out.println("news id:"+news.getId());
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <p class=\"card-text\">");
      out.print(description);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"card-footer\">\n");
      out.write("                                    <small class=\"text-muted\"> <a href=\"detailNews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"btn btn-primary\"> View More </a>\n");
      out.write("                                    </small>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");
}
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-9 -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    <center>\n");
      out.write("        ");

            int pages = total / end + (total % end == 0 ? 0 : 1);
            for (int i = 0; i < pages; i++) {
      out.write("\n");
      out.write("        <span style=\"text-decoration: none; align-content: center;  ");
 if (Math.floor(start / end) == i) {
                out.println("background-color: orange");
            }
      out.write("\" class=\"btn btn-dark\"><a href=\"home.jsp?start=");
      out.print(end * i);
      out.write("\">Page ");
      out.print(i + 1);
      out.write("</a></span> \n");
      out.write("        ");
}
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <span style=\"float:left\"><a href=\"home.jsp?start=");
      out.print(start - end);
      out.write("\" class=\"btn btn-primary ");
 if (start == 0) {
            out.println(" disabled");
        }
      out.write(" \">PREVIOUS</a></span>\n");
      out.write("\n");
      out.write("    <span style=\"float:right\"><a href=\"home.jsp?start=");
      out.print(start + end);
      out.write("\" class=\"btn btn-primary ");
 if (start + end >= total) {
                    out.println(" disabled");
                }
      out.write(" \">NEXT</a></span>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("     <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    \n");
      out.write("      <script>\n");
      out.write("            \n");
      out.write("           $(\"#search\").click(function (){\n");
      out.write("                $(\"#livenews\").html(\"\");\n");
      out.write("            $.get(\"http://newsapi.org/v2/everything?q=\"+$(\"#keyword\").val() +\"&from=2020-03-03&to=2020-03-03&sortBy=popularity&apiKey=d031a2a296bf47d19d674f0a51e8d02f\",function (responseText){\n");
      out.write("                   news =  responseText;\n");
      out.write("                   articles = news.articles;\n");
      out.write("                  // alert(articles[0].title);\n");
      out.write("                   for(i=0;i<articles.length;i++)\n");
      out.write("                   {\n");
      out.write("                       \n");
      out.write("                        article = '<div class=\"col-lg-4 col-md-6 mb-4\">\\\n");
      out.write("                            <div class=\"card h-100\">\\\n");
      out.write("                                <div id=\"grad\">\\\n");
      out.write("                                <a href=\"#\"><img class=\"card-img-top\" src=\"'+articles[i].urlToImage +'\" alt=\"\"></a>'+\n");
      out.write("                               ' <div class=\"card-body\">'+\n");
      out.write("                                   ' <h4 class=\"card-title\">'+\n");
      out.write("                                       ' <a href=\"#\">' + articles[i].title + '</a>'+ \n");
      out.write("                                   ' </h4>'+\n");
      out.write("                                ' </div> '+\n");
      out.write("                                  '  <p class=\"card-text\">' + articles[i].description+ ' </p>\\\n");
      out.write("                                </div>\\\n");
      out.write("                                <div id=\"grad\">\\\n");
      out.write("                                <div class=\"card-footer\">\\\n");
      out.write("                                    <small class=\"text-muted\"> <a href=\"' + articles[i].url+ '\" class=\"btn btn-primary\"> View More </a>\\\n");
      out.write("                                    </small>\\\n");
      out.write("                                </div>\\\n");
      out.write("                            </div>\\\n");
      out.write("                            </div>\\\n");
      out.write("                        </div>';\n");
      out.write("                            $(\"#livenews\").append(article);\n");
      out.write("                        }\n");
      out.write("                });\n");
      out.write("           });\n");
      out.write("         \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("    ");
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
