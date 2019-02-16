<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
         <link rel="stylesheet" href="../../css/materialize.min.css">
         <link type="text/css" rel="stylesheet" href="../../css/actividades.css">
    </head>
    <body style="background-image: url(../..//img/Calle.jpg);" >
    
    <nav class= nav-extended style="width:100%"> 
    <div class="red" style="width:100%">
    <div class="nav-wrapper">
      <a href="#"  class="brand-logo center" style="margin: 10px 0 0 25px;">Ixtapoli Virtual</a>
    </div> 
    </div>
    </nav>
        
        
        <div class="row" id="imagenes">
            
            <a href="../../Alumno/Calendario/Calendario.jsp">
            <div id="calendario" class="col l3">
                    <img class="responsive-img" src="../../img/calendario.jpg" alt="">
                Calendario
            </div></a>
           
          <a href="../../Coordinador/Actividades/Actividades.jsp">
              <div id="faena" class="col l3 offset-l1">
                    <img class="responsive-img" src="../../img/equipos.jpg" alt="">
                 Faena            
            </div></a><!--Es equipos-->
            
            <a href=""><div id="seguimiento" class="col l3 offset-l1">
                    <img class="responsive-img" src="../../img/recorrido.jpg" alt="">
                Seguimiento de Recorrido
                </div></a>
      </div>
        
        <a href="../../Coordinador/Reportes/GenerarReporte.jsp">Coordinador: Generar Reporte</a>
         <script src="../../js/jquery-3.3.1.min.js"></script>
         <script src="../../js/materialize.min.js"></script>
    </body>
</html>
