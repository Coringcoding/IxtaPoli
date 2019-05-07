/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faena;


import com.ixtapoli.impDao.coordinadorImpDao;
import com.ixtapoli.modelo.Faena;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Alumno
 */
@WebServlet(name = "agregaFaena", urlPatterns = {"/agregaFaena"})
public class agregaFaena extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet agregaFaena</title>");     
            
            out.println("</head>");
            out.println("<body>");
           
            out.println("<h1>Servlet agregaFaena at " + request.getContextPath() + "</h1>");
            
            Faena f =  new Faena();
            
            f.setNombre(request.getParameter("nombre"));
            
            f.setFecha(request.getParameter("fecha"));
            
            f.setHoraInicio(request.getParameter("hora"));
            
            f.setDescripcion(request.getParameter("descripcion"));
            
            f.setUbicacion(request.getParameter("ubicacion"));
            
            f.setMateriales(request.getParameter("materiales"));
            
            f.setCupo(Integer.parseInt(request.getParameter("integrantes")));
            
            coordinadorImpDao cord = new coordinadorImpDao();
            
            if(cord.registrarFaena(f)){
                out.println("<script>alert('faena agregada');"
                        + "window.location.replace('Coordinador/Calendario/Calendario.jsp');</script>");
            }else{
                out.println("<script>alert('error al registrar faena');</script>");
            }
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(agregaFaena.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(agregaFaena.class.getName()).log(Level.SEVERE, null, ex);
        }
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
