package org.apache.jsp.Alumno.LoginAlumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"../../css/materialize.min.css\">\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/actividades.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(../../img/Calle.jpg);\" >\n");
      out.write("    \n");
      out.write("    <nav class= nav-extended style=\"width:100%\"> \n");
      out.write("    <div class=\"red\" style=\"width:100%\">\n");
      out.write("    <div class=\"nav-wrapper\">\n");
      out.write("      <a href=\"#\"  class=\"brand-logo center\" style=\"margin: 10px 0 0 25px;\">Ixtapoli Virtual</a>\n");
      out.write("    </div> \n");
      out.write("    </div>\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("      <div class=\"row\" id=\"imaqgenes\" style=\"position:absolute;height:auto;margin-right: auto;margin-left: auto;margin-top: 10%;\">\n");
      out.write("            \n");
      out.write("            <div id=\"contenido\" class=\"col s3\">\n");
      out.write("                <img class=\"circle responsive-img\" src=\"../../img/calendario.jpg\" alt=\"\"/>\n");
      out.write("                <a style=\"margin-left: 35%; font-family: sans-serif;color: white;font-size: 20px\" href=\"../../Alumno/Calendario/Calendario.jsp\">Calendario</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s2\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div id=\"contenido\" class=\"col s2\">\n");
      out.write("                <img class=\"circle responsive-img\" src=\"../../img/equipos.jpg\" alt=\"\"/>\n");
      out.write("                 <a style=\"font-size: 15px;font-family: sans-serif;color: white;font-size: 20px\" href=\"Actividades.jsp\">Actividades en Equipo</a>            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s2\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"contenido\" class=\"col s3\">\n");
      out.write("                <img class=\"circle responsive-img\" src=\"../../img/recorrido.jpg\" alt=\"\"/>\n");
      out.write("                <a style=\"margin-left: 16%;font-family: sans-serif;color: white;font-size: 20px\">Seguimiento de Recorrido</a>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("      </div>  \n");
      out.write("         <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("         <script src=\"../../js/materialize.min.js\"></script>\n");
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
