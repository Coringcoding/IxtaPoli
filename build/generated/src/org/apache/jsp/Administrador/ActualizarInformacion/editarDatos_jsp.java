package org.apache.jsp.Administrador.ActualizarInformacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.esapi.ESAPI;
import com.ixtapoli.impDao.administradorImpDao;
import java.util.ArrayList;
import java.util.List;
import com.ixtapoli.modelo.Alumno;

public final class editarDatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../../css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/administrador.css\">\n");
      out.write("        <title>Editar Datos</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        boolean btn;
            btn = (request.getParameter("bot") != null)?true:false;
        if(btn){
            Alumno alu = new Alumno();
            administradorImpDao admon = new administradorImpDao();
            alu.setId(Long.parseLong(ESAPI.encoder().encodeForHTML(request.getParameter("idAlumno"))));
            alu.setNombre(ESAPI.encoder().encodeForHTML(request.getParameter("nombre")));
            alu.setPaterno(ESAPI.encoder().encodeForHTML(request.getParameter("paterno")));
            alu.setMaterno(ESAPI.encoder().encodeForHTML(request.getParameter("materno")));
            alu.setEscuela(ESAPI.encoder().encodeForHTML(request.getParameter("escuela")));
            alu.setDomicilio(ESAPI.encoder().encodeForHTML(request.getParameter("domicilio")));
            alu.setPromedio(Float.parseFloat(ESAPI.encoder().encodeForHTML(request.getParameter("promedio"))));
            alu.setUsr(ESAPI.encoder().encodeForHTML(request.getParameter("usuario")));
            alu.setContra(ESAPI.encoder().encodeForHTML(request.getParameter("contra")));
            if(admon.actualizarDatos(alu)){
                out.print("<script>alert('Datos Actualizados'); window.location.replace('ListaAlumno.jsp');</script>");
            }else{
                out.print("<script>alert('Error al Actualizar'); window.location.replace('ListaAlumno.jsp');</script>");
            }
        }
        
        List<Alumno> al = new ArrayList();
        administradorImpDao ad = new administradorImpDao();
        Alumno a = new Alumno();
        a = ad.consultarAlumnos(Integer.parseInt(request.getParameter("idAlumno"))).get(0);
        
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("           <nav>\n");
      out.write("        <div>\n");
      out.write("            <a href=\"#\" class=\"brand-logo center\">Actualizar Informacion</a>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("            <div class=\"row\">           \n");
      out.write("                <form action=\"\" method=\"post\" class=\"col l8 offset-l2\" id=\"formregistroAl\" name=\"editar\" onsubmit=\"return valReg('formregistroAl');\">\n");
      out.write("                    <div id=\"namA\">Alumno</div>\n");
      out.write("                    <input  type=\"hidden\" id=\"idAlumno\" name=\"idAlumno\" value=\"");
      out.print(a.getId());
      out.write("\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"nombre\">Nombre:</label>\n");
      out.write("                    <input type=\"text\" id=\"nombre\" name=\"nombre\" value=\"");
      out.print(a.getNombre());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"paterno\">Apellido Paterno:</label>\n");
      out.write("                    <input type=\"text\" id=\"paterno\" name=\"paterno\" value=\"");
      out.print(a.getPaterno());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"materno\">Apellido Materno:</label>\n");
      out.write("                    <input type=\"text\" id=\"materno\" name=\"materno\" value=\"");
      out.print(a.getMaterno());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"escuela\">Escuela:</label>\n");
      out.write("                    <input type=\"text\" id=\"escuela\" name=\"escuela\" value=\"");
      out.print(a.getEscuela());
      out.write("\">\n");
      out.write("                    </div>     \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"domicilio\">Domicilio:</label>\n");
      out.write("                    <input type=\"text\" id=\"domicilio\" name=\"domicilio\" value=\"");
      out.print(a.getDomicilio());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"promedio\">Promedio:</label>\n");
      out.write("                    <input type=\"text\" step=\"0.01\" id=\"promedio\" name=\"promedio\" value=\"");
      out.print(a.getPromedio());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>  \n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                    \n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"usuario\">Usuario:</label>\n");
      out.write("                    <input type=\"text\" id=\"usuario\" name=\"usuario\" value=\"");
      out.print(a.getUsr());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">    \n");
      out.write("                    <div class=\"input-field col l6\">\n");
      out.write("                    <label for=\"contra\">Contraseña:</label>\n");
      out.write("                    <input type=\"text\" id=\"contra\" name=\"contra\" value=\"");
      out.print(a.getContra());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <button class=\"btn waves-effect waves-light  red darken-4 col l3 offset-l6 input-field\" type=\"submit\" name=\"bot\" value=\"actualizar\">\n");
      out.write("                        Actualizar<i class=\"material-icons right\">send</i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\"></div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <span id=\"error\" style=\"font-family: Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("                font-size: 12pt;color: #CC3300; position:relative;visibility:hidden;\">\n");
      out.write("                usuario Ocupado ¡¡¡\n");
      out.write("            </span>\n");
      out.write("             </main>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("           <script type=\"text/javascript\" src=\"../../js/jquery-3.3.1.min.js\"></script>  \n");
      out.write("        <script type=\"text/javascript\" src=\"../../js/materialize.min.js\"></script> \n");
      out.write("           <script src=\"../../js/validaciones.js\"></script>\n");
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
