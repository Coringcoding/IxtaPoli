
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
        <div class="#d32f2f red darken-2">
            <a href="../LoginAlumno/MenuAlumno.jsp" class="brand-logo">Ixtapoli</a>
            
        </div>
      </nav>        
            <div id="calendar"></div>
            
            <!-- Modal Structure -->
            <div id="modal" class="modal modal-fixed-footer">
              <div class="modal-content">
                  <h4 id="title"></h4>
                  <p id="fecha"></p>
                  <p id="hora"></p>
                  <textarea id="descripcion"></textarea>
                  <p id="ubicacion"></p>
                  <p id="materiales"></p>
                  <p id="cupo"></p>
              </div>
              <div class="modal-footer">
                <a href="#!" class="modal-close waves-effect waves-red btn-flat">Agree</a>
              </div>
            </div>
            
        
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
                $("#title").text("Nombre de la Faena: " + calEvent.title); 
                $("#fecha").text("Fecha: "+calEvent.fecha);
                $("#hora").text("Hora: "+calEvent.hora);
                $("#descripcion").text("Descripcion: " + calEvent.descripcion);
                $("#ubicacion").text("Ubicacion: "+calEvent.ubicacion);
                $("#materiales").text("Materiales: "+calEvent.materiales);
                $("#cupo").text("Cupo: "+calEvent.cupo);
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
        
            });
        </script>
    </body>
</html>
