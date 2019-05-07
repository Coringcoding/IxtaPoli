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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");


    try {
            if(request.getParameter("msj").equals("E4/0McbWmd 2F85Nfvgq2r0wiV4fAwfa5nG0E7KLKA uV9gulgAT57gVC9iIHSu/dGRX4XYSPrIPixxa0W3Wrg")) {
                out.print("<script>alert('Solicitud enviada');</script>");
            }else if(request.getParameter("msj").equals("Db2Jr0UKPKdnlhF1sgfsVAVsosYzX4d1KhzraA2to2GR5zG5isD4hfL/einIP18n9FnEumOr1zQzhE2SVmFnIQ")) {
                out.print("<script>alert('Error en envío de solicitud');</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>    \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">     \r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/loginAdministrador.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Login Alumno</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav>\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Login</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("                <form action=\"../../IngresarAlumno\" method=\"post\" class=\"col l\" id=\"formLoginA\" onsubmit=\"return validar('formLoginA');\">\r\n");
      out.write("                    <div id=\"tituloFormAlumno\"><h4>Alumno</h4></div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"input-field\" id=\"labUs\">\r\n");
      out.write("                        <label for=\"usuario\" >Usuario</label>\r\n");
      out.write("                        <input class=\"validate\" type=\"text\" name=\"usuario\" id=\"usuario\" required autocomplete=\"off\" maxlength=\"45\" onkeypress=\"LetrasNumeros(event);\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-field\">\r\n");
      out.write("                        <label for=\"contra\">Contraseña</label>\r\n");
      out.write("                        <input class=\"validate\" type=\"password\" name=\"contra\" id=\"contra\" required autocomplete=\"off\" maxlength=\"45\" onkeypress=\"LetrasNumeros(event);\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"row espacio2\">\r\n");
      out.write("                        <a href=\"RegistrarAlumno.jsp\" ID=\"linkLoginA\" class=\"col l4\">Crear Registro</a>\r\n");
      out.write("                        \r\n");
      out.write("                        <button class=\"btn waves-effect waves-light red darken-4 col l6  offset-l2\" type=\"submit\" name=\"action\">\r\n");
      out.write("                            Iniciar Sesion<i class=\"material-icons right\">send</i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                </form>\r\n");
      out.write("        </main>\r\n");
      out.write("        \r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col l2\">\r\n");
      out.write("                    <a href=\"../../index.html\"><h5 class=\"white-text\">IXTAPOLI</h5></a>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\"col l2 offset-l8\">\r\n");
      out.write("                    <h5 class=\"white-text\">GIEB Projects</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/validaciones.js\"></script>\r\n");
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
