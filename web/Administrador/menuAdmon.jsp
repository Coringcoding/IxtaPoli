<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
         <link rel="stylesheet" href="../css/materialize.min.css">
         <link type="text/css" rel="stylesheet" href="../css/menuAdmon.css">
    </head>
    <body>
    
    <nav class= nav-extended> 
    <div class="nav-wrapper">
      <a href="#"  class="brand-logo center">Ixtapoli Virtual</a>
    </div> 
    </nav>
        
        
        <div class="row" id="imagenes">
            
            <a href="Solicitudes/solicitudes.jsp">
            <div id="solicitudes" class="col l3">
                    <img class="responsive-img" src="../img/Solicitudes.jpg" alt="">
                Solicitudes
            </div></a>
           
          <a href="../Administrador/DarBaja/baja.jsp">
              <div id="Baja" class="col l3 offset-l1">
                    <img class="responsive-img" src="../img/Baja.jpg" alt="">
                 Dar de Baja            
            </div></a>
            
            <a href="ActualizarInformacion/ListaAlumno.jsp"><div id="seguimiento" class="col l3 offset-l1">
                    <img class="responsive-img" src="../img/recorrido.jpg" alt="">
                Actualizar información
                </div></a>
      </div>
        
         <script src="../../js/jquery-3.3.1.min.js"></script>
         <script src="../../js/materialize.min.js"></script>
    </body>
</html>

</html>
