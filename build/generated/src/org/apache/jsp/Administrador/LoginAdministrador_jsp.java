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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/materialize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/loginAdministrador.css\">\n");
      out.write("        <title>Login Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav>\n");
      out.write("        <div>\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Login</a>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("        <form action=\"../IngresarAdministrador\" id=\"formLoginA\">\n");
      out.write("            <div><h4>Administrador</h4></div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"clave\" name=\"clave\" type=\"text\" class=\"validate\" class=\"required number\" onkeyup=\"validarClave();\" autocomplete=\"off\">\n");
      out.write("                <label for=\"clave\">Clave Especial</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"usuario\" name=\"usuario\" type=\"text\" class=\"validate\" class=\"required\">\n");
      out.write("                <label for=\"usuario\">Usuario</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"contraseña\" name=\"contraseña\" type=\"password\" class=\"validate\" class=\"required\">\n");
      out.write("                <label for=\"contraseña\">Contraseña</label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row espacio\">\n");
      out.write("                <a href=\"RegistroAdministrador.jsp\" Id=\"linkLoginA\" class=\"col l7 input-field deshabilitar\">¿Aún no tienes cuenta?</a>\n");
      out.write("                <button class=\"btn waves-effect waves-light  red darken-4 col l5 input-field\" type=\"submit\" name=\"ingresar\" id=\"ingresar\" value=\"Ingresar\" disabled>\n");
      out.write("                Ingresar<i class=\"material-icons right\">send</i>\n");
      out.write("            </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </main>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col l2\">\n");
      out.write("                    <a href=\"../index.html\"><h5 class=\"white-text\">IXTAPOLI</h5></a>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"col l2 offset-l8\">\n");
      out.write("                    <h5 class=\"white-text\">GIEB Projects</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        <script src=\"../js/jquery-3.3.1.min.js\"></script> \n");
      out.write("        <script src=\"../js/materialize.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.8.3.js\"></script>\n");
      out.write("        <script>\n");
      out.write("             function validarClave(){\n");
      out.write("          var cl = document.getElementById(\"clave\").value;\n");
      out.write("          if(cl === \"12345\"){\n");
      out.write("              document.getElementById(\"ingresar\").removeAttribute(\"disabled\");\n");
      out.write("              document.getElementById(\"linkLoginA\").className = \"col l7 input-field\";\n");
      out.write("          }else{\n");
      out.write("              document.getElementById(\"ingresar\").setAttribute(\"disabled\", \"\");\n");
      out.write("              document.getElementById(\"linkLoginA\").className = \"col l7 input-field deshabilitar\";\n");
      out.write("          }\n");
      out.write("       };\n");
      out.write("        </script>\n");
      out.write("        \n");
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
