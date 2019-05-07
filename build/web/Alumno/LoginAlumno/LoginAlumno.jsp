<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    try {
            if(request.getParameter("msj").equals("E4/0McbWmd 2F85Nfvgq2r0wiV4fAwfa5nG0E7KLKA uV9gulgAT57gVC9iIHSu/dGRX4XYSPrIPixxa0W3Wrg")) {
                out.print("<script>alert('Solicitud enviada');</script>");
            }else if(request.getParameter("msj").equals("Db2Jr0UKPKdnlhF1sgfsVAVsosYzX4d1KhzraA2to2GR5zG5isD4hfL/einIP18n9FnEumOr1zQzhE2SVmFnIQ")) {
                out.print("<script>alert('Error en envío de solicitud');</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

%>
<html>
    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="../../css/materialize.min.css"  media="screen,projection"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>    
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">     
        <link type="text/css" rel="stylesheet" href="../../css/loginAdministrador.css">
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <title>Login Alumno</title>
    </head>
    <body>
        <nav>
        <div>
            <a href="#" class="brand-logo center">Login</a>
        </div>
      </nav>
        
        <main>
                <form action="../../IngresarAlumno" method="post" class="col l" id="formLoginA" onsubmit="return validar('formLoginA');">
                    <div id="tituloFormAlumno"><h4>Alumno</h4></div>
                    
                    <div class="input-field" id="labUs">
                        <label for="usuario" >Usuario</label>
                        <input class="validate" type="text" name="usuario" id="usuario" required autocomplete="off" maxlength="45" onkeypress="LetrasNumeros(event);">
                    </div>
                    <div class="input-field">
                        <label for="contra">Contraseña</label>
                        <input class="validate" type="password" name="contra" id="contra" required autocomplete="off" maxlength="45" onkeypress="LetrasNumeros(event);">
                    </div>
                    
                    
                    <div class="row espacio2">
                        <a href="RegistrarAlumno.jsp" ID="linkLoginA" class="col l4">Crear Registro</a>
                        
                        <button class="btn waves-effect waves-light red darken-4 col l6  offset-l2" type="submit" name="action">
                            Iniciar Sesion<i class="material-icons right">send</i>
                        </button>
                    </div>
                        
                </form>
        </main>
        
        <footer>
            <div class="row">
                <div class="col l2">
                    <a href="../../index.html"><h5 class="white-text">IXTAPOLI</h5></a>
              </div>
                <div class="col l2 offset-l8">
                    <h5 class="white-text">GIEB Projects</h5>
                </div>
            </div>
        </footer>
        
        <script type="text/javascript" src="../../js/materialize.min.js"></script>
        <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/validaciones.js"></script>
    </body>
</html>
