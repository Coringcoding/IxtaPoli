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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("  <html>\n");
      out.write("    <head>\n");
      out.write("    \n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write(" <body style=\"background-color: gray\">\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/script.js\"></script>    \n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"row\" style=\"background-color:#e0e0e0 ; width: 35%; line-height:50%; border-radius: 10px; margin-top: 50px\">\n");
      out.write("    <div class=\"col s12 m6\" style=\"width: 100%;\">\n");
      out.write("      <div class=\"red-text\">\n");
      out.write("          <h4 class=\"red-text\">Administrador</h4><br>\n");
      out.write("          \n");
      out.write("           <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">account_circle</i> \n");
      out.write("           <input id=\"account_circle\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"acount\" class=\" grey-text darken-3-text\">Nombre</label>  \n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">account_circle</i> \n");
      out.write("           <input id=\"account_circle\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"acount2\" class=\" grey-text darken-3-text\">Apellido Paterno</label>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">account_circle</i> \n");
      out.write("           <input id=\"account_circle\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"acount3\" class=\"grey-text darken-3-text\">Apellido Materno</label>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">local_phone</i> \n");
      out.write("           <input id=\"local_phone\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"tel\" class=\"grey-text darken-3-text\">Edad</label>\n");
      out.write("          </div>\n");
      out.write("       \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">account_circle</i> \n");
      out.write("           <input id=\"account_circle\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"acount2\" class=\"grey-text darken-3-text\">Telefono</label>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">account_box</i> \n");
      out.write("           <input id=\"account_box\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"acount2\" class=\"grey-text darken-3-text\">Usuario</label>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">assignment_ind</i> \n");
      out.write("           <input id=\"assignment_ind\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"pass\" class=\"grey-text darken-3-text\">Password</label>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <i class=\"material-icons prefix\">check_circle</i> \n");
      out.write("           <input id=\"check_circle\" type=\"text\" class=\"validate\">  \n");
      out.write("           <label for=\"pass2\" class=\"grey-text darken-3-text\">Password Confirm</label>\n");
      out.write("          </div>\n");
      out.write("      </div> \n");
      out.write("           <button class=\"btn waves-effect\" style=\"background-color: red; position: relative; left: 60%; margin-bottom: 50px;\" type=\"submit\" name=\"action\" >Crear Cuenta\n");
      out.write("           </button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      <!--JavaScript at end of body for optimized loading-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("  </html>");
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
