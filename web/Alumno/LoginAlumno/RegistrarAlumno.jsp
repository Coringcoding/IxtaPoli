<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    try {            
            if(request.getParameter("msj").equals("6OR6wwKavbbw91rFr2krlmey2TQKZzopgeuPU Z0o7rt3OSOoO0jLdnL7QPuIDHVjXp8lMFDYdgjHUAEDh3QOQ")) {
                out.print("<script>alert('Informacion incorrecta');</script>");
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
        <link rel="stylesheet" type="text/css" href="../../css/registrar.css">
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <title>Registro Alumno</title>
    </head>
    <body>
        
        <nav>
        <div>
            <a href="#" class="brand-logo center">Registro Alumno</a>
        </div>
      </nav>
        
        <main>
            <div class="row">           
                <form action="../../RegistrarAlumno" method="post" class="col 12" id="formregistro" name="formregistroAl" onsubmit="return valReg('formregistroAl');">
                    
                    <div class="row">
                    <div class="input-field col l6">
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre" id="nombre">
                    </div>
                    <div class="input-field col l6">
                    <label for="paterno">Apellido Paterno:</label>
                    <input type="text" name="paterno" id="paterno">
                    </div>
                    </div>
                    
                    <div class="row">
                    <div class="input-field col l6">
                    <label for="materno">Apellido Materno:</label>
                    <input type="text" name="materno" id="materno">
                    </div>
                    <div class="input-field col l6">
                    <label for="escuela">Escuela:</label>
                    <input type="text" name="escuela" id="escuela">
                    </div>     
                    </div>
                    
                    <div class="row">
                    <div class="input-field col l6">
                        <select name="ruta" id="ruta" class="form-control">
                            <option value="" disabled selected>Escoge una opcion</option>
                            <option value="1">Zacatenco</option>
                            <option value="2">Santo Tomas</option>                            
                        </select>
                        <label>Ruta</label>
                    </div>
                    <div class="input-field col l6">
                    <label for="domicilio">Domicilio:</label>
                    <input type="text" name="domicilio" id="domicilio">
                    </div>
                    </div>
                    
                    <div class="row">    
                    <div class="input-field col l6">
                    <label for="promedio">Promedio:</label>
                    <input type="number" name="promedio" id="promedio">
                    </div>
                    <div class="input-field col l6">
                    <label for="usuario">Usuario:</label>
                    <input type="text" name="usuario" id="usuario" onchange="return autentica();">
                    </div>
                    </div>
                    
                    <div class="row">    
                    <div class="input-field col l6">
                    <label for="contra">Contraseña:</label>
                    <input type="password" name="contra" id="contra">
                    </div>
                      <div class="input-field col l6">
                    <input id="confcontra" name="confcontra" type="password" class="validate">
                    <label for="confcontra">Confirmar Contraseña</label>
                     </div>
                    </div>
                    
                    <div class="row">
                        <a class="col l1  offset-l1 input-field" href="LoginAlumno.jsp">Regresar</a>
                        <button class="btn waves-effect waves-light  red darken-4 col l3 offset-l6 input-field" type="submit" name="Registrarse" value="Registrarse">
                        Registrase<i class="material-icons right">send</i>
                        </button>
                    </div>
                    <div class="row"></div>
                </form>
            </div>
            
             </main>
            
            <footer>
            <div class="row">
                <div class="col l2">
                <h5 class="white-text">IXTAPOLI</h5>
              </div>
                <div class="col l2 offset-l8">
                    <h5 class="white-text">GIEB Projects</h5>
                </div>
            </div>
        </footer>
            
       
        <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>  
        <script type="text/javascript" src="../../js/materialize.min.js"></script> 
        <script src="../../js/validaciones.js"></script>
        
        <script>            
            $(document).ready(function(){
                $('select').formSelect();
            });           
        </script>
    </body>
</html>
