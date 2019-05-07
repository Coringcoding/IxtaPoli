
<%@page import="com.ixtapoli.impDao.alumnoImpDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%alumnoImpDao alumno = new alumnoImpDao(); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="../../css/materialize.min.css">
        <link rel="stylesheet" href="../../css/fullcalendar.min.css">
        <link rel="stylesheet" href="../../css/calendario.css">
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <title>Calendario</title>
    </head>
    <body>
        <%
                //Sesion
                HttpSession ses =request.getSession();
                String sesu = (String)ses.getAttribute("usuario");
                if(!sesu.equalsIgnoreCase("Coordinador")){
                    out.print("<script>alert('Sesion Incorrecta');"
                            + "window.location.href='../../index.html'</script>");
                }
         %>
        <nav>
            <a href="#" class="brand-logo center">Calendario de Actividades</a>
            <a href="../../Coordinador/LoginCoordinador/MenuCoordinador.jsp" class="brand-logo left">Ixtapoli</a>
      </nav>
         <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav" style="background: linear-gradient(to right,#900C3F,#4F011F,#900C3F);">
            <li><div class="user-view" style="color: white;">
                        IXPOLI-GIEBPROJECTS
                        <img class="circle" src="../../img/fondoRegistro.jpg">
              <a href="#email"><span class="white-text">Coordinador</span></a>
            </div></li> 
            <li><div class="divider"></div></li>
            <li><a href="../LoginCoordinador/MenuCoordinador.jsp" class="white-text"><i class="material-icons white-text">apps</i>Menu</a></li>
            <li><div class="divider"></div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">all_inclusive</i>Equipos de Actividades</a></li>
            <li><div class="divider"></div></li>
            <li><a href="../Recorrido/SeguimientoRecorrido.jsp" class="white-text"><i class="material-icons white-text">all_inclusive</i>Seguimiento de Recorrido</a></li>
            <li><div class="divider"></div></li>
            <li><a href="../Reportes/GenerarReporte.jsp" class="white-text"><i class="material-icons white-text">all_inclusive</i>Generar Reporte</a></li>
        </ul>
        
        <main>
            <div id="calendar"></div>
            
            <!-- Modal Structure -->
            <div id="modal" class="modal modal-fixed-footer"><!-- bottom-sheet -->
              <div class="modal-content">
                  <h3 id="title"></h3>
                  <div class="row">
                      <p id="fecha" class="col l6"></p>
                      <p id="hora" class="col l6"></p>
                      <p class="col l4">
                          Descripción
                      </p>
                      <textarea id="descripcion" readonly class="col l8"></textarea>
                      <p id="ubicacion" class="col l6"></p>
                      <p id="materiales" class="col l6"></p>
                      <p id="cupo" class="col l6"></p>
                  </div>
              </div>
                <div class="row">
              <div class="modal-footer">
                      <a href="#!" class="modal-close waves-effect waves-red btn-flat col l12" id="cerrar">Aceptar</a>
              </div>
            </div>
            </div>
            
            <div class="row">
            <div class="col l5 offset-l6" id="actividadForm" >
            <div id="contenido" class="col s12">
                <h4 style="margin-left: 20%" >Registra una Faena</h4>                
                <form  action="../../agregaFaena" method="POST" onsubmit="return validar('agregarEvento')" id="agregarEvento">
                    <div class="input-field col s4">
                    <input type="text" name="nombre" id="nombre" required autocomplete="off" maxlength="45" onkeypress="LetrasNumeros(event);">
                    <label for="nombre" class="">Nombre</label>  
                    </div>

                    <div class="input-field col s4">
                        <input type="text" id="date"   name="fecha" required readonly="">
                    <label for="fecha" class="">Fecha</label>
                    </div>

                    <div class="input-field col s4">
                        <input type="text" class="timepicker" id="time"  name="hora" required="" readonly="">
                    <label for="hora" class="">Hora</label>
                    </div>

                    <div class="input-field col s6">
                        <textarea class="materialize-textarea" name="descripcion" maxlength="1000" rows="50" cols="10" id="descripcion" required></textarea>
                    <label for="acount" class="">Descripcion</label>
                    </div>

                    <div class="input-field col s6">
                    <input type="text" name="ubicacion" id="ubicacion" required="" autocomplete="off" maxlength="45" onkeypress="LetrasNumeros(event);">
                    <label for="ubicacion" class=" ">Ubicacion</label>
                    </div>
                    
                    <div class="col s12">
                    <div class="input-field col s6">
                        <input type="number" name="integrantes" id="integrantes" required min="1" max="10" step="1">
                    <label for="integrantes" class="">Integrantes por Equipo</label>
                    </div>
                        <div class="input-field col s6">
                    <input type="text" name="materiales" id="materiales" required="" autocomplete="off" maxlength="100" onkeypress="LetrasNumeros(event);">
                    <label for="materiales" class="">Materiales</label>
                    </div>
                    </div>
                    
                    <div class="input-field">
                        <button class="waves-effect waves-light btn col s12" type="submit" value="Agregar Faena" name="agregarBtn" id="agregarBtn">
                       Agregar Faena
                    </button>
                    </div>
                </form>
            </div>
        </div>
            </div>            
            
        </main>
        <footer>
            <div class="row">
                <div class="col s8">
                <h6 class="white-text">GIEB Projects</h6>
              </div>
              </div>
                
            </div>
        </footer>
        
        <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/moment.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        <script src="../../js/fullcalendar.min.js"></script>
        <script src="../../js/es.js"></script>
        <script src="../../js/validaciones.js"></script>
        
        <script>
          function even(calEvent, jsEvent, view){
              var elem= document.getElementById("modal");
                var instance = M.Modal.init(elem);
                instance.open();
                $("#title").text("Faena: " + calEvent.title); 
                $("#fecha").text("Fecha: "+calEvent.fecha);
                $("#hora").text("Hora: "+calEvent.hora);
                $("#descripcion").text(calEvent.descripcion);
                $("#ubicacion").text("Ubicacion: "+calEvent.ubicacion);
                $("#materiales").text("Materiales: "+calEvent.materiales);
                $("#cupo").text("Alumnos por Equipo: "+calEvent.cupo);
          }  
        </script>
        <%
            out.print(alumno.verCalendario());
        %>
        <script>
            $(document).ready(function(){
            $('.modal').modal();
            $(".fc-prev-button, .fc-next-button").attr('class', 'waves-effect waves-light btn flecha btn-flat');
            $("#calendar").fullCalendar("option", "contentHeight",400);
            $('.sidenav').sidenav();
            });
        </script>
        
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
