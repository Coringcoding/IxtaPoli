package org.apache.jsp.Administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ixtapoli.modelo.Administrador;
import com.ixtapoli.impDao.administradorImpDao;

public final class RegistroAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/materialize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/administrador.css\">\n");
      out.write("        <title>Registro Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            boolean btn;
            btn = (request.getParameter("registrarse") != null)?true:false;
            if(btn){
                administradorImpDao administrador = new administradorImpDao();
                Administrador admin = new Administrador();
                admin.setNombre(request.getParameter("nombre"));
                admin.setPaterno(request.getParameter("paterno"));
                admin.setMaterno(request.getParameter("materno"));
                admin.setEdad(Integer.parseInt(request.getParameter("edad")));
                admin.setTelefono(request.getParameter("telefono"));
                admin.setUsr(request.getParameter("usuario"));
                admin.setContra(request.getParameter("contra"));
                if(administrador.registrarse(admin)){
                    out.print("<script>alert('Administrador registrado');"
                            + "window.location.replace('LoginAdministrador.jsp');</script>");
                }
                else{
                    out.print("<script>alert('Error en el registro');"
                            + "window.location.replace('LoginAdministrador.jsp');</script>");
                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <nav>Todo el nav</nav>\n");
      out.write("        \n");
      out.write("        <form method=\"get\" id=\"formregistro\" action=\"RegistroAdministrador.jsp\">\n");
      out.write("            <div id=\"nam\">Administrador</div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"nombre\" name=\"nombre\" type=\"text\" class=\"validate\">\n");
      out.write("                <label for=\"nombre\">Nombre</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"paterno\" name=\"paterno\" type=\"text\" class=\"validate\">\n");
      out.write("                <label for=\"paterno\">Paterno</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"materno\" name=\"materno\" type=\"text\" class=\"validate\">\n");
      out.write("                <label for=\"materno\">Materno</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"edad\" name=\"edad\" type=\"number\" class=\"validate\">\n");
      out.write("                <label for=\"edad\">Edad</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"telefono\" name=\"telefono\"  type=\"text\" class=\"validate\">\n");
      out.write("                <label for=\"telefono\">Telefono</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <div id=\"validacion\"></div>\n");
      out.write("                <input id=\"usuario\" name=\"usuario\" type=\"text\" class=\"validate\" onblur=\"existencia()\">\n");
      out.write("                <label for=\"usuario\">Usuario</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"contra\" name=\"contra\" type=\"password\" class=\"validate\">\n");
      out.write("                <label for=\"contra\">Contraseña</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <input id=\"confcontra\" name=\"confcontra\" type=\"password\" class=\"validate\">\n");
      out.write("                <label for=\"confcontra\">Confirmar Contraseña</label>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"btn waves-effect waves-light  red darken-4\" type=\"submit\" name=\"registrarse\" value=\"registarse\">\n");
      out.write("                Registrase<i class=\"material-icons right\">send</i>\n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"../js/jquery-3.3.1.min.js\"></script> \n");
      out.write("        <script src=\"../js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function existencia(){\n");
      out.write("                $.ajax({\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        url: \"validaUsuario.jsp\",\n");
      out.write("                        data: {username: $(\"#usuario\").val()}\n");
      out.write("                    })\n");
      out.write("                            .done(function(msg) {\n");
      out.write("                            $(\"#validacion\").text(msg);\n");
      out.write("                            });\n");
      out.write("            }\n");
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
