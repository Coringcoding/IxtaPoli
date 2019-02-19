package org.apache.jsp.Administrador.DarBaja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.esapi.ESAPI;
import com.ixtapoli.impDao.alumnoImpDao;
import com.ixtapoli.modelo.Reporte;
import com.ixtapoli.impDao.administradorImpDao;
import com.ixtapoli.impDao.coordinadorImpDao;
import java.util.ArrayList;
import java.util.List;
import com.ixtapoli.modelo.Alumno;

public final class baja_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/materialize.min.css\">\r\n");
      out.write("        <title>Dar de Baja</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

         boolean btn;
            btn = (request.getParameter("bot") != null)?true:false;
            if(btn){
                String accion = request.getParameter("bot");
                if(accion.equals("baja")){
                    
                     alumnoImpDao al = new alumnoImpDao();
                    Alumno a = new Alumno();
                    a.setId(new Long(ESAPI.encoder().encodeForHTML(request.getParameter("idAlumno"))));
                    if(al.eliminarse(a)){
                        out.print("<script>alert('Alumno Dado de Baja Exitosamente');"
                                + "window.location.replace('baja.jsp');</script>");
                    }else{
                        out.print("<script>alert('Error eliminar Alumno');"
                                + "window.location.replace('baja.jsp');</script>");
                    }
                }else{
                    Reporte r = new Reporte();
                    coordinadorImpDao coo = new coordinadorImpDao();
                    r.setIdAlumno(new Long(ESAPI.encoder().encodeForHTML(request.getParameter("idAlumno"))));
                    r.setIdReporte(new Long(ESAPI.encoder().encodeForHTML(request.getParameter("idReporte"))));
                    if (coo.eliminarReporte(r)) {
                        out.print("<script>alert('Reporte eliminado');"
                                + "window.location.replace('baja.jsp');</script>");
                    } else {
                        out.print("<script>alert('Error en eliminar');"
                                + "window.location.replace('baja.jsp');</script>");
                    }
                }
            }
        List<Reporte> rep = new ArrayList();
        coordinadorImpDao coo = new coordinadorImpDao();
        administradorImpDao ad = new administradorImpDao();
        rep = coo.consultarReportes();
    
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <table class=\"highlight centered\"><thead>\r\n");
      out.write("            <tr><th>Nombre</th><th>Paterno</th><th>Materno</th><th>Motivo del Reporte</th></tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

               for (int i = 0; i < rep.size(); i++) {
                 out.print("<tr>"
                        + "<td>"+rep.get(i).getNombre()+"</td><td>"+rep.get(i).getPaterno()+"</td><td>"+rep.get(i).getMaterno()+"</td>"
                                + "<td>"+rep.get(i).getDescripcion()+"</td>"
                                + "<td><button onclick='eliminar("+rep.get(i).getIdAlumno()+", "+rep.get(i).getIdReporte()+");'>Eliminar Reporte</button></td>"
                                + "<td><button onclick='baja("+rep.get(i).getIdAlumno()+");'>Dar de Baja</button></td></tr>");
                }
            
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form method=\"get\" name=\"reporte\" id=\"reporte\" action=\"\">\r\n");
      out.write("            <input type=\"hidden\" name=\"idAlumno\" id=\"idAlumno\">\r\n");
      out.write("            <input type=\"hidden\" name=\"idReporte\" id=\"idReporte\">\r\n");
      out.write("            <input type=\"hidden\" name=\"bot\" id=\"bot\" value=\"\">\r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("        <script src=\"../../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            function eliminar(idA, idR){\r\n");
      out.write("                var opc = confirm(\"¿Desea eliminar este reporte?\");\r\n");
      out.write("                if(opc){\r\n");
      out.write("                document.getElementById(\"idAlumno\").value = idA;\r\n");
      out.write("                document.getElementById(\"idReporte\").value = idR;\r\n");
      out.write("                document.getElementById(\"bot\").value=\"eliminar\";\r\n");
      out.write("                document.getElementById(\"reporte\").submit();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function baja(idA){\r\n");
      out.write("                var opc = confirm(\"¿Seguro que desea dar de Baja a este Alumno?\");\r\n");
      out.write("                if(opc){\r\n");
      out.write("                document.getElementById(\"idAlumno\").value=idA;\r\n");
      out.write("                document.getElementById(\"bot\").value=\"baja\";\r\n");
      out.write("                document.getElementById(\"reporte\").submit();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("             $(document).ready(function(){\r\n");
      out.write("            $('select').formSelect();\r\n");
      out.write("                 });\r\n");
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
