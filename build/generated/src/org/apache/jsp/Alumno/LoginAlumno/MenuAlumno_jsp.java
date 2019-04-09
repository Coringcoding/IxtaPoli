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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/actividades.css\">\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/menuAlumno.css\">\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("       <nav>\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Ixtapoli Virtual</a>\n");
      out.write("      </nav>\n");
      out.write("        <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("        <ul id=\"slide-out\" class=\"sidenav\">\n");
      out.write("            <li><div class=\"user-view\">\n");
      out.write("              <div class=\"background\">\n");
      out.write("                <img src=\"fondoSideNav\">\n");
      out.write("              </div>\n");
      out.write("              <img class=\"circle\" src=\"images/yuna.jpg\">\n");
      out.write("              <span class=\"white-text name\">Usuario</span>\n");
      out.write("              <a href=\"#email\"><span class=\"white-text\">Ver mi Informacion</span></a>\n");
      out.write("            </div></li>\n");
      out.write("            <li><a href=\"#!\" class=\"white-text\"><i class=\"material-icons white-text\">insert_drive_file</i>Solicitudes de Equipos</a></li>\n");
      out.write("            <li><div class=\"divider\"></div></li>\n");
      out.write("            <li><a href=\"#!\" class=\"white-text\"><i class=\"material-icons white-text\">message</i>Mensajes</a></li>\n");
      out.write("          </ul>\n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("        <div class=\"row\" id=\"imagenes\">\n");
      out.write("            \n");
      out.write("            <a href=\"../../Alumno/Calendario/Calendario.jsp\">\n");
      out.write("            <div id=\"calendario\" class=\"col l3\">\n");
      out.write("                    <img class=\"responsive-img\" src=\"../../img/calendario.jpg\" alt=\"\">\n");
      out.write("                Calendario\n");
      out.write("            </div></a>\n");
      out.write("           \n");
      out.write("          <a href=\"../../Coordinador/Actividades/Actividades.jsp\">\n");
      out.write("              <div id=\"faena\" class=\"col l3 offset-l1\">\n");
      out.write("                    <img class=\"responsive-img\" src=\"../../img/equipos.jpg\" alt=\"\">\n");
      out.write("                 Equipos de Actividades            \n");
      out.write("              </div></a>\n");
      out.write("            \n");
      out.write("            <a href=\"\"><div id=\"seguimiento\" class=\"col l3 offset-l1\">\n");
      out.write("                    <img class=\"responsive-img\" src=\"../../img/recorrido.jpg\" alt=\"\">\n");
      out.write("                Seguimiento de Recorrido\n");
      out.write("                </div></a>\n");
      out.write("      </div>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <a href=\"../../Coordinador/Reportes/GenerarReporte.jsp\">Coordinador: Generar Reporte</a>\n");
      out.write("         <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("         <script src=\"../../js/materialize.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("             $(document).ready(function(){\n");
      out.write("                $('.sidenav').sidenav();\n");
      out.write("                });\n");
      out.write("        \n");
      out.write("         </script>\n");
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
