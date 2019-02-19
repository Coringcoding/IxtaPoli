package org.apache.jsp.Administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuAdmon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--<link rel=\"stylesheet\" href=\"../css/menuAdmon.css\">-->\n");
      out.write("        <title>Menu Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"#d32f2f red darken-2\">\n");
      out.write("                <a href=\"../index.html\" class=\"brand-logo\">Ixtapoli</a>\n");
      out.write("                <a href=\"#\" class=\"brand-logo center\">Bienvenido</a>\n");
      out.write("              <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">\n");
      out.write("                  <li><a href=\"../pagsInfo/Conocenos.html\">Conocenos</a></li>\n");
      out.write("                  <li><a href=\"../pagsInfo/Informacion.html\">¿Que es Ixtapoli?</a></li>\n");
      out.write("                  <li><a href=\"../pagsInfo/Contactos.html\">Contactos</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            \n");
      out.write("            <a href=\"\" id=\"alta\">\n");
      out.write("                <img src=\"../img/recorrido.jpg\" id=\"imagen\">\n");
      out.write("                Solicitudes\n");
      out.write("            </a>\n");
      out.write("            \n");
      out.write("            <a href=\"../Administrador/ActualizarInformacion/ListaAlumno.jsp\" id=\"cambio\">\n");
      out.write("                <img src=\"../img/Solicitudes.jpg\" id=\"imagen\">\n");
      out.write("                Actualizar Informacion  \n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"../Administrador/DarBaja/baja.jsp\" id=\"baja\">\n");
      out.write("                <img src=\"../img/Baja.jpg\" id=\"imagen\">\n");
      out.write("                Dar de Baja\n");
      out.write("            </a>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <footer class=\"#616161 grey darken-2\">\n");
      out.write("          <div class=\"#616161 grey darken-2\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col l6 s12\">\n");
      out.write("                <h5 class=\"white-text\">Footer Content</h5>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">You can use rows and columns here to organize your footer content.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col l4 offset-l2 s12\">\n");
      out.write("                <h5 class=\"white-text\">Links</h5>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Facebook Ixtapoli</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Gobierno Ixtapaluca</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Otra pagina gubernamental</a></li>\n");
      out.write("                 \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer> \n");
      out.write("        <script src=\"../js/jquery-3.3.1.min.js\"></script> \n");
      out.write("        <script src=\"../js/materialize.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.8.3.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"http://jzaefferer.github.com/jquery-validation/jquery.validate.js\"></script>\n");
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
