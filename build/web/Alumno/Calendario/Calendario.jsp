
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
        <%
                //Sesion
                HttpSession ses =request.getSession();
                String sesu = (String)ses.getAttribute("usuario");
                if(!sesu.equalsIgnoreCase("Alumno")){
                    out.print("<script>alert('Sesion Incorrecta');"
                            + "window.location.href='../../index.html'</script>");
                }

         %>
        <nav>
            <a href="#" class="brand-logo center">Calendario de Actividades</a>
            <a href="../../Alumno/LoginAlumno/MenuAlumno.jsp" class="brand-logo left">Ixtapoli</a>
      </nav>
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="slide-out" class="sidenav" style="background: linear-gradient(to right,#900C3F,#4F011F,#900C3F);">
            <li><div class="user-view" style="color: white;">
                        IXPOLI-GIEBPROJECTS
                    <img class="circle" src="../../img/fondoLogins1.jpg">
              <a href="#email"><span class="white-text">Alumno</span></a>
            </div></li> 
            <li><div class="divider"></div></li>
            <li><a href="../LoginAlumno/MenuAlumno.jsp" class="white-text"><i class="material-icons white-text">apps</i>Menu</a></li>
            <li><div class="divider"></div></li>
            <li><a href="#!" class="white-text"><i class="material-icons white-text">all_inclusive</i>Equipos de Actividades</a></li>
            <li><div class="divider"></div></li>
            <li><a href="../Recorrido/SeguimientoRecorrido.jsp" class="white-text"><i class="material-icons white-text">all_inclusive</i>Seguimiento de Recorrido</a></li>
          </ul>
        
        <main>
            <div class="row">
                <div id="calendar"></div>
                
                <div class="col l5 offset-l6">
              <div class="card" >
                 <div class="card-left">
                     <img src="../../img/ixtapoli.jpg" />
                   <h4>Información de Faenas</h4>
                 </div>
                 <div class="card-right">
                   <h3 class="card-title" id="title">Selecciona una Faena para mostrar su informaación</h3>
                   <p id="descripcion">Descripcion:</p>
                   <p id="ubicacion">Ubicacion:</p>
                   <p id="materiales">Materiales:</p>
                   <p id="cupo">Alumnos por Equipo:</p>
                   <div class="card-meta">
                           <p><i class="material-icons">date_range</i><span id="fecha">Fecha:</span></p>
                           <p><i class="material-icons">access_time</i><span id="hora">Hora:</span></p>
                   </div>
                   </div>
                 </div>
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
                $("#title").text(calEvent.title); 
                $("#fecha").text(calEvent.fecha);
                $("#hora").text(calEvent.hora);
                $("#descripcion").text("Descripcion: " + calEvent.descripcion);
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
            $(".fc-prev-button, .fc-next-button").attr('class', 'waves-effect waves-light btn flecha btn-flat');
            $("#calendar").fullCalendar("option", "contentHeight",400);
            $('.sidenav').sidenav();
            });
        </script>
    </body>
</html>
