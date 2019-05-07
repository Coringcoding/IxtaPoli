package org.apache.jsp.Coordinador.Calendario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Actividades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/actividades.css\">\r\n");
      out.write("        <title>Registrar Actividad</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <nav>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Agregar Actividad</a>\r\n");
      out.write("      </nav>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("        <main>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div id=\"actividadForm\" class=\"col l6 offset-l3\">\r\n");
      out.write("                <div id=\"tituloFormFaena\"><h4>Registra la Faena</h4></div>    \r\n");
      out.write("                \r\n");
      out.write("                <form class=\"col s12\" action=\"../../agregaFaena\" method=\"GET\">\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\" required>\r\n");
      out.write("                    <label for=\"acount\">Nombre</label>  \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                    <input type=\"text\" id=\"date\"   name=\"fecha\" required>\r\n");
      out.write("                    <label for=\"acount\">Fecha</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                    <input type=\"text\" class=\"timepicker\" id=\"time\"  name=\"hora\" required=\"\">\r\n");
      out.write("                    <label for=\"acount\">Hora</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                        <textarea class=\"materialize-textarea\" name=\"descripcion\" maxlength=\"1000\" rows=\"50\" cols=\"5\" id=\"descripcion\" required></textarea>\r\n");
      out.write("                    <label for=\"acount\">Descripcion</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                    <input type=\"text\" name=\"ubicacion\" id=\"ubicacion\" required>\r\n");
      out.write("                    <label for=\"acount\">Ubicacion</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                    <input type=\"text\" name=\"materiales\" id=\"materiales\" required>\r\n");
      out.write("                    <label for=\"acount\">Materiales</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s12\">\r\n");
      out.write("                    <input type=\"number\" name=\"integrantes\" id=\"integrantes\" required>\r\n");
      out.write("                    <label for=\"acount\">Integrantes por Equipo</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"input-field col l3 offset-l9\">\r\n");
      out.write("                        <button class=\"waves-effect waves-light btn\" type=\"submit\" value=\"Agregar Faena\" name=\"agregarBtn\" id=\"agregarBtn\">\r\n");
      out.write("                       Agregar Faena\r\n");
      out.write("                    </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("            <script src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(function(){\r\n");
      out.write("                        $('#date').datepicker({\r\n");
      out.write("                                format: 'yyyy-mm-dd'\r\n");
      out.write("                        });\r\n");
      out.write("                    });          \r\n");
      out.write("                $(function(){\r\n");
      out.write("                        $('#time').timepicker({\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("                    });       \r\n");
      out.write("            </script>\r\n");
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
