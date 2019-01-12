package org.apache.jsp.Coordinador.Actividades;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calendario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../../css/fullcalendar.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/calendario.css\">\n");
      out.write("        <title>Calendario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav>\n");
      out.write("            <div class=\"#7cb342 light-green darken-1\" style=\"margin: 0 0 0;\">\n");
      out.write("               <div class=\"nav-wrapper\">\n");
      out.write("                   <a href=\"#\"  class=\"brand-logo center\" style=\"width:500px;\">[Ixtapoli]</a> \n");
      out.write("                        <ul class=\"left hide-on-med-and-down\">\n");
      out.write("                                 <li><a href=\"sass.html\"><i class=\"material-icons\">menu</i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                   <ul class=\"right hide-on-med-and-down\" style=\"margin: 0 150px 0 0;\">\n");
      out.write("                            <!--    <li> <i class=\"material-icons\">search</i> </li>\n");
      out.write("                            <li> <input id=\"search\" type=\"text\" class=\"validate\"></li> -->\n");
      out.write("                     <div class=\"input-field col s6\">\n");
      out.write("                          <i class=\"material-icons prefix\">search</i> \n");
      out.write("                          <input id=\"search\" type=\"text\" class=\"validate\">  \n");
      out.write("                          <label for=\"search\" class=\"white-text\">Nombre del Alumno</label>   \n");
      out.write("                     </div>\n");
      out.write("                   </ul>\n");
      out.write("               </div> \n");
      out.write("            </div>   \n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("        <div id=\"calendar\"></div>\n");
      out.write("        <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"../../js/moment.min.js\"></script>\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\n");
      out.write("        <script src=\"../../js/fullcalendar.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('#calendar').fullCalendar()\n");
      out.write("            });\n");
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
