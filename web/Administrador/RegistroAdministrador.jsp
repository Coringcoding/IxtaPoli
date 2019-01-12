<%@page import="com.ixtapoli.modelo.Administrador"%>
<%@page import="com.ixtapoli.impDao.administradorImpDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="../css/materialize.min.css">
        <link rel="stylesheet" href="../css/administrador.css">
        <title>Registro Administrador</title>
    </head>
    <body>
        <%
            boolean btn;
            btn = (request.getParameter("registrarse") != null)?true:false;
            if(btn){
                administradorImpDao administrador = new administradorImpDao();
                Administrador admin = new Administrador();
                admin.setNombre(request.getParameter("nombre"));
                admin.setPaterno(request.getParameter("paterno"));
                admin.setMaterno(request.getParameter("materno"));
                admin.setEdad(Integer.parseInt(request.getParameter("edad")));
                admin.setTelefono(request.getParameter("telefono"));
                admin.setUsr(request.getParameter("usuario"));
                admin.setContra(request.getParameter("contra"));
                if(administrador.registrarse(admin)){
                    out.print("<script>alert('Administrador registrado');"
                            + "window.location.replace('LoginAdministrador.jsp');</script>");
                }
                else{
                    out.print("<script>alert('Error en el registro');"
                            + "window.location.replace('LoginAdministrador.jsp');</script>");
                }
            }
        %>
        
        <nav>Todo el nav</nav>
        
        <form method="get" id="formregistro" action="RegistroAdministrador.jsp" onsubmit="return valReg('formregistro');">
            <div id="nam">Administrador</div>
            <div class="input-field">
                <input id="nombre" name="nombre" type="text" class="validate">
                <label for="nombre">Nombre</label>
            </div>
            <div class="input-field">
                <input id="paterno" name="paterno" type="text" class="validate">
                <label for="paterno">Paterno</label>
            </div>
            <div class="input-field">
                <input id="materno" name="materno" type="text" class="validate">
                <label for="materno">Materno</label>
            </div>
            <div class="input-field">
                <input id="edad" name="edad" type="number" class="validate">
                <label for="edad">Edad</label>
            </div>
            <div class="input-field">
                <input id="telefono" name="telefono"  type="text" class="validate">
                <label for="telefono">Telefono</label>
            </div>
            <div class="input-field">
                <div id="validacion"></div>
                <input id="usuario" name="usuario" type="text" class="validate" onblur="existencia()">
                <label for="usuario">Usuario</label>
            </div>
            <div class="input-field">
                <input id="contra" name="contra" type="password" class="validate">
                <label for="contra">Contraseña</label>
            </div>
            <div class="input-field">
                <input id="confcontra" name="confcontra" type="password" class="validate">
                <label for="confcontra">Confirmar Contraseña</label>
            </div>
            <button class="btn waves-effect waves-light  red darken-4" type="submit" name="registrarse" value="registarse">
                Registrase<i class="material-icons right">send</i>
            </button>
            <a href="LoginAdministrador.jsp">Login</a>
            
        </form>
        
        
        
        <script src="../js/jquery-3.3.1.min.js"></script> 
        <script src="../js/materialize.min.js"></script>
        <script src="../js/validaciones.js"></script>
        <script>
            function existencia(){
                $.ajax({
                        type: "POST",
                        url: "validaUsuario.jsp",
                        data: {username: $("#usuario").val()}
                    })
                            .done(function(msg) {
                            $("#validacion").text(msg);
                            });
            }
        </script>
        
    </body>
</html>
