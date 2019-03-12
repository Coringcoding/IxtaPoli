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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/actividades.css\">\n");
      out.write("        <title>Registrar Actividad</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav>\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Agregar Actividad</a>\n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <main>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"actividadForm\" class=\"col l6 offset-l3\">\n");
      out.write("                <div id=\"tituloFormFaena\"><h4>Registra la Faena</h4></div>    \n");
      out.write("                \n");
      out.write("                <form class=\"col s12\" action=\"../../agregaFaena\" method=\"GET\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\" required>\n");
      out.write("                    <label for=\"acount\">Nombre</label>  \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <input type=\"text\" id=\"date\"   name=\"fecha\" required>\n");
      out.write("                    <label for=\"acount\">Fecha</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <input type=\"text\" class=\"timepicker\" id=\"time\"  name=\"hora\" required=\"\">\n");
      out.write("                    <label for=\"acount\">Hora</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <textarea class=\"materialize-textarea\" name=\"descripcion\" maxlength=\"1000\" rows=\"50\" cols=\"5\" id=\"descripcion\" required></textarea>\n");
      out.write("                    <label for=\"acount\">Descripcion</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <input type=\"text\" name=\"ubicacion\" id=\"ubicacion\" required>\n");
      out.write("                    <label for=\"acount\">Ubicacion</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <input type=\"text\" name=\"materiales\" id=\"materiales\" required>\n");
      out.write("                    <label for=\"acount\">Materiales</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <input type=\"number\" name=\"integrantes\" id=\"integrantes\" required>\n");
      out.write("                    <label for=\"acount\">Integrantes por Equipo</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"input-field col l3 offset-l9\">\n");
      out.write("                        <button class=\"waves-effect waves-light btn\" type=\"submit\" value=\"Agregar Faena\" name=\"agregarBtn\" id=\"agregarBtn\">\n");
      out.write("                       Agregar Faena\n");
      out.write("                    </button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("            <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("            <script src=\"../../js/materialize.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $(function(){\n");
      out.write("                        $('#date').datepicker({\n");
      out.write("                                format: 'yyyy-mm-dd'\n");
      out.write("                        });\n");
      out.write("                    });          \n");
      out.write("                $(function(){\n");
      out.write("                        $('#time').timepicker({\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("                    });       \n");
      out.write("            </script>\n");
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
