<%@page import="com.ixtapoli.impDao.administradorImpDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ixtapoli.modelo.Alumno"%>
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
            List<Alumno> al = new ArrayList();
            administradorImpDao ad = new administradorImpDao();
            al = ad.consultarAlumnos(0);
        %>
    </head>
    <body>
        <%
                //Sesion
                HttpSession ses =request.getSession();
                String sesu = (String)ses.getAttribute("usuario");
                if(!sesu.equalsIgnoreCase("Administrador")){
                    out.print("<script>alert('Sesion Incorrecta');"
                            + "window.location.href='../../index.html'</script>");
                }

         %>
        
        <script>
            function edit(i){
                var tr = document.getElementById("tr"+i);
                var ida = tr.dataset.idal;
                document.getElementById("idAl").value = ida;
                document.getElementById("editar").submit();
                
            };
            function desplegar(i){
                document.getElementById("esc"+i).style.display="";
                document.getElementById("prom"+i).style.display="";
                document.getElementById("dom"+i).style.display="";
                document.getElementById("rut"+i).style.display="";
                var celda = document.getElementById("accion"+i);
                celda.setAttribute("onclick","ocultar("+i+");");
                celda.innerHTML = "Ocultar";
            };
            
            function ocultar(i){
                document.getElementById("esc"+i).style.display="none";
                document.getElementById("prom"+i).style.display="none";
                document.getElementById("dom"+i).style.display="none";
                document.getElementById("rut"+i).style.display="none";
                var celda = document.getElementById("accion"+i);
                celda.setAttribute("onclick","desplegar("+i+");");
                celda.innerHTML = "Desplegar";
            };
        </script>
        
        <nav>
            <a href="#" class="brand-logo left">Actualizar Informacion</a>
      </nav>
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav" style="background: linear-gradient(to right,#900C3F,#4F011F,#900C3F);">
            <li><div class="user-view" style="color: white;">
                        IXPOLI-GIEBPROJECTS
                    <img class="circle" src="../../img/fondoLogins.jpg">
              <a href="#email"><span class="white-text">Administrador</span></a>
            </div></li> 
            <li><div class="divider"></div></li>
            <li><a href="../menuAdmon.jsp" class="white-text"><i class="material-icons white-text">apps</i>Menu</a></li>
            <li><div class="divider"></div></li>
            <li><a href="../Solicitudes/solicitudes.jsp" class="white-text"><i class="material-icons white-text">all_inclusive</i>Solicitudes</a></li>
            <li><div class="divider"></div></li>
            <li><a href="../DarBaja/baja.jsp" class="white-text"><i class="material-icons white-text">all_inclusive</i>Dar de Baja</a></li>
          </ul>
        
        <main>
        
        <div class="container">
        <table class="highlight centered"><thead>
                <tr><th>Nombre</th><th>Paterno</th><th>Materno</th><th></th></tr>
            </thead>
            <tbody>
            <%
               for (int i = 0; i < al.size(); i++) {
                 out.print("<tr><tr>"
                        + "<td>"+al.get(i).getNombre()+"</td><td>"+al.get(i).getPaterno()+"</td><td>"+al.get(i).getMaterno()+"</td><td id='accion"+i+"' onclick='desplegar("+i+");'>Desplegar</td></tr>"
                        + "<tr id='esc"+i+"'><td>Escuela:</td><td colspan='2'>"+al.get(i).getEscuela()+"</td></tr>"
                        + "<tr id='prom"+i+"'><td>Promedio:</td><td colspan='2'>"+al.get(i).getPromedio()+"</td></tr>"        
                        + "<tr id='dom"+i+"'><td>Domicilio:</td><td colspan='2'>"+al.get(i).getDomicilio()+"</td></tr>"
                        + "<tr id='rut"+i+"'><td>Ruta:</td><td colspan='2'>"+al.get(i).getRutaS()+"</td><td id='tr"+i+"' data-idal='"+al.get(i).getId()+"'  onclick='edit("+i+");'>Actualizar datos</td></tr>"
                        + "</tr>");
                }
            %>
            </tbody>
        </table>
            </div>
            <form method="post" name="editar" id="editar" action="editarDatos.jsp">
                <input type="hidden" id="idAl" name="idAlumno">
            </form>
            
        </main>            
             <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        <script>
                for (var i = 0; i < <%=al.size()%>; i++) {
                       ocultar(i);
                }
        </script>
        <script>
             $(document).ready(function(){
                $('.sidenav').sidenav();
                });
         </script>
    </body>
</html>
