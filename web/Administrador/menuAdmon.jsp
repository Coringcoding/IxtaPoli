<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
         <link rel="stylesheet" href="../css/materialize.min.css">
         <link type="text/css" rel="stylesheet" href="../css/actividades.css">
         <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
    </head>
    <body>
    
     <nav>
         <a href="#" class="brand-logo center">Ixtapoli Virtual</a>
      </nav>
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav">
            <li><div class="user-view">
              <div class="background">
                <img src="fondoSideNav">
              </div>
              <img class="circle" src="images/yuna.jpg">
              <span class="white-text name">Usuario</span>
              <a href="#email"><span class="white-text">Ver mi Informacion</span></a>
            </div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">insert_drive_file</i>Solicitudes</a></li>
            <li><div class="divider"></div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">message</i>Mensajes</a></li>
          </ul>
        
        <div class="row" id="imagenes">
            
            <a href="Solicitudes/solicitudes.jsp">
            <div id="cartas" class="col l3">
                    <img class="responsive-img" src="../img/Solicitudes.jpg" alt="">
                Solicitudes
            </div></a>
           
          <a href="../Administrador/DarBaja/baja.jsp">
              <div id="cartas" class="col l3 offset-l1">
                    <img class="responsive-img" src="../img/Baja.jpg" alt="">
                 Dar de Baja            
            </div></a>
            
            <a href="ActualizarInformacion/ListaAlumno.jsp"><div id="cartas" class="col l3 offset-l1">
                    <img class="responsive-img" src="../img/actualizar.PNG" alt="">
                Actualizar información
                </div></a>
      </div>
        <footer>
            <div class="row">
                <div class="col s12">
                <h6 class="white-text">GIEB Projects</h6>
              </div>
                
            </div>
        </footer>
      
         <script src="../js/jquery-3.3.1.min.js"></script>
         <script src="../js/materialize.min.js"></script>
         <script>
             $(document).ready(function(){
                $('.sidenav').sidenav();
                });
         </script>
    </body>
</html>

</html>
