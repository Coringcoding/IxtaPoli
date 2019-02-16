<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="../css/materialize.min.css">
        <link rel="stylesheet" href="../css/loginAdministrador.css">
        <title>Login Administrador</title>
    </head>
    <body>
        
        <nav>
        <div>
            <a href="#" class="brand-logo center">Login</a>
        </div>
      </nav>
        
    <main>
        
        <form action="../IngresarAdministrador" id="formLoginA">
            <div><h4>Administrador</h4></div>
            <div class="input-field">
                <input id="clave" name="clave" type="text" class="validate" class="required number">
                <label for="clave">Clave Especial</label>
            </div>
            <div class="input-field">
                <input id="usuario" name="usuario" type="text" class="validate" class="required">
                <label for="usuario">Usuario</label>
            </div>
            <div class="input-field">
                <input id="contraseña" name="contraseña" type="password" class="validate" class="required">
                <label for="contraseña">Contraseña</label>
            </div>
            
            <div class="row espacio">
                <a href="RegistroAdministrador.jsp" ID="linkLoginA" class="col l7 input-field">¿Aún no tienes cuenta?</a>
            <button class="btn waves-effect waves-light  red darken-4 col l5 input-field" type="submit" name="ingresar" value="Ingresar">
                Ingresar<i class="material-icons right">send</i>
            </button>
            </div>
        </form>
    </main>
        <footer>
            <div class="row">
                <div class="col l2">
                    <a href="../index.html"><h5 class="white-text">IXTAPOLI</h5></a>
              </div>
                <div class="col l2 offset-l8">
                    <h5 class="white-text">GIEB Projects</h5>
                </div>
            </div>
        </footer>
        
        <script src="../js/jquery-3.3.1.min.js"></script> 
        <script src="../js/materialize.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.8.3.js"></script>
        <script type="text/javascript" src="http://jzaefferer.github.com/jquery-validation/jquery.validate.js"></script>
        
        <script type="text/javascript">
            function validarFormulario(){
          $("#formLoginA").validate();
       }
       $(document).ready(function(){
          validarFormulario();
       });
        </script>
    </body>
</html>
