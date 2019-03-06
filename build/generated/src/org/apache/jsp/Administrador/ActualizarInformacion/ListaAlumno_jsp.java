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
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/materialize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/solicitudes.css\">\n");
      out.write("        <title>Alumnos</title>\n");
      out.write("        ");

            List<Alumno> al = new ArrayList();
            administradorImpDao ad = new administradorImpDao();
            al = ad.consultarAlumnos(0);
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function edit(i){\n");
      out.write("                var tr = document.getElementById(\"tr\"+i);\n");
      out.write("                var ida = tr.dataset.idal;\n");
      out.write("                document.getElementById(\"idAl\").value = ida;\n");
      out.write("                document.getElementById(\"editar\").submit();\n");
      out.write("                \n");
      out.write("            };\n");
      out.write("            function desplegar(i){\n");
      out.write("                document.getElementById(\"esc\"+i).style.display=\"\";\n");
      out.write("                document.getElementById(\"prom\"+i).style.display=\"\";\n");
      out.write("                document.getElementById(\"dom\"+i).style.display=\"\";\n");
      out.write("                document.getElementById(\"rut\"+i).style.display=\"\";\n");
      out.write("                var celda = document.getElementById(\"accion\"+i);\n");
      out.write("                celda.setAttribute(\"onclick\",\"ocultar(\"+i+\");\");\n");
      out.write("                celda.innerHTML = \"Ocultar\";\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            function ocultar(i){\n");
      out.write("                document.getElementById(\"esc\"+i).style.display=\"none\";\n");
      out.write("                document.getElementById(\"prom\"+i).style.display=\"none\";\n");
      out.write("                document.getElementById(\"dom\"+i).style.display=\"none\";\n");
      out.write("                document.getElementById(\"rut\"+i).style.display=\"none\";\n");
      out.write("                var celda = document.getElementById(\"accion\"+i);\n");
      out.write("                celda.setAttribute(\"onclick\",\"desplegar(\"+i+\");\");\n");
      out.write("                celda.innerHTML = \"Desplegar\";\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <nav>\n");
      out.write("            <a href=\"#\" class=\"brand-logo left\">Actualizar Informacion</a>\n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <table class=\"highlight centered\"><thead>\n");
      out.write("            <tr><th>Nombre</th><th>Paterno</th><th>Materno</th></tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
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
            
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"post\" name=\"editar\" id=\"editar\" action=\"editarDatos.jsp\">\n");
      out.write("                <input type=\"hidden\" id=\"idAl\" name=\"idAlumno\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </main>            \n");
      out.write("             <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                for (var i = 0; i < ");
      out.print(al.size());
      out.write("; i++) {\n");
      out.write("                       ocultar(i);\n");
      out.write("                }\n");
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
