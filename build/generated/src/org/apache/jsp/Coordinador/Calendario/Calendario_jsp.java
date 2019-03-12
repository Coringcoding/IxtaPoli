package org.apache.jsp.Coordinador.Calendario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ixtapoli.impDao.alumnoImpDao;

public final class Calendario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
alumnoImpDao alumno = new alumnoImpDao(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/fullcalendar.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/calendario.css\">\r\n");
      out.write("        <title>Calendario</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Calendario de Actividades</a>\r\n");
      out.write("      </nav>\r\n");
      out.write("        <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("        <ul id=\"slide-out\" class=\"sidenav\">\r\n");
      out.write("            <li><div class=\"user-view\">\r\n");
      out.write("              <div class=\"background\">\r\n");
      out.write("                <img src=\"fondoSideNav\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <img class=\"circle\" src=\"images/yuna.jpg\">\r\n");
      out.write("              <span class=\"white-text name\">Usuario</span>\r\n");
      out.write("              <a href=\"#email\"><span class=\"white-text\">Ver mi Informacion</span></a>\r\n");
      out.write("            </div></li>\r\n");
      out.write("            <li><a href=\"#!\" class=\"white-text\"><i class=\"material-icons white-text\">insert_drive_file</i>Equipos</a></li>\r\n");
      out.write("            <li><div class=\"divider\"></div></li>\r\n");
      out.write("            <li><a href=\"#!\" class=\"white-text\"><i class=\"material-icons white-text\">message</i>Mensajes</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("            <div id=\"calendar\"></div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Modal Structure -->\r\n");
      out.write("            <div id=\"modal\" class=\"modal modal-fixed-footer\"><!-- bottom-sheet -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                  <h3 id=\"title\"></h3>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                      <p id=\"fecha\" class=\"col l6\"></p>\r\n");
      out.write("                      <p id=\"hora\" class=\"col l6\"></p>\r\n");
      out.write("                      <p class=\"col l4\">\r\n");
      out.write("                          Descripción\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <textarea id=\"descripcion\" readonly class=\"col l8\"></textarea>\r\n");
      out.write("                      <p id=\"ubicacion\" class=\"col l6\"></p>\r\n");
      out.write("                      <p id=\"materiales\" class=\"col l6\"></p>\r\n");
      out.write("                      <p id=\"cupo\" class=\"col l6\"></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("              <div class=\"modal-footer\">\r\n");
      out.write("                      <a href=\"#!\" class=\"modal-close waves-effect waves-red btn-flat col l12\" id=\"cerrar\">Aceptar</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/fullcalendar.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/es.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("          function even(calEvent, jsEvent, view){\r\n");
      out.write("              var elem= document.getElementById(\"modal\");\r\n");
      out.write("                var instance = M.Modal.init(elem);\r\n");
      out.write("                instance.open();\r\n");
      out.write("                $(\"#title\").text(\"Faena: \" + calEvent.title); \r\n");
      out.write("                $(\"#fecha\").text(\"Fecha: \"+calEvent.fecha);\r\n");
      out.write("                $(\"#hora\").text(\"Hora: \"+calEvent.hora);\r\n");
      out.write("                $(\"#descripcion\").text(calEvent.descripcion);\r\n");
      out.write("                $(\"#ubicacion\").text(\"Ubicacion: \"+calEvent.ubicacion);\r\n");
      out.write("                $(\"#materiales\").text(\"Materiales: \"+calEvent.materiales);\r\n");
      out.write("                $(\"#cupo\").text(\"Alumnos por Equipo: \"+calEvent.cupo);\r\n");
      out.write("          }  \r\n");
      out.write("        </script>\r\n");
      out.write("        ");

            out.print(alumno.verCalendario());
        
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("            $('.modal').modal();\r\n");
      out.write("            $(\".fc-prev-button, .fc-next-button\").attr('class', 'waves-effect waves-light btn red darken-4 btn-flat');\r\n");
      out.write("            $(\"#calendar\").fullCalendar(\"option\", \"contentHeight\",400);\r\n");
      out.write("            $('.sidenav').sidenav();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
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
