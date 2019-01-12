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
        
      <div class="row" id="imaqgenes" style="position:absolute;height:auto;margin-right: auto;margin-left: auto;margin-top: 10%;">
            
            <div id="contenido" class="col s3">
                <a style="margin-left: 35%; font-family: sans-serif;color: white;font-size: 20px" href="../../Alumno/Calendario/Calendario.jsp"><img class="circle responsive-img" src="../../img/calendario.jpg" alt=""/>
                Calendario</a>
            </div>
            <div class="col s2">
              
            </div>
            <div id="contenido" class="col s2">
                <a style="font-size: 15px;font-family: sans-serif;color: white;font-size: 20px" href="../../Coordinador/Actividades/Actividades.jsp"> <img class="circle responsive-img" src="../../img/equipos.jpg" alt=""/>
                 Faena</a><!--Es equipos-->            
            </div>
            <div class="col s2">
                
            </div>
            <div id="contenido" class="col s3">
                <img class="circle responsive-img" src="../../img/recorrido.jpg" alt=""/>
                <a style="margin-left: 16%;font-family: sans-serif;color: white;font-size: 20px">Seguimiento de Recorrido</a>
            </div>
          
          
          
      </div>  
        <a href="../../Coordinador/Reportes/GenerarReporte.jsp">Coordinador: Generar Reporte</a>
         <script src="../../js/jquery-3.3.1.min.js"></script>
         <script src="../../js/materialize.min.js"></script>
    </body>
</html>
