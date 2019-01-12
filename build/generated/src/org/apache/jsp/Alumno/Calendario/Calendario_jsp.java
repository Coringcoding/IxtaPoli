package org.apache.jsp.Alumno.Calendario;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
alumnoImpDao alumno = new alumnoImpDao(); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/fullcalendar.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/calendario.css\">\n");
      out.write("        <title>Calendario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"#7cb342 light-green darken-1\" style=\"margin: 0 0 0;\">\n");
      out.write("               <div class=\"nav-wrapper\">\n");
      out.write("                   <a href=\"#\"  class=\"brand-logo center\" style=\"width:500px;\">[Ixtapoli]</a> \n");
      out.write("                        <ul class=\"left hide-on-med-and-down\">\n");
      out.write("                                 <li><a href=\"sass.html\"><i class=\"material-icons\">menu</i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                   <ul class=\"right hide-on-med-and-down\" style=\"margin: 0 150px 0 0;\">\n");
      out.write("                            <!--    <li> <i class=\"material-icons\">search</i> </li>\n");
      out.write("                            <li> <input id=\"search\" type=\"text\" class=\"validate\"></li> -->\n");
      out.write("                     <div class=\"input-field col s6\">\n");
      out.write("                          <i class=\"material-icons prefix\">search</i> \n");
      out.write("                          <input id=\"search\" type=\"text\" class=\"validate\">  \n");
      out.write("                          <label for=\"search\" class=\"white-text\">Nombre del Alumno</label>   \n");
      out.write("                     </div>\n");
      out.write("                   </ul>\n");
      out.write("               </div> \n");
      out.write("            </div>   \n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("            <div id=\"calendar\"></div>\n");
      out.write("            \n");
      out.write("            <!-- Modal Structure -->\n");
      out.write("            <div id=\"modal\" class=\"modal modal-fixed-footer\">\n");
      out.write("              <div class=\"modal-content\">\n");
      out.write("                  <h4 id=\"title\"></h4>\n");
      out.write("                  <p id=\"fecha\"></p>\n");
      out.write("                  <p id=\"hora\"></p>\n");
      out.write("                  <textarea id=\"descripcion\"></textarea>\n");
      out.write("                  <p id=\"ubicacion\"></p>\n");
      out.write("                  <p id=\"materiales\"></p>\n");
      out.write("                  <p id=\"cupo\"></p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <a href=\"#!\" class=\"modal-close waves-effect waves-red btn-flat\">Agree</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"../../js/moment.min.js\"></script>\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\n");
      out.write("        <script src=\"../../js/fullcalendar.min.js\"></script>\n");
      out.write("        <script src=\"../../js/es.js\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("          function even(calEvent, jsEvent, view){\n");
      out.write("              var elem= document.getElementById(\"modal\");\n");
      out.write("                var instance = M.Modal.init(elem);\n");
      out.write("                instance.open();\n");
      out.write("                $(\"#title\").text(\"Nombre de la Faena: \" + calEvent.title); \n");
      out.write("                $(\"#fecha\").text(\"Fecha: \"+calEvent.fecha);\n");
      out.write("                $(\"#hora\").text(\"Hora: \"+calEvent.hora);\n");
      out.write("                $(\"#descripcion\").text(\"Descripcion: \" + calEvent.descripcion);\n");
      out.write("                $(\"#ubicacion\").text(\"Ubicacion: \"+calEvent.ubicacion);\n");
      out.write("                $(\"#materiales\").text(\"Materiales: \"+calEvent.materiales);\n");
      out.write("                $(\"#cupo\").text(\"Cupo: \"+calEvent.cupo);\n");
      out.write("          }  \n");
      out.write("        </script>\n");
      out.write("        ");

            out.print(alumno.verCalendario());
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("            $('.modal').modal();\n");
      out.write("            $(\".fc-prev-button, .fc-next-button\").attr('class', 'waves-effect waves-light btn red darken-4 btn-flat');\n");
      out.write("            $(\"#calendar\").fullCalendar(\"option\", \"contentHeight\",400);\n");
      out.write("        \n");
      out.write("            });\n");
      out.write("        </script>\n");
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
