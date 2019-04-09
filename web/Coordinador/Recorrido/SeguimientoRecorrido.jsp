<%-- 
API KEY=AIzaSyCAT88KtR8yE1yXKaj4uW_8N3l7BaVb-zI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="../../css/mapa.css">
        <link rel="stylesheet" href="../../css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src='https://api.mapbox.com/mapbox-gl-js/v0.53.0/mapbox-gl.js'></script>
        <link href='https://api.mapbox.com/mapbox-gl-js/v0.53.0/mapbox-gl.css' rel='stylesheet' />
        <title>Seguimiento de Recorrido</title>
    </head>
    <body>
        <nav>
            <a href="#" class="brand-logo center">Seguimiento de recorrido</a>
            <a href="../../Alumno/LoginAlumno/MenuAlumno.jsp" class="brand-logo left">Ixtapoli</a>
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
            <li><a href="#!" class="white-text"><i class="material-icons white-text">insert_drive_file</i>Equipos</a></li>
            <li><div class="divider"></div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">message</i>Mensajes</a></li>
          </ul>
        
        <main>
            <div class="row">
                <div id="map" class="col l10 offset-l1"></div>
            </div>
        
        </main>
        
        <script src="../../js/mapa.js"></script>
        <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        
        <script>
            $(document).ready(function(){
            $('.sidenav').sidenav();
            });
        </script>
    
    </body>
</html>
