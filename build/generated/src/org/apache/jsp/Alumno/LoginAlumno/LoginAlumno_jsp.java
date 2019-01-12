package org.apache.jsp.Alumno.LoginAlumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">            \n");
      out.write("            <div class=\"row\">  \n");
      out.write("                <div class=\"col s1\">\n");
      out.write("                    <a class=\"btn-floating btn waves-effect waves-light\" href=\"\"><i class=\"material-icons\">\n");
      out.write("                            arrow_back\n");
      out.write("                        </i></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col s11 offset-2 valign-wrapper\">\n");
      out.write("                    <h4 class=\"center-align\">Login Alumno</h4>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"../../IngresarAlumno\" method=\"post\" class=\"col s12\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <label for=\"usuario\">Usuario</label>\n");
      out.write("                        <input class=\"validate\" type=\"text\" name=\"usuario\" id=\"usuario\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <label for=\"contra\">Contraseña</label>\n");
      out.write("                        <input class=\"validate\" type=\"password\" name=\"contra\" id=\"contra\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"center-align col s6\">\n");
      out.write("                        <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"action\">\n");
      out.write("                            Iniciar sesion\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"center-align col s6\">\n");
      out.write("                        <button class=\"btn waves-effect waves-light\" type=\"button\" \n");
      out.write("                                onclick=\"location.href = 'RegistrarAlumno.jsp'\" name=\"registro\">\n");
      out.write("                            Registrarse\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/materialize.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/jquery-3.3.1.min.js\">\n");
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
