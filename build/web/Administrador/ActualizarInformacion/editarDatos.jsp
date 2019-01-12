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
        <title>JSP Page</title>
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
        
        <form method="post" name="editar" action="">
           <input  type="hidden" id="idAlumno" name="idAlumno" value="<%=a.getId()%>">
           <input type="text" id="nombre" name="nombre" value="<%=a.getNombre()%>">
           <input type="text" id="paterno" name="paterno" value="<%=a.getPaterno()%>">
           <input type="text" id="materno" name="materno" value="<%=a.getMaterno()%>">
           <input type="text" id="escuela" name="escuela" value="<%=a.getEscuela()%>">
           <input type="text" id="domicilio" name="domicilio" value="<%=a.getDomicilio()%>">
           <input type="numbre" step="0.01" id="promedio" name="promedio" value="<%=a.getPromedio()%>">
           <input type="text" id="usuario" name="usuario" value="<%=a.getUsr()%>">
           <input type="text" id="contra" name="contra" value="<%=a.getContra()%>">
           <button type="submit" value="actualizar" name="bot">Actualizar</button>
        </form>
    </body>
</html>
