<%@page import="com.ixtapoli.modelo.Solicitud"%>
<%@page import="com.ixtapoli.impDao.administradorImpDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="../../css/materialize.min.css">
        <link rel="stylesheet" type="text/css" href="../../css/solicitudes.css">
        <title>Alumnos</title>
        
        <%
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
        
    %>
        
        <%
            List<Solicitud> sol = new ArrayList();
            administradorImpDao ad = new administradorImpDao();
            sol = ad.consultarSolicitudes();
        %>
    </head>
    <body>
        <script>
            function aceptarSoli(i, e){
                var tr = document.getElementById("tr"+i);
                var ids = tr.dataset.ids;
                document.getElementById("ids").value = ids;
                document.getElementById("estado").value = e;
                document.getElementById("aceptar").submit();
            };
            
            
            function desplegar(i){
                document.getElementById("esc"+i).style.display="";
                document.getElementById("prom"+i).style.display="";
                document.getElementById("dom"+i).style.display="";
                document.getElementById("usr"+i).style.display="";
                document.getElementById("rut"+i).style.display="";
                var celda = document.getElementById("accion"+i);
                celda.setAttribute("onclick","ocultar("+i+");");
                celda.innerHTML = "Ocultar";
            };
            
            function ocultar(i){
                document.getElementById("esc"+i).style.display="none";
                document.getElementById("prom"+i).style.display="none";
                document.getElementById("dom"+i).style.display="none";
                document.getElementById("usr"+i).style.display="none";
                document.getElementById("rut"+i).style.display="none";
                var celda = document.getElementById("accion"+i);
                celda.setAttribute("onclick","desplegar("+i+");");
                celda.innerHTML = "Desplegar";
            };
        </script>
        
        <nav>
            <a href="#" class="brand-logo left">Solicitudes</a>
      </nav>
        <main>
        
        <div class="row">
        <table class="highlight centered col l8 offset-l2"><thead>
            <tr><th>Nombre</th><th>Paterno</th><th>Materno</th></tr>
            </thead>
            <tbody>
            <%
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
            %>
            </tbody>
        </table>
            </div>
            <form method="get" name="aceptar" id="aceptar" action="solicitudes.jsp">
                <input type="hidden" id="ids" name="ids">
                <input type="hidden" id="estado" name="estado">
                <input type="hidden" id="bot" name="bot" value="bot">
            </form>
            </main>
            
             <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        <script>
                for (var i = 0; i < <%=sol.size()%>; i++) {
                       ocultar(i);
                }
        </script>
    </body>
</html>
