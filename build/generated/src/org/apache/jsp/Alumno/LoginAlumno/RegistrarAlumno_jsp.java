package org.apache.jsp.Alumno.LoginAlumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">        \n");
      out.write("        <title>Registro Alumno</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h4 class=\"col s12 center-align\">Registro Alumno</h4>            \n");
      out.write("                <form action=\"../../RegistrarAlumno\" method=\"post\" class=\"col 12\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"nombre\">Nombre:</label>\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"paterno\">Apellido Paterno:</label>\n");
      out.write("                    <input type=\"text\" name=\"paterno\" id=\"paterno\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"materno\">Apellido Materno:</label>\n");
      out.write("                    <input type=\"text\" name=\"materno\" id=\"materno\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"escuela\">Escuela:</label>\n");
      out.write("                    <input type=\"text\" name=\"escuela\" id=\"escuela\">\n");
      out.write("                    </div>                    \n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <select name=\"ruta\" id=\"ruta\" class=\"form-control\">\n");
      out.write("                            <option value=\"\" disabled selected>Escoge una opcion</option>\n");
      out.write("                            <option value=\"1\">Zacatenco</option>\n");
      out.write("                            <option value=\"2\">Santo Tomas</option>                            \n");
      out.write("                        </select>\n");
      out.write("                        <label>Ruta</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"domicilio\">Domicilio:</label>\n");
      out.write("                    <input type=\"text\" name=\"domicilio\" id=\"domicilio\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"promedio\">Promedio:</label>\n");
      out.write("                    <input type=\"number\" name=\"promedio\" id=\"promedio\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"usuario\">Usuario:</label>\n");
      out.write("                    <input type=\"text\" name=\"usuario\" id=\"usuario\" onchange=\"return autentica();\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                    <label for=\"contra\">Contraseña:</label>\n");
      out.write("                    <input type=\"password\" name=\"contra\" id=\"contra\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"Registrarse\"> \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <span id=\"error\" style=\"font-family: Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                font-size: 12pt;color: #CC3300; position:relative;visibility:hidden;\">\n");
      out.write("                usuario Ocupado ¡¡¡\n");
      out.write("            </span>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/jquery-3.3.1.min.js\"></script>  \n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/materialize.min.js\"></script>         \n");
      out.write("        <script>            \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('select').formSelect();\n");
      out.write("            })            \n");
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
