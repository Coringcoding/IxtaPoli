
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
        <title>Calendario</title>
    </head>
    <body>
        <nav>
            <a href="#" class="brand-logo center">Calendario de Actividades</a>
            <a href="../../Alumno/LoginAlumno/MenuAlumno.jsp" class="brand-logo left">Ixtapoli</a>
      </nav>
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav">
            <li><div class="user-view">
              <div class="background">
                <img src="fondoSideNav">
              </div>
              <img class="circle" src="images/yuna.jpg">
              <span class="white-text name">Usuario</span>
              <a href="#email"><span class="white-text">Ver mi Informacion</span></a>
            </div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">insert_drive_file</i>Equipos</a></li>
            <li><div class="divider"></div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">message</i>Mensajes</a></li>
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
        </main>
        
        <script src="../../js/jquery-3.3.1.min.js"></script>
        <script src="../../js/moment.min.js"></script>
        <script src="../../js/materialize.min.js"></script>
        <script src="../../js/fullcalendar.min.js"></script>
        <script src="../../js/es.js"></script>
        
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
            $(".fc-prev-button, .fc-next-button").attr('class', 'waves-effect waves-light btn red darken-4 btn-flat');
            $("#calendar").fullCalendar("option", "contentHeight",400);
            $('.sidenav').sidenav();
            });
        </script>
    </body>
</html>
