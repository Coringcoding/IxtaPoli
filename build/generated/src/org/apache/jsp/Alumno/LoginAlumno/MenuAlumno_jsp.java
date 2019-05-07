package org.apache.jsp.Alumno.LoginAlumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("         <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\r\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/actividades.css\">\r\n");
      out.write("         <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\r\n");
      out.write("         \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <nav>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Ixtapoli Virtual</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("        <ul id=\"slide-out\" class=\"sidenav\" style=\"background-color:#4F011F\">\r\n");
      out.write("            <li><div class=\"user-view\">\r\n");
      out.write("              <div class=\"background\">\r\n");
      out.write("                <img src=\"fondoSideNav\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <img src=\"images/yuna.jpg\">\r\n");
      out.write("              <span class=\"white-text name\">Usuario</span>\r\n");
      out.write("              <a href=\"#email\"><span class=\"white-text\">Ver mi Informacion</span></a>\r\n");
      out.write("            </div></li>\r\n");
      out.write("            <li><a href=\"#!\" class=\"white-text\"><i class=\"material-icons white-text\">insert_drive_file</i>Solicitudes de Equipos</a></li>\r\n");
      out.write("            <li><div class=\"divider\"></div></li>\r\n");
      out.write("            <li><a href=\"#!\" class=\"white-text\"><i class=\"material-icons white-text\">message</i>Mensajes</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("        <div class=\"row\" id=\"imagenes\">\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"../../Alumno/Calendario/Calendario.jsp\">\r\n");
      out.write("            <div id=\"cartas\" class=\"col s3\" style=\"background-color:white \">\r\n");
      out.write("                <img class=\"responsive-img\" src=\"../../img/calendario.jpg\" alt=\"\">\r\n");
      out.write("                Calendario\r\n");
      out.write("            </div></a>\r\n");
      out.write("           \r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("              <div id=\"cartas\" class=\"col s3 offset-s1\">\r\n");
      out.write("                    <img class=\"responsive-img\" src=\"../../img/equipos.jpg\" alt=\"\">\r\n");
      out.write("                    Equipos de Actividades            \r\n");
      out.write("              </div></a>\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"../Recorrido/SeguimientoRecorrido.jsp\">\r\n");
      out.write("                <div id=\"cartas\" class=\"col s3 offset-s1\">\r\n");
      out.write("                    <img class=\"responsive-img\" src=\"../../img/recorrido.jpg\" alt=\"\">\r\n");
      out.write("                Seguimiento de Recorrido\r\n");
      out.write("                </div></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col s8\">\r\n");
      out.write("                <h6 class=\"white-text\">GIEB Projects</h6>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\"col s4\">\r\n");
      out.write("                    <a href=\"../../Coordinador/Reportes/GenerarReporte.jsp\"><h6>Coordinador: Generar Reporte</h6></a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         <script src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("         <script src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("         <script>\r\n");
      out.write("             $(document).ready(function(){\r\n");
      out.write("                $('.sidenav').sidenav();\r\n");
      out.write("                });\r\n");
      out.write("        \r\n");
      out.write("         </script>\r\n");
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
