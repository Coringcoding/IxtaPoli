<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="../../css/materialize.min.css">
        <link rel="stylesheet" href="../../css/actividades.css">
        <title>Registrar Actividad</title>
    </head>
    <body>
    <nav>
            <a href="#" class="brand-logo center">Agregar Actividad</a>
      </nav>
        
    
        <main>
            <div class="row">
                <div id="actividadForm" class="col l6 offset-l3">
                <div id="tituloFormFaena"><h4>Registra la Faena</h4></div>    
                
                <form class="col s12" action="../../agregaFaena" method="GET">
                    <div class="input-field col s12">
                    <input type="text" name="nombre" id="nombre" required>
                    <label for="acount">Nombre</label>  
                    </div>

                    <div class="input-field col s12">
                    <input type="text" id="date"   name="fecha" required>
                    <label for="acount">Fecha</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="text" class="timepicker" id="time"  name="hora" required="">
                    <label for="acount">Hora</label>
                    </div>

                    <div class="input-field col s12">
                        <textarea class="materialize-textarea" name="descripcion" maxlength="1000" rows="50" cols="5" id="descripcion" required></textarea>
                    <label for="acount">Descripcion</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="text" name="ubicacion" id="ubicacion" required>
                    <label for="acount">Ubicacion</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="text" name="materiales" id="materiales" required>
                    <label for="acount">Materiales</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="number" name="integrantes" id="integrantes" required>
                    <label for="acount">Integrantes por Equipo</label>
                    </div>
                    
                    <div class="input-field col l3 offset-l9">
                        <button class="waves-effect waves-light btn" type="submit" value="Agregar Faena" name="agregarBtn" id="agregarBtn">
                       Agregar Faena
                    </button>
                    </div>
                </form>
            </div>
        </div>
            </div>
        </main>

            <script src="../../js/jquery-3.3.1.min.js"></script>
            <script src="../../js/materialize.min.js"></script>
            <script>
                $(function(){
                        $('#date').datepicker({
                                format: 'yyyy-mm-dd'
                        });
                    });          
                $(function(){
                        $('#time').timepicker({

                        });
                    });       
            </script>
    </body>
</html>
