/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ixtapoli.controlador;

import com.ixtapoli.impDao.administradorImpDao;
import com.ixtapoli.modelo.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.owasp.esapi.ESAPI;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "IngresarAdministrador", urlPatterns = {"/IngresarAdministrador"})
public class IngresarAdministrador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet requestj
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {    
        
                String Usuario = ESAPI.encoder().encodeForHTML(request.getParameter("usuario"));
                String Contra = ESAPI.encoder().encodeForHTML(request.getParameter("contra"));
                String Clave = ESAPI.encoder().encodeForHTML(request.getParameter("clave"));
                
                
                
                Administrador s = new Administrador();
                
                s.setUsr(Usuario);
                s.setContra(Contra);
                if(Clave.equals("12345")){
                    try{

                        administradorImpDao n = new administradorImpDao();

                        boolean sesion= n.iniciarSesion(s);

                        if(sesion==true){
                            HttpSession ses = request.getSession();
                            ses.setAttribute("usuario", "Administrador");
                             out.println("<script>window.location.replace('Administrador/menuAdmon.jsp');</script>");
                        }
                        else{
                            out.println("<script>alert('El usuario o la Contraseña son incorrectos');"
                            +"window.location.replace('Administrador/RegistroAdministrador.jsp');</script>");
                    }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                else{
                    out.println("<script>alert('Clave Incorrecta');"
                            +"window.location.replace('Administrador/LoginAdministrador.jsp');</script>");
                    
                }
                
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IngresarAdministrador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IngresarAdministrador at " + request.getContextPath() + "</h1>");
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
