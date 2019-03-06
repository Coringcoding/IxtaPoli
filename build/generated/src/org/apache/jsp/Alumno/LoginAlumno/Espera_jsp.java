package org.apache.jsp.Alumno.LoginAlumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Espera_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>    \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">     \r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/loginAdministrador.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>En espera</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>        \r\n");
      out.write("        <div class=\"espacio3\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col l12\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"degradado card-content white-text\">\r\n");
      out.write("                            <span class=\"card-title\"><h1 class=\"center-align white-text\">En Espera</h1></span>\r\n");
      out.write("                            <p class=\"center-align\">En estos momentos su solicitud esta en espera de ser revisada\r\n");
      out.write("                            y aceptada por alguno de los Administradores de IxtaPoli. Gracias por su\r\n");
      out.write("                            comprensión.</p>\r\n");
      out.write("                            <div class=\"center-align\">\r\n");
      out.write("                                <img class=\"responsive-img img1\" src=\"../../img/ixtapoliVirtual.png\">                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"LoginAlumno.jsp\" class=\"btn waves-effect waves-light red darken-4 col l6  offset-l2\" type=\"submit\" name=\"action\">\r\n");
      out.write("                            Regresar<i class=\"material-icons right\">arrow_back</i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <p class=\"right-align\">Atte. Equipo de Ixtapoli</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
