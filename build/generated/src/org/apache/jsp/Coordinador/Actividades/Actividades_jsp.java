package org.apache.jsp.Coordinador.Actividades;

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
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/actividades.css\">\n");
      out.write("                \n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body style=\"background-image: url(../..//img/fondo.jpg);background-size: cover;\">    \n");
      out.write("    <nav id=\"nav\" style=\"position: absolute; height: 15%\"><h4>Agregar Actividad</h4></nav>\n");
      out.write("        \n");
      out.write("        <div class=\"row\" id=\"actividadForm\" >\n");
      out.write("            <div id=\"contenido\" class=\"col s12\">\n");
      out.write("                <h4 style=\"margin-left: 35%\" class=\"red-text\">Ingresa los datos</h4>                \n");
      out.write("                <form class=\"col s12\" action=\"../../agregaFaena\" method=\"GET\">\n");
      out.write("                    <div class=\"input-field col s4\">\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\" required>\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Nombre</label>  \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s4\">\n");
      out.write("                    <input type=\"text\" id=\"date\"   name=\"fecha\" required>\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Fecha</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s4\">\n");
      out.write("                    <input type=\"text\" class=\"timepicker\" id=\"time\"  name=\"hora\" required=\"\">\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Hora</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                        <textarea class=\"materialize-textarea\" name=\"descripcion\" maxlength=\"1000\" rows=\"50\" cols=\"10\" id=\"descripcion\" required></textarea>\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Descripcion</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                    <input type=\"text\" name=\"ubicacion\" id=\"ubicacion\" required>\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Ubicacion</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col s12\">\n");
      out.write("                    <div class=\"input-field col s6\">\n");
      out.write("                    <input type=\"number\" name=\"integrantes\" id=\"integrantes\" required>\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Integrantes por Equipo</label>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                    <input type=\"text\" name=\"materiales\" id=\"materiales\" required>\n");
      out.write("                    <label for=\"acount\" class=\" grey-text darken-3-text\">Materiales</label>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <button class=\"waves-effect waves-light btn col s12\"  style=\"background-color: red\" type=\"submit\" value=\"Agregar Faena\" name=\"agregarBtn\">\n");
      out.write("                       Agregar Faena\n");
      out.write("                    </button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col l2\">\n");
      out.write("                    <a href=\"../../index.html\"><h5 class=\"white-text\">IXTAPOLI</h5></a>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"col l2 offset-l8\">\n");
      out.write("                    <h5 class=\"white-text\">GIEB Projects</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("            \n");
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
