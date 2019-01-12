<%@page import="com.ixtapoli.impDao.administradorImpDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><%
    administradorImpDao admin = new administradorImpDao();
    String usuario = request.getParameter("username");
    if (admin.validarUsuario(usuario)) {
        out.print("Usuario disponible");
    } else {
        out.print("Usuario no disponible");
    }
%>