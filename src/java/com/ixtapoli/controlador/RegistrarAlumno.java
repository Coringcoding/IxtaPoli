package com.ixtapoli.controlador;

import com.ixtapoli.impDao.alumnoImpDao;
import com.ixtapoli.modelo.Alumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.owasp.esapi.ESAPI;

@WebServlet(name = "RegistrarAlumno", urlPatterns = {"/RegistrarAlumno"})
public class RegistrarAlumno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                        
        String nombre = ESAPI.encoder().encodeForHTML(request.getParameter("nombre"));
        String paterno = ESAPI.encoder().encodeForHTML(request.getParameter("paterno"));
        String materno = ESAPI.encoder().encodeForHTML(request.getParameter("materno"));
        String escuela = ESAPI.encoder().encodeForHTML(request.getParameter("escuela"));
        int ruta = Integer.parseInt(ESAPI.encoder().encodeForHTML(request.getParameter("ruta")));
        String domicilio = ESAPI.encoder().encodeForHTML(request.getParameter("domicilio"));
        float promedio = Float.parseFloat(ESAPI.encoder().encodeForHTML(request.getParameter("promedio")));
        String usuario = ESAPI.encoder().encodeForHTML(request.getParameter("usuario"));
        String contra = ESAPI.encoder().encodeForHTML(request.getParameter("contra"));
        
        Alumno s = new Alumno();
        s.setNombre(nombre);
        s.setPaterno(paterno);
        s.setMaterno(materno);
        s.setEscuela(escuela);
        s.setRuta(ruta);
        s.setDomicilio(domicilio);
        s.setPromedio(promedio);
        s.setUsr(usuario);
        s.setContra(contra);
        
        try {
            
            alumnoImpDao n = new alumnoImpDao();
            n.registrarse(s);
            
            System.out.println("<script>alert('Alumno Registrado');</script>");
            response.sendRedirect("Alumno/LoginAlumno/LoginAlumno.jsp?msj=E4/0McbWmd+2F85Nfvgq2r0wiV4fAwfa5nG0E7KLKA+uV9gulgAT57gVC9iIHSu/dGRX4XYSPrIPixxa0W3Wrg");
            
        } catch (Exception e) {
            System.out.println("<script>alert('Error en registro');</script>");
            response.sendRedirect("Alumno/LoginAlumno/RegistrarAlumno.jsp?msj=Db2Jr0UKPKdnlhF1sgfsVAVsosYzX4d1KhzraA2to2GR5zG5isD4hfL/einIP18n9FnEumOr1zQzhE2SVmFnIQ");
            e.printStackTrace();
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
