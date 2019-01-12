package org.apache.jsp.Coordinador.Reportes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ixtapoli.modelo.Reporte;
import com.ixtapoli.impDao.administradorImpDao;
import com.ixtapoli.impDao.coordinadorImpDao;
import java.util.ArrayList;
import java.util.List;
import com.ixtapoli.modelo.Alumno;

public final class GenerarReporte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/materialize.min.css\">\n");
      out.write("        <title>Generar Reporte</title>\n");
      out.write("    </head>\n");
      out.write("    ");

         boolean btn;
            btn = (request.getParameter("bot") != null)?true:false;
            if(btn){
                Reporte r = new Reporte();
                coordinadorImpDao coo = new coordinadorImpDao();
                r.setIdAlumno(new Long(request.getParameter("idAlumno")));
                r.setIdReporte(new Long(request.getParameter("idReporte")));
                if(coo.generarReporte(r)){
                    out.print("<script>alert('Reporte creado')"
                            + "window.location.replace('GenerarReporte.jsp');</script>");
                }else{
                    out.print("<script>alert('Error en Reporte')"
                            + "window.location.replace('GenerarReporte.jsp');</script>");
                }
            }
        
        
        List<Alumno> al = new ArrayList();
        coordinadorImpDao coo = new coordinadorImpDao();
        administradorImpDao ad = new administradorImpDao();
        al = ad.consultarAlumnos(0);
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <table class=\"highlight centered\"><thead>\n");
      out.write("            <tr><th>Nombre</th><th>Paterno</th><th>Materno</th></tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            ");

               for (int i = 0; i < al.size(); i++) {
                 out.print("<tr>"
                        + "<td>"+al.get(i).getNombre()+"</td><td>"+al.get(i).getPaterno()+"</td><td>"+al.get(i).getMaterno()+"</td>"
                                + "<td><select id='sel"+al.get(i).getId()+"'>"
                                + "<option value='1'>No Acudir o dar caso omiso</option>"
                                + "<option value='2'>Duplicidad de Registro</option>"
                                + "</select></td>"
                                + "<td><button onclick='reportar("+al.get(i).getId()+");'>Reportar</button></td></tr>");
                }
            
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        \n");
      out.write("            <form method=\"post\" name=\"reporte\" id=\"reporte\" action=\"\">\n");
      out.write("            <input type=\"hidden\" name=\"idAlumno\" id=\"idAlumno\">\n");
      out.write("            <input type=\"hidden\" name=\"idReporte\" id=\"idReporte\">\n");
      out.write("            <input type=\"hidden\" name=\"bot\" value=\"reportar\">\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <script src=\"../../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"../../js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function reportar(idA){\n");
      out.write("                document.getElementById(\"idAlumno\").value = idA;\n");
      out.write("                var idR = document.getElementById(\"sel\" + idA).value;\n");
      out.write("                document.getElementById(\"idReporte\").value = idR;\n");
      out.write("                document.getElementById(\"reporte\").submit();\n");
      out.write("            }\n");
      out.write("             $(document).ready(function(){\n");
      out.write("            $('select').formSelect();\n");
      out.write("                 });\n");
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
