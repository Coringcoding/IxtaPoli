package org.apache.jsp.Administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../css/materialize.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/loginAdministrador.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Login Administrador</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <nav>\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Login</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("        \r\n");
      out.write("    <main>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"../IngresarAdministrador\" id=\"formLoginA\" onsubmit=\"return validar('formLoginA');\" method=\"post\">\r\n");
      out.write("            <div><h4>Administrador</h4></div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <input id=\"clave\" name=\"clave\" type=\"text\" class=\"validate\" class=\"required number\" onkeyup=\"validarClave();\" autocomplete=\"off\" onkeypress=\"LetrasNumeros(event);\">\r\n");
      out.write("                <label for=\"clave\">Clave Especial</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <input id=\"usuario\" name=\"usuario\" type=\"text\" class=\"validate\" class=\"required\" autocomplete=\"off\" maxlength=\"45\" onkeypress=\"LetrasNumeros(event);\">\r\n");
      out.write("                <label for=\"usuario\">Usuario</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <input id=\"contra\" name=\"contra\" type=\"password\" class=\"validate\" class=\"required\" autocomplete=\"off\" maxlength=\"45\" onkeypress=\"LetrasNumeros(event);\">\r\n");
      out.write("                <label for=\"contra\">Contraseña</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row espacio\">\r\n");
      out.write("                <a href=\"RegistroAdministrador.jsp\" id=\"linkLoginA\" class=\"col l7 input-field deshabilitar\">¿Aún no tienes cuenta?</a>\r\n");
      out.write("                <button class=\"btn waves-effect waves-light  red darken-4 col l5 input-field\" type=\"submit\" name=\"ingresar\" id=\"ingresar\" value=\"Ingresar\" disabled>\r\n");
      out.write("                Ingresar<i class=\"material-icons right\">send</i>\r\n");
      out.write("            </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </main>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col l2\">\r\n");
      out.write("                    <a href=\"../index.html\"><h5 class=\"white-text\">IXTAPOLI</h5></a>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\"col l2 offset-l8\">\r\n");
      out.write("                    <h5 class=\"white-text\">GIEB Projects</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"../js/jquery-3.3.1.min.js\"></script> \r\n");
      out.write("        <script src=\"../js/materialize.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.8.3.js\"></script>\r\n");
      out.write("        <script src=\"../js/validaciones.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("             function validarClave(){\r\n");
      out.write("          var cl = document.getElementById(\"clave\").value;\r\n");
      out.write("          if(cl === \"12345\"){\r\n");
      out.write("              document.getElementById(\"ingresar\").removeAttribute(\"disabled\");\r\n");
      out.write("              document.getElementById(\"linkLoginA\").className = \"col l7 input-field\";\r\n");
      out.write("          }else{\r\n");
      out.write("              document.getElementById(\"ingresar\").setAttribute(\"disabled\", \"\");\r\n");
      out.write("              document.getElementById(\"linkLoginA\").className = \"col l7 input-field deshabilitar\";\r\n");
      out.write("          }\r\n");
      out.write("       };\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
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
