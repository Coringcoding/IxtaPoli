use ixtapoli;

delimiter **

/*ADMINISTRADOR*/
drop procedure if exists Administrador**
create procedure Administrador
(in accion int,
 in idAdmin int, /*primary key del Administrador*/
 in nom nvarchar(45),
 in pat NVARCHAR(45),
 in mat NVARCHAR(45),
 in ed INT,
 in us NVARCHAR(45),
 in tel NVARCHAR(45),
 in contra NVARCHAR(45))
BEGIN
 /*1 registrar; 2 borrar*/
 declare existe int;
	if accion = 1
		then
			set existe = (select count(*) from administrador where usuario = us);
            if existe = 0 then
				set idAdmin = (select ifnull(max(idAdministrador), 0) from administrador) + 1;
				insert into administrador values (idAdmin,nom,pat,mat,ed,us,tel,contra);
                select 'true' as msj;
            else
				select 'false' as msj;
            end if;
        else
			delete from administrador where idAdministrador = idAdmin;
        end if;
END**

/*Valida usuario del Administrador*/
drop procedure if exists ValidarAdministrador**
create procedure ValidarAdministrador(
in us nvarchar(45)
)
BEGIN
	select count(*) as cuantos from administrador where usuario = us;
END**

/*Valida usuario del alumno*/
drop procedure if exists ValidarAlumno**
create procedure ValidarAlumno(
in us nvarchar(45)
)
BEGIN
	select count(*) as cuantos from alumno where usuario = us;
END**


/*USUARIO*/
drop procedure if exists Usuario**
create procedure Usuario(
 in accion int,
 in idAl int, 
 in nom nvarchar(45),
 in	pat nvarchar(45),
 in mat nvarchar(45), 
 in esc nvarchar(45),
 in domi nvarchar(100),
 in	prom float,
 in us nvarchar(45),
 in contra nvarchar(45),
 in rut int,
 in estat boolean
)
BEGIN
/*1 registrar, 2 eliminar, 3 editar, 4 consultar*/
	declare idR int;
    declare idRelRut int;
    declare existe int;
    declare idS int;
	if accion = 1 then
		set existe = (select count(*) from alumno where usuario = us);
        if existe = 0 then
			set idAl = (select ifnull(max(idAlumno), 0) from alumno) + 1;
			insert into alumno values(idAl, nom, pat, mat, esc, domi, prom, us, md5(contra), rut, estat);
			/*Relacion alumno tipo usuario*/
			set idR = (select ifnull(max(idRelAlumnoTipoUs), 0) from relAlumnoTipoUs) + 1;
			insert into relAlumnoTipoUs values (idR, idAl, 0); /*0 es alumno normal, 1 es coordinador*/
			/*relacion alumno bus*/
			set idRelRut = (select ifnull(max(idRelAlumnoBus), 0) from relAlumnoBus) + 1;
            set idS = (select ifnull(max(idSolicitud), 0) from solicitud) + 1;
			insert into relAlumnoBus values(idRelRut, idAl, rut);
            -- Guarda la solicitud para que se muestre al administrador con estado 0
            insert into solicitud values(idS, nom, pat, mat, esc, domi, prom, us, md5(contra), rut, 0);
            select 'true' as msj;
        else
			select 'false' as msj;
        end if;
    elseif accion = 2 then
		delete from alumno where idAlumno = idAl;
    elseif accion = 3 then
		update alumno set nombre = nom, paterno = pat, materno = mat, escuela = esc, domicilio = domi, 
        promedio = prom, usuario = us, contrasenia = contra where idAlumno = idAl;
    else
		if idAl = 0 then
			select * from AlumnoConsulta;
        else
			select * from AlumnoConsulta where idAlumno = idAl;
        end if;
    end if;
END**



/* Iniciar sesion Alumno*/
drop procedure if exists IniciarSesionAlumno**
create procedure IniciarSesionAlumno(in usr nvarchar(20), in contra nvarchar(20))
BEGIN	
	select count(idAlumno) as existe from alumno where usuario = usr and contrasenia = md5(contra);
END**

-- Obtener estado del Alumno J --
drop procedure if exists ObtenerEstado**
create procedure ObtenerEstado(in usr nvarchar(20))
BEGIN	
	select estado from solicitud where usuario = usr;
END**

/* Iniciar sesion Administrador */
drop procedure if exists IniciarSesionAdmin**
create procedure IniciarSesionAdmin(in usr nvarchar(20), in contra nvarchar(20))
BEGIN	
	select count(idAdministrador) as existe from administrador where usuario = usr and contrasenia = contra;
END**

/* Iniciar sesion Coordinador */
drop procedure if exists IniciarSesionCoord**
create procedure IniciarSesionCoord(in usr nvarchar(20), in contra nvarchar(20))
BEGIN	
	select count(idCoordinador) as existe from coordinador where usuario = usr and contrasenia = contra;
END**

