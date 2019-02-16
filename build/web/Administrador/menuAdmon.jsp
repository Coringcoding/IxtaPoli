<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="../css/materialize.min.css">
        <!--<link rel="stylesheet" href="../css/menuAdmon.css">-->
        <title>Menu Administrador</title>
    </head>
    <body>
        <nav>
            <div class="#d32f2f red darken-2">
                <a href="../index.html" class="brand-logo">Ixtapoli</a>
                <a href="#" class="brand-logo center">Bienvenido</a>
              <ul id="nav-mobile" class="right hide-on-med-and-down">
                  <li><a href="../pagsInfo/Conocenos.html">Conocenos</a></li>
                  <li><a href="../pagsInfo/Informacion.html">¿Que es Ixtapoli?</a></li>
                  <li><a href="../pagsInfo/Contactos.html">Contactos</a></li>
              </ul>
            </div>
        </nav>
        <main>
            
            <a href="" id="alta">
                <img src="../img/recorrido.jpg" id="imagen">
                Solicitudes
            </a>
            
            <a href="../Administrador/ActualizarInformacion/ListaAlumno.jsp" id="cambio">
                <img src="../img/Solicitudes.jpg" id="imagen">
                Actualizar Informacion  
            </a>

            <a href="../Administrador/DarBaja/baja.jsp" id="baja">
                <img src="../img/Baja.jpg" id="imagen">
                Dar de Baja
            </a>
        </main>
        
        
        
        
        <footer class="#616161 grey darken-2">
          <div class="#616161 grey darken-2">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Footer Content</h5>
                <p class="grey-text text-lighten-4">You can use rows and columns here to organize your footer content.</p>
              </div>
              <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Links</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">Facebook Ixtapoli</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Gobierno Ixtapaluca</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Otra pagina gubernamental</a></li>
                 
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
            </div>
          </div>
        </footer> 
        <script src="../js/jquery-3.3.1.min.js"></script> 
        <script src="../js/materialize.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.8.3.js"></script>
        <script type="text/javascript" src="http://jzaefferer.github.com/jquery-validation/jquery.validate.js"></script>
        
    </body>
</html>
