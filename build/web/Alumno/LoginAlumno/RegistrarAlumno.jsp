<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="../../css/materialize.min.css"  media="screen,projection"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>    
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">        
        <title>Registro Alumno</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h4 class="col s12 center-align">Registro Alumno</h4>            
                <form action="../../RegistrarAlumno" method="post" class="col 12">
                    <div class="input-field col s12">
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre" id="nombre">
                    </div>
                    <div class="input-field col s12">
                    <label for="paterno">Apellido Paterno:</label>
                    <input type="text" name="paterno" id="paterno">
                    </div>
                    <div class="input-field col s12">
                    <label for="materno">Apellido Materno:</label>
                    <input type="text" name="materno" id="materno">
                    </div>
                    <div class="input-field col s12">
                    <label for="escuela">Escuela:</label>
                    <input type="text" name="escuela" id="escuela">
                    </div>                    
                    <div class="input-field col s12">
                        <select name="ruta" id="ruta" class="form-control">
                            <option value="" disabled selected>Escoge una opcion</option>
                            <option value="1">Zacatenco</option>
                            <option value="2">Santo Tomas</option>                            
                        </select>
                        <label>Ruta</label>
                    </div>
                    <div class="input-field col s12">
                    <label for="domicilio">Domicilio:</label>
                    <input type="text" name="domicilio" id="domicilio">
                    </div>
                    <div class="input-field col s12">
                    <label for="promedio">Promedio:</label>
                    <input type="number" name="promedio" id="promedio">
                    </div>
                    <div class="input-field col s12">
                    <label for="usuario">Usuario:</label>
                    <input type="text" name="usuario" id="usuario" onchange="return autentica();">
                    </div>
                    <div class="input-field col s12">
                    <label for="contra">Contraseña:</label>
                    <input type="password" name="contra" id="contra">
                    </div>
                    <input type="submit" value="Registrarse"> 
                </form>
            </div>
            
            <span id="error" style="font-family: Verdana, Arial, Helvetica, sans-serif;
                font-size: 12pt;color: #CC3300; position:relative;visibility:hidden;">
                usuario Ocupado ¡¡¡
            </span>
            
        </div>
        <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>  
        <script type="text/javascript" src="../../js/materialize.min.js"></script>         
        <script>            
            $(document).ready(function(){
                $('select').formSelect();
            })            
        </script>
    </body>
</html>
