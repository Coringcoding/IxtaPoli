package org.apache.jsp.Administrador.ActualizarInformacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ixtapoli.impDao.administradorImpDao;
import java.util.ArrayList;
import java.util.List;
import com.ixtapoli.modelo.Alumno;

public final class ListaAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/materialize.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/solicitudes.css\">\r\n");
      out.write("        <title>Alumnos</title>\r\n");
      out.write("        ");

            List<Alumno> al = new ArrayList();
            administradorImpDao ad = new administradorImpDao();
            al = ad.consultarAlumnos(0);
        
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

                //Sesion
                HttpSession ses =request.getSession();
                String sesu = (String)ses.getAttribute("usuario");
                if(sesu.equalsIgnoreCase("Administrador")){
                    out.print("<script>alert('Sesion Incorrecta');"
                            + "window.location.href='../../index.html'</script>");
                }

         
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            function edit(i){\r\n");
      out.write("                var tr = document.getElementById(\"tr\"+i);\r\n");
      out.write("                var ida = tr.dataset.idal;\r\n");
      out.write("                document.getElementById(\"idAl\").value = ida;\r\n");
      out.write("                document.getElementById(\"editar\").submit();\r\n");
      out.write("                \r\n");
      out.write("            };\r\n");
      out.write("            function desplegar(i){\r\n");
      out.write("                document.getElementById(\"esc\"+i).style.display=\"\";\r\n");
      out.write("                document.getElementById(\"prom\"+i).style.display=\"\";\r\n");
      out.write("                document.getElementById(\"dom\"+i).style.display=\"\";\r\n");
      out.write("                document.getElementById(\"rut\"+i).style.display=\"\";\r\n");
      out.write("                var celda = document.getElementById(\"accion\"+i);\r\n");
      out.write("                celda.setAttribute(\"onclick\",\"ocultar(\"+i+\");\");\r\n");
      out.write("                celda.innerHTML = \"Ocultar\";\r\n");
      out.write("            };\r\n");
      out.write("            \r\n");
      out.write("            function ocultar(i){\r\n");
      out.write("                document.getElementById(\"esc\"+i).style.display=\"none\";\r\n");
      out.write("                document.getElementById(\"prom\"+i).style.display=\"none\";\r\n");
      out.write("                document.getElementById(\"dom\"+i).style.display=\"none\";\r\n");
      out.write("                document.getElementById(\"rut\"+i).style.display=\"none\";\r\n");
      out.write("                var celda = document.getElementById(\"accion\"+i);\r\n");
      out.write("                celda.setAttribute(\"onclick\",\"desplegar(\"+i+\");\");\r\n");
      out.write("                celda.innerHTML = \"Desplegar\";\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        <nav>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo left\">Actualizar Informacion</a>\r\n");
      out.write("      </nav>\r\n");
      out.write("        <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("        <ul id=\"slide-out\" class=\"sidenav\" style=\"background: linear-gradient(to right,#900C3F,#4F011F,#900C3F);\">\r\n");
      out.write("            <li><div class=\"user-view\" style=\"color: white;\">\r\n");
      out.write("                        IXPOLI-GIEBPROJECTS\r\n");
      out.write("                    <img class=\"circle\" src=\"../../img/fondoLogins.jpg\">\r\n");
      out.write("              <a href=\"#email\"><span class=\"white-text\">Administrador</span></a>\r\n");
      out.write("            </div></li> \r\n");
      out.write("            <li><div class=\"divider\"></div></li>\r\n");
      out.write("            <li><a href=\"../menuAdmon.jsp\" class=\"white-text\"><i class=\"material-icons white-text\">apps</i>Menu</a></li>\r\n");
      out.write("            <li><div class=\"divider\"></div></li>\r\n");
      out.write("            <li><a href=\"../Solicitudes/solicitudes.jsp\" class=\"white-text\"><i class=\"material-icons white-text\">all_inclusive</i>Solicitudes</a></li>\r\n");
      out.write("            <li><div class=\"divider\"></div></li>\r\n");
      out.write("            <li><a href=\"../DarBaja/baja.jsp\" class=\"white-text\"><i class=\"material-icons white-text\">all_inclusive</i>Dar de Baja</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <table class=\"highlight centered\"><thead>\r\n");
      out.write("                <tr><th>Nombre</th><th>Paterno</th><th>Materno</th><th></th></tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

               for (int i = 0; i < al.size(); i++) {
                 out.print("<tr><tr>"
                        + "<td>"+al.get(i).getNombre()+"</td><td>"+al.get(i).getPaterno()+"</td><td>"+al.get(i).getMaterno()+"</td><td id='accion"+i+"' onclick='desplegar("+i+");'>Desplegar</td></tr>"
                        + "<tr id='esc"+i+"'><td>Escuela:</td><td colspan='2'>"+al.get(i).getEscuela()+"</td></tr>"
                        + "<tr id='prom"+i+"'><td>Promedio:</td><td colspan='2'>"+al.get(i).getPromedio()+"</td></tr>"        
                        + "<tr id='dom"+i+"'><td>Domicilio:</td><td colspan='2'>"+al.get(i).getDomicilio()+"</td></tr>"
                        + "<tr id='rut"+i+"'><td>Ruta:</td><td colspan='2'>"+al.get(i).getRutaS()+"</td><td id='tr"+i+"' data-idal='"+al.get(i).getId()+"'  onclick='edit("+i+");'>Actualizar datos</td></tr>"
                        + "</tr>");
                }
            
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form method=\"post\" name=\"editar\" id=\"editar\" action=\"editarDatos.jsp\">\r\n");
      out.write("                <input type=\"hidden\" id=\"idAl\" name=\"idAlumno\">\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("        </main>            \r\n");
      out.write("             <script src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                for (var i = 0; i < ");
      out.print(al.size());
      out.write("; i++) {\r\n");
      out.write("                       ocultar(i);\r\n");
      out.write("                }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("             $(document).ready(function(){\r\n");
      out.write("                $('.sidenav').sidenav();\r\n");
      out.write("                });\r\n");
      out.write("         </script>\r\n");
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
