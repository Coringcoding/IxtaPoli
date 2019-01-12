<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="../../css/materialize.min.css">
        <link type="text/css" rel="stylesheet" href="../../css/actividades.css">
        
    <body style="background-image: url(../..//img/fondoCoordinador.jpg);">    
    <nav id="nav" style="position: absolute; height: 12%"><h4>Agregar Actividad</h4></nav>
        
    </head>
        
        <div class="row" id="actividadForm" style="height:120%;margin-top: 5%;border-radius: 50px">
            <div id="contenido" class="col s12">
                <h4 style="margin-left: 35%" class="red-text">Ingresa los datos</h4>
                
                <form class="col s12" action="../../agregaFaena" method="GET">
                    <div class="input-field col s12">
                    <input type="text" name="nombre" id="nombre" required>
                    <label for="acount" class=" grey-text darken-3-text">Nombre</label>  
                    </div>

                    <div class="input-field col s12">
                    <input type="text" id="date"   name="fecha" required>
                    <label for="acount" class=" grey-text darken-3-text">Fecha</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="text" class="timepicker" id="time"  name="hora" required="">
                    <label for="acount" class=" grey-text darken-3-text">Hora</label>
                    </div>

                    <div class="input-field col s12">
                        <textarea class="materialize-textarea" name="descripcion" maxlength="1000" rows="50" cols="10" id="descripcion" required></textarea>
                    <label for="acount" class=" grey-text darken-3-text">Descripcion</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="text" name="ubicacion" id="ubicacion" required>
                    <label for="acount" class=" grey-text darken-3-text">Ubicacion</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="text" name="materiales" id="materiales" required>
                    <label for="acount" class=" grey-text darken-3-text">Materiales</label>
                    </div>

                    <div class="input-field col s12">
                    <input type="number" name="integrantes" id="integrantes" required>
                    <label for="acount" class=" grey-text darken-3-text">Integrantes por Equipo</label>
                    </div>

                    <button class="waves-effect waves-light btn"  style="background-color: red" type="submit" value="Agregar Faena" name="agregarBtn">
                       Agregar Faena
                    </button>
                </form>
            </div>
        </div>

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
