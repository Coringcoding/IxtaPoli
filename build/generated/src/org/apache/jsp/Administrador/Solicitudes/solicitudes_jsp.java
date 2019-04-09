package org.apache.jsp.Administrador.Solicitudes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ixtapoli.modelo.Solicitud;
import com.ixtapoli.impDao.administradorImpDao;
import java.util.ArrayList;
import java.util.List;

public final class solicitudes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \r\n");
      out.write("        ");

        boolean btn;
            btn = (request.getParameter("bot") != null)?true:false;
        if(btn){
            administradorImpDao ad = new administradorImpDao();
            int idS = Integer.parseInt(request.getParameter("ids"));
            int Es = Integer.parseInt(request.getParameter("estado"));
            System.out.println(Es);
            if(ad.CambiarSolicitud(idS, Es)){
                if(Es == 1){
                out.print("<script>alert('Solicitud Aceptada');</script>");
                }else{
                    out.print("<script>alert('Solicitud Rechazada');</script>");
                }
            }else{
                out.print("<script>alert('Error al procesar solicitud');</script>");
            }
        }
        
    
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");

            List<Solicitud> sol = new ArrayList();
            administradorImpDao ad = new administradorImpDao();
            sol = ad.consultarSolicitudes();
        
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <script>\r\n");
      out.write("            function aceptarSoli(i, e){\r\n");
      out.write("                var tr = document.getElementById(\"tr\"+i);\r\n");
      out.write("                var ids = tr.dataset.ids;\r\n");
      out.write("                document.getElementById(\"ids\").value = ids;\r\n");
      out.write("                document.getElementById(\"estado\").value = e;\r\n");
      out.write("                document.getElementById(\"aceptar\").submit();\r\n");
      out.write("            };\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            function desplegar(i){\r\n");
      out.write("                document.getElementById(\"esc\"+i).style.display=\"\";\r\n");
      out.write("                document.getElementById(\"prom\"+i).style.display=\"\";\r\n");
      out.write("                document.getElementById(\"dom\"+i).style.display=\"\";\r\n");
      out.write("                document.getElementById(\"usr\"+i).style.display=\"\";\r\n");
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
      out.write("                document.getElementById(\"usr\"+i).style.display=\"none\";\r\n");
      out.write("                document.getElementById(\"rut\"+i).style.display=\"none\";\r\n");
      out.write("                var celda = document.getElementById(\"accion\"+i);\r\n");
      out.write("                celda.setAttribute(\"onclick\",\"desplegar(\"+i+\");\");\r\n");
      out.write("                celda.innerHTML = \"Desplegar\";\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        <nav>\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo left\">Solicitudes</a>\r\n");
      out.write("      </nav>\r\n");
      out.write("        <main>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        <table class=\"highlight centered col l8 offset-l2\"><thead>\r\n");
      out.write("                <tr><th>Nombre</th><th>Paterno</th><th>Materno</th><th></th></tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

               for (int i = 0; i < sol.size(); i++) {
                 out.print("<tr><tr>"
                        + "<td>"+sol.get(i).getNombre()+"</td><td>"+sol.get(i).getPaterno()+"</td><td>"+sol.get(i).getMaterno()+"</td><td id='accion"+i+"' onclick='desplegar("+i+");'>Desplegar</td></tr>"
                        + "<tr id='esc"+i+"'><td>Escuela:</td><td colspan='2'>"+sol.get(i).getEscuela()+"</td></tr>"
                        + "<tr id='prom"+i+"'><td>Promedio:</td><td colspan='2'>"+sol.get(i).getPromedio()+"</td></tr>"        
                        + "<tr id='dom"+i+"'><td>Domicilio:</td><td colspan='2'>"+sol.get(i).getDomicilio()+"</td></tr>"
                        + "<tr id='usr"+i+"'><td>Usuario:</td><td colspan='2'>"+sol.get(i).getUsr()+"</td><td id='tr"+i+"' data-ids='"+sol.get(i).getIdSolicitud()+"'  onclick='aceptarSoli("+i+", 2);'>Rechazar</td></tr>"
                        + "<tr id='rut"+i+"'><td>Ruta:</td><td colspan='2'>"+sol.get(i).getRuta()+"</td><td id='tre"+i+"' data-ids='"+sol.get(i).getIdSolicitud()+"'  onclick='aceptarSoli("+i+", 1);'>Aceptar Solicitud</td></tr>"
                        + "</tr>");
                }
            
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form method=\"get\" name=\"aceptar\" id=\"aceptar\" action=\"solicitudes.jsp\">\r\n");
      out.write("                <input type=\"hidden\" id=\"ids\" name=\"ids\">\r\n");
      out.write("                <input type=\"hidden\" id=\"estado\" name=\"estado\">\r\n");
      out.write("                <input type=\"hidden\" id=\"bot\" name=\"bot\" value=\"bot\">\r\n");
      out.write("            </form>\r\n");
      out.write("            </main>\r\n");
      out.write("            \r\n");
      out.write("             <script src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                for (var i = 0; i < ");
      out.print(sol.size());
      out.write("; i++) {\r\n");
      out.write("                       ocultar(i);\r\n");
      out.write("                }\r\n");
      out.write("        </script>\r\n");
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