/*cambiar tipo de Usuario*/
drop procedure if exists RelacionAlumnoTipoUs**
create procedure RelacionAlumnoTipoUs (
 in idRATU int,
 in idAl int,
 in idU int
)
BEGIN
	update relAlumnoTipoUs set idTipoUsuario = idU where idRelAlumnoTipoUs = idRATU and idAlumno =idAl;

END**


/*Bus*/
drop procedure if exists Bus**
create procedure Bus
(
 in nomb nvarchar(45)
)
BEGIN
	declare idB int;
    set idB = (select ifnull(max(idBus), 0) from bus) + 1;
	insert into bus values (idB, nomb);
END**

/*Estacion*/
drop procedure if exists Estacion**
create procedure Estacion
(
 in nomb nvarchar(45), 
 in ubic nvarchar(100)
)
BEGIN
	declare idEst int;
    set idEst= (select ifnull(max(idEstacion), 0) from estacion) + 1;
	insert into estacion values (idEst, nomb, ubic);
END**

/*Recorrido*/
drop procedure if exists Recorrido**
create procedure Recorrido(
 in idRec int,
 in idAl int,
 in idEs int, 
 in hor time,
 in fec date
)
BEGIN
	set idRec = (select ifnull(max(idRecorrido), 0) from recorrido) + 1;
    insert into recorrido values (idRec, idAl, idEs, hora, fec);
    select count(*) from recorrido where fecha = fec;
END**


/*Equipo*/
drop procedure if exists Equipo**
create procedure Equipo
(
 in accion int,
 in idEq int,
 in nom nvarchar(45),
 in idAl int
)
BEGIN
	/*1 crear equipo, 2 eliminar equipo, 3 añadir integrante, 4 eliminar integrante, 5 consultar equipo*/
	if accion = 1 then
    set idEq = (select ifnull(max(idEquipo), 0) from equipo) + 1;
    insert into equipo values (idEq, nom, idAl);  /*IdAlumno del creador*/
    
    elseif accion = 2 then
		delete from equipo where idEquipo = idEq;
        
    elseif accion = 3 then
		insert into relEquipoUsuario values (idEq, idAl);
        
    elseif accion = 4 then
		delete from relEquipoUsuario where idEquipo = idEq and idAlumno = idAl;
    
    else
		select * from relEquipoUsuario;
    end if;

END**

/*Faena*/
drop procedure if exists Faena**
create procedure Faena (
 in accion int, 
 in idFa int,
 in nom nvarchar(45),
 in fec nvarchar(45),
 in hor nvarchar(45), 
 in des  nvarchar(1000),
 in ubi nvarchar(100),
 in mater nvarchar(100), 
 in cup int
)
BEGIN
	/*1 crear, 2 editar, 3 eliminar, 4 consultar*/
    if accion = 1 then
		set idFa = (select ifnull(max(idFaena), 0) from faena) + 1;
        insert into faena values (idFa,nom,fec,hor,des,ubi,mater,cup);
    elseif accion = 2 then
		update faena set idFaena=idFa, nombre=nom, fecha=fec, hora=hor, descripcion = des,
        ubicacion=ubi, materiales=mater,cupo=cup where idFaena = idFa;
    elseif accion = 3 then
		delete from faena where idFaena = idFa;
    else 
		select * from faena;
    end if;
END**

/*registrar equipos a faena*/
drop procedure if exists relacionFaenaEquipo**
create procedure relacionFaenaEquipo(
 in accion int,
 in idFa int,
 in idEq int,
 in asis boolean
)
BEGIN
	/*1 agregar equipo, 2 registrar asistencia*/
    if accion = 1 then
		set idFa = (select ifnull(max(idRelFaenaEquipo), 0) from relFaenaEquipo) + 1;
        insert into relFaenaEquipo values(idFa, idEq, false);
    else
		update relFaenaEquipo set asistencia = asis where idFaena = idFa and idEquipo = idEq;
    end if;
END**

/*Mensajes*/
drop procedure if exists Mensaje**
create procedure Mensaje (
in cont nvarchar(100),
in dest int,
 acce nvarchar(100)
)
BEGIN
declare idM int;
set idM = (select ifnull(max(idMensaje), 0) from mensaje) + 1;
 insert into mensaje values(idM, cont, dest, acce);
END**

drop procedure if exists Reporte**
create procedure Reporte(
in accion int,
in idA int,
in idR int
)
BEGIN
/*1 registrar, 2 eliminar, 3 consultar*/
	declare idRA int;
    if accion = 1 then
		set idRA = (select ifnull(max(idRelAlumnoReporte), 0) from relAlumnoReporte) + 1;
        insert into relAlumnoReporte values(idRA, idA, idR);
    elseif accion = 2 then
		delete from relAlumnoReporte where idAlumno = idA and idReporte = idR;
    else
		if idA = 0 then
		select * from ReporteConsulta;
        else
			select * from ReporteConsulta where idAlumno = idA;
		end if;
    end if;
	
END**
delimiter ;