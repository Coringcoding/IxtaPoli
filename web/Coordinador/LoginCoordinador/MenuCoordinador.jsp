<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
         <link rel="stylesheet" href="../../css/materialize.min.css">
         <link type="text/css" rel="stylesheet" href="../../css/actividades.css">
          <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
    </head>
    <body>
        <%
                //Sesion
                HttpSession ses =request.getSession();
                String sesu = (String)ses.getAttribute("usuario");
                if(!sesu.equalsIgnoreCase("Coordinador")){
                    out.print("<script>alert('Sesion Incorrecta');"
                            + "window.location.href='../../index.html'</script>");
                }
         %>
       <nav>
            <a href="#" class="brand-logo center">Ixtapoli Virtual</a>
      </nav>
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav" style="background: linear-gradient(to right,#900C3F,#4F011F,#900C3F);">
            <li><div class="user-view" style="color: white;">
                        IXPOLI-GIEBPROJECTS
                        <img class="circle" src="../../img/fondoRegistro.jpg">
              <a href="#email"><span class="white-text">Coordinador</span></a>
            </div></li> 
            <li><div class="divider"></div></li>
            <li><a href="../../index.html" class="white-text"><i class="material-icons white-text">supervisor_account</i>Cerrar Sesion</a></li>
          </ul>
        
        <main>
            <div class="row" id="imagenes">
            <div class="col s12">   
            <a href="../Calendario/Calendario.jsp">
            <div id="cartas" class="col s3">
                    <img class="responsive-img" src="../../img/calendario.jpg" alt="">
                Calendario
            </div></a>
           
          <a href="">
              <div id="cartas" class="col s3">
                    <img class="responsive-img" src="../../img/equipos.jpg" alt="">
                 Equipos de Actividades            
            </div></a>
            
            <a href="../Recorrido/SeguimientoRecorrido.jsp">
                <div id="cartas" class="col s3">
                    <img class="responsive-img" src="../../img/recorrido.jpg" alt="">
                Seguimiento de Recorrido
                </div></a>
            
            <a href="../../Coordinador/Reportes/GenerarReporte.jsp">
                <div id="cartas" class="col s3">
                    <img class="responsive-img" src="../../img/Baja.jpg" alt="">
                Generar Reporte
                </div></a>
      </div>
        </div>
        </main>
        
         <script src="../../js/jquery-3.3.1.min.js"></script>
         <script src="../../js/materialize.min.js"></script>
         <script>
             $(document).ready(function(){
                $('.sidenav').sidenav();
                });
        
         </script>
    </body>
</html>
