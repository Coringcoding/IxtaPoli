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
            <%
                //Sesion
                HttpSession ses =request.getSession();
                String sesu = (String)ses.getAttribute("usuario");
                if(!sesu.equalsIgnoreCase("Administrador")){
                    out.print("<script>alert('Sesion Incorrecta');"
                            + "window.location.href='../index.html'</script>");
                }

         %>
    
     <nav>
         <a href="#" class="brand-logo center">Ixtapoli Virtual</a>
      </nav>
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav" style="background: linear-gradient(to right,#900C3F,#4F011F,#900C3F);">
            <li><div class="user-view" style="color: white;">
                        IXPOLI-GIEBPROJECTS
                        <img class="circle" src="../img/fondoLogins.jpg">
              <a href="#email"><span class="white-text">Administrador</span></a>
            </div></li> 
            <li><div class="divider"></div></li>
            <li><a href="../index.html" class="white-text"><i class="material-icons white-text">supervisor_account</i>Cerrar Sesion</a></li>
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
