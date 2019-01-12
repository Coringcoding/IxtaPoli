<%@page import="org.owasp.esapi.ESAPI"%>
<%@page import="com.ixtapoli.impDao.alumnoImpDao"%>
<%@page import="com.ixtapoli.modelo.Reporte"%>
<%@page import="com.ixtapoli.impDao.administradorImpDao"%>
<%@page import="com.ixtapoli.impDao.coordinadorImpDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ixtapoli.modelo.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="../../css/materialize.min.css">
        <title>Dar de Baja</title>
    </head>
    <body>
        <%
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
    %>
        <div class="container">
        <table class="highlight centered"><thead>
            <tr><th>Nombre</th><th>Paterno</th><th>Materno</th><th>Motivo del Reporte</th></tr>
            </thead>
            <tbody>
            <%
               for (int i = 0; i < rep.size(); i++) {
                 out.print("<tr>"
                        + "<td>"+rep.get(i).getNombre()+"</td><td>"+rep.get(i).getPaterno()+"</td><td>"+rep.get(i).getMaterno()+"</td>"
                                + "<td>"+rep.get(i).getDescripcion()+"</td>"
                                + "<td><button onclick='eliminar("+rep.get(i).getIdAlumno()+", "+rep.get(i).getIdReporte()+");'>Eliminar Reporte</button></td>"
                                + "<td><button onclick='baja("+rep.get(i).getIdAlumno()+");'>Dar de Baja</button></td></tr>");
                }
            %>
            </tbody>
        </table>
            </div>
            
            <form method="get" name="reporte" id="reporte" action="">
            <input type="hidden" name="idAlumno" id="idAlumno">
            <input type="hidden" name="idReporte" id="idReporte">
            <input type="hidden" name="bot" id="bot" value="">
        </form>
            
        <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        
        <script>
            function eliminar(idA, idR){
                var opc = confirm("¿Desea eliminar este reporte?");
                if(opc){
                document.getElementById("idAlumno").value = idA;
                document.getElementById("idReporte").value = idR;
                document.getElementById("bot").value="eliminar";
                document.getElementById("reporte").submit();
                }
            }
            function baja(idA){
                var opc = confirm("¿Seguro que desea dar de Baja a este Alumno?");
                if(opc){
                document.getElementById("idAlumno").value=idA;
                document.getElementById("bot").value="baja";
                document.getElementById("reporte").submit();
                }
            }
            
             $(document).ready(function(){
            $('select').formSelect();
                 });
        </script>
    </body>
</html>
