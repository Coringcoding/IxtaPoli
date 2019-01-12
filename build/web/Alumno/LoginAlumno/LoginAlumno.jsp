<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="../../css/materialize.min.css"  media="screen,projection"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>    
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">        
        <title>Login</title>
    </head>
    <body>
        <div class="container">            
            <div class="row">  
                <div class="col s1">
                    <a class="btn-floating btn waves-effect waves-light" href=""><i class="material-icons">
                            arrow_back
                        </i></a>
                </div>
                <div class="col s11 offset-2 valign-wrapper">
                    <h4 class="center-align">Login Alumno</h4>
                </div>
                <form action="../../IngresarAlumno" method="post" class="col s12">
                    <div class="input-field col s12">
                        <label for="usuario">Usuario</label>
                        <input class="validate" type="text" name="usuario" id="usuario" required>
                    </div>
                    <div class="input-field col s12">
                        <label for="contra">Contraseña</label>
                        <input class="validate" type="password" name="contra" id="contra" required>
                    </div>
                    <div class="center-align col s6">
                        <button class="btn waves-effect waves-light" type="submit" name="action">
                            Iniciar sesion
                        </button>
                    </div>
                    <div class="center-align col s6">
                        <button class="btn waves-effect waves-light" type="button" 
                                onclick="location.href = 'RegistrarAlumno.jsp'" name="registro">
                            Registrarse
                        </button>
                    </div>
                </form>
            </div>
        </div>        
        <script type="text/javascript" src="../../js/materialize.min.js"></script>
        <script type="text/javascript" src="../../js/jquery-3.3.1.min.js">
    </body>
</html>
