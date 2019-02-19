<%@page import="org.owasp.esapi.ESAPI"%>
<%@page import="com.ixtapoli.impDao.administradorImpDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ixtapoli.modelo.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="../../css/materialize.min.css"  media="screen,projection"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>    
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" type="text/css" href="../../css/administrador.css">
        <title>Editar Datos</title>
    </head>
    <%
        boolean btn;
            btn = (request.getParameter("bot") != null)?true:false;
        if(btn){
            Alumno alu = new Alumno();
            administradorImpDao admon = new administradorImpDao();
            alu.setId(Long.parseLong(ESAPI.encoder().encodeForHTML(request.getParameter("idAlumno"))));
            alu.setNombre(ESAPI.encoder().encodeForHTML(request.getParameter("nombre")));
            alu.setPaterno(ESAPI.encoder().encodeForHTML(request.getParameter("paterno")));
            alu.setMaterno(ESAPI.encoder().encodeForHTML(request.getParameter("materno")));
            alu.setEscuela(ESAPI.encoder().encodeForHTML(request.getParameter("escuela")));
            alu.setDomicilio(ESAPI.encoder().encodeForHTML(request.getParameter("domicilio")));
            alu.setPromedio(Float.parseFloat(ESAPI.encoder().encodeForHTML(request.getParameter("promedio"))));
            alu.setUsr(ESAPI.encoder().encodeForHTML(request.getParameter("usuario")));
            alu.setContra(ESAPI.encoder().encodeForHTML(request.getParameter("contra")));
            if(admon.actualizarDatos(alu)){
                out.print("<script>alert('Datos Actualizados'); window.location.replace('ListaAlumno.jsp');</script>");
            }else{
                out.print("<script>alert('Error al Actualizar'); window.location.replace('ListaAlumno.jsp');</script>");
            }
        }
        
        List<Alumno> al = new ArrayList();
        administradorImpDao ad = new administradorImpDao();
        Alumno a = new Alumno();
        a = ad.consultarAlumnos(Integer.parseInt(request.getParameter("idAlumno"))).get(0);
        
    %>
    <body>
           <nav>
        <div>
            <a href="#" class="brand-logo center">Actualizar Informacion</a>
        </div>
      </nav>
        
        <main>
            <div class="row">           
                <form action="" method="post" class="col l8 offset-l2" id="formregistroAl" name="editar" onsubmit="return valReg('formregistroAl');">
                    <div id="namA">Alumno</div>
                    <input  type="hidden" id="idAlumno" name="idAlumno" value="<%=a.getId()%>">
                    
                    <div class="row">
                    <div class="input-field col l6">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" value="<%=a.getNombre()%>">
                    </div>
                    <div class="input-field col l6">
                    <label for="paterno">Apellido Paterno:</label>
                    <input type="text" id="paterno" name="paterno" value="<%=a.getPaterno()%>">
                    </div>
                    </div>
                    
                    <div class="row">
                    <div class="input-field col l6">
                    <label for="materno">Apellido Materno:</label>
                    <input type="text" id="materno" name="materno" value="<%=a.getMaterno()%>">
                    </div>
                    <div class="input-field col l6">
                    <label for="escuela">Escuela:</label>
                    <input type="text" id="escuela" name="escuela" value="<%=a.getEscuela()%>">
                    </div>     
                    </div>
                    
                    <div class="row">
                    <div class="input-field col l6">
                    <label for="domicilio">Domicilio:</label>
                    <input type="text" id="domicilio" name="domicilio" value="<%=a.getDomicilio()%>">
                    </div>
                    
                    <div class="input-field col l6">
                    <label for="promedio">Promedio:</label>
                    <input type="text" step="0.01" id="promedio" name="promedio" value="<%=a.getPromedio()%>">
                    </div>
                    </div>  
                    
                    <div class="row">    
                    
                    <div class="input-field col l6">
                    <label for="usuario">Usuario:</label>
                    <input type="text" id="usuario" name="usuario" value="<%=a.getUsr()%>">
                    </div>
                    </div>
                    
                    <div class="row">    
                    <div class="input-field col l6">
                    <label for="contra">Contraseña:</label>
                    <input type="text" id="contra" name="contra" value="<%=a.getContra()%>">
                    </div>
                    </div>
                    
                    <div class="row">
                        <button class="btn waves-effect waves-light  red darken-4 col l3 offset-l6 input-field" type="submit" name="bot" value="actualizar">
                        Actualizar<i class="material-icons right">send</i>
                        </button>
                    </div>
                    <div class="row"></div>
                </form>
            </div>
            
            <span id="error" style="font-family: Verdana, Arial, Helvetica, sans-serif;
                font-size: 12pt;color: #CC3300; position:relative;visibility:hidden;">
                usuario Ocupado ¡¡¡
            </span>
             </main>
                    
                    
           <script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>  
        <script type="text/javascript" src="../../js/materialize.min.js"></script> 
           <script src="../../js/validaciones.js"></script>
    </body>
</html>
