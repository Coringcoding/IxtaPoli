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

@WebServlet(name = "IngresarAlumno", urlPatterns = {"/IngresarAlumno"})
public class IngresarAlumno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = ESAPI.encoder().encodeForHTML(request.getParameter("usuario"));
        String contra = ESAPI.encoder().encodeForHTML(request.getParameter("contra"));
        
        Alumno s = new Alumno();
        
        s.setUsr(usuario);
        s.setContra(contra);
        
        try {
            alumnoImpDao n = new alumnoImpDao();
            boolean marca = n.iniciarSesion(s);
            int estado = n.obtenerEstado(s.getUsr());
            if (marca == true && estado == 0) {
                response.sendRedirect("Alumno/LoginAlumno/Espera.jsp");
            }else if(marca == true && estado == 1) {
                response.sendRedirect("Alumno/LoginAlumno/MenuAlumno.jsp");
            }else if(marca == true && estado == 2) {
                response.sendRedirect("Alumno/LoginAlumno/Rechazado.jsp");
            }else
                response.sendRedirect("Alumno/LoginAlumno/RegistrarAlumno.jsp?msj=6OR6wwKavbbw91rFr2krlmey2TQKZzopgeuPU+Z0o7rt3OSOoO0jLdnL7QPuIDHVjXp8lMFDYdgjHUAEDh3QOQ");
        } catch (Exception e) {
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
