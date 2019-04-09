<%@page import="org.owasp.esapi.ESAPI"%>
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
        <link rel="stylesheet" type="text/css" href="../../css/solicitudes.css">
        <title>Generar Reporte</title>
    </head>
    <body>
        <nav>
            <a href="#" class="brand-logo left">Generar Reporte</a>
      </nav>
        
        <main>
        
        <%
         boolean btn;
            btn = (request.getParameter("bot") != null)?true:false;
            if(btn){
                Reporte r = new Reporte();
                coordinadorImpDao coo = new coordinadorImpDao();
                r.setIdAlumno(new Long(ESAPI.encoder().encodeForHTML(request.getParameter("idAlumno"))));
                r.setIdReporte(new Long(ESAPI.encoder().encodeForHTML(request.getParameter("idReporte"))));
                if(coo.generarReporte(r)){
                    out.print("<script>alert('Reporte creado');"
                            + "window.location.replace('GenerarReporte.jsp');</script>");
                }else{
                    out.print("<script>alert('Error en Reporte');"
                            + "window.location.replace('GenerarReporte.jsp');</script>");
                }
            }
        List<Alumno> al = new ArrayList();
        coordinadorImpDao coo = new coordinadorImpDao();
        administradorImpDao ad = new administradorImpDao();
        al = ad.consultarAlumnos(0);
    %>
        <div class="container">
        <table class="highlight centered"><thead>
                <tr><th>Nombre</th><th>Paterno</th><th>Materno</th><th></th><th></th></tr>
            </thead>
            <tbody>
            <%
               for (int i = 0; i < al.size(); i++) {
                 out.print("<tr>"
                        + "<td>"+al.get(i).getNombre()+"</td><td>"+al.get(i).getPaterno()+"</td><td>"+al.get(i).getMaterno()+"</td>"
                                + "<td><select id='sel"+al.get(i).getId()+"'>"
                                + "<option value='1'>Faltó o dio caso omiso sin falta justificada</option>"
                                + "<option value='2'>Duplicidad de Registro</option>"
                                + "<option value='3'>Realización de proselitismo</option>"
                                + "<option value='4'>Información falsa</option>"
                                + "<option value='5'>Promedio menor de 7.5</option>"
                                + "<option value='6'>Falta a  dos jornada convocada por Coordinacion General de Ixtapoli</option>"
                                + "<option value='7'>Excedió el numero de semestres marcados en programa académico</option>"
                                + "</select></td>"
                                + "<td><button onclick='reportar("+al.get(i).getId()+");' class='btn waves-effect waves-light  red darken-4'>Reportar</button></td></tr>");
                }
            %>
            </tbody>
        </table>
            </div>
                    
            <form method="post" name="reporte" id="reporte" action="">
            <input type="hidden" name="idAlumno" id="idAlumno">
            <input type="hidden" name="idReporte" id="idReporte">
            <input type="hidden" name="bot" value="reportar">
        </form>
            
        </main>
            
        <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        <script>
            function reportar(idA){
                document.getElementById("idAlumno").value = idA;
                var idR = document.getElementById("sel" + idA).value;
                document.getElementById("idReporte").value = idR;
                document.getElementById("reporte").submit();
            }
             $(document).ready(function(){
            $('select').formSelect();
                 });
        </script>
    </body>
</html>
