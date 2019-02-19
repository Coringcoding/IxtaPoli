drop database if exists ixtapoli;
create database ixtapoli;
use ixtapoli;

CREATE TABLE administrador (
    idAdministrador INT PRIMARY KEY,
    nombre NVARCHAR(45) NOT NULL,
    paterno NVARCHAR(45) NOT NULL,
    materno NVARCHAR(45) NOT NULL,
    edad INT NOT NULL,
    usuario NVARCHAR(45) NOT NULL,
    telefono NVARCHAR(45) NOT NULL,
    contrasenia NVARCHAR(45) NOT NULL
);

CREATE table alumno (
	idAlumno int primary key, 
    nombre nvarchar(45) not null,
	paterno nvarchar(45) not null,
    materno nvarchar(45) not null, 
    escuela nvarchar(45) not null,
    domicilio nvarchar(100) not null,
	promedio float not null,
    usuario nvarchar(45) not null,
    contrasenia nvarchar(45) not null,
    ruta int not null, /*Estaria escogiendo el bus*/
    estatus boolean not null
);

-- Sirve para el registro de alumno nuevo J --
-- Estado: 0 En espera 1 Aceptado 2 Rechazado J --
create table solicitud (
	idSolicitud int primary key,
	nombre nvarchar(45) not null,
    paterno nvarchar(45) not null,
    materno nvarchar(45) not null, 
    escuela nvarchar(45) not null,
    domicilio nvarchar(100) not null,
	promedio float not null,
    usuario nvarchar(45) not null,
    contrasenia nvarchar(45) not null,
    ruta int not null, /*Estaria escogiendo el bus*/
    estado int not null
);

create table faena (
	idFaena int primary key,
    nombre nvarchar(45) not null,
    fecha nvarchar(45),
    hora nvarchar(45), 
    descripcion nvarchar(1000) not null,
    ubicacion nvarchar(100) not null,
    materiales nvarchar(100) not null, 
    cupo int not null
);

CREATE TABLE equipo (
	idEquipo int primary key,
    nombre nvarchar(45) not null,
    idAlumno int not null references alumno (idAlumno)
);

CREATE TABLE estacion (
	idEstacion int primary key, 
    nombre nvarchar(45) not null,
    ubicacion nvarchar(100) not null
);

CREATE TABLE recorrido(
	idRecorrido int primary key,
    idAlumno int references alumno (idAlumno),
    idEstacion int references estacion (idEstacion), 
    hora time not null,
    fecha date
);

CREATE TABLE reporte(
	idReporte int primary key,
    descripcion nvarchar(60)
);


insert into reporte values(1,'No acudir o dar caso omiso');
insert into reporte values(2,'Duplicidad de registro');

    
CREATE TABLE bus(
	idBus int primary key,
    nombre nvarchar(45) not null
);
insert into bus values(1,'zacatenco');
insert into bus values(2,'santo tomas');

CREATE TABLE tipoUsuario (
	idTipoUsuario int primary key,
    tipo nvarchar(45) not null
);

CREATE table relAlumnoTipoUs (
	idRelAlumnoTipoUs int primary key,
    idAlumno int references alumno (idAlumno),
    idTipoUsuario int references tipoUsuario (idTipoUsuario)
);

CREATE TABLE relFaenaEquipo (
	idRelFaenaEquipo int primary key,
    idFaena int references faena (idFaena),
    idEquipo int references equipo (idEquipo),
    asistencia boolean
);

CREATE TABLE relAlumnoBus( 
	idRelAlumnoBus int primary key,
    idAlumno int references alumno (idAlumno),
    idBus int references bus (idBus)
);

CREATE TABLE relEstacionBus ( /*Ya está precargada en el sistema*/
	idRelEstacionBus int primary key,
    idEstacion int references estacion (idEstacion),
    idBus int references bus (idBus)
);

CREATE TABLE relEquipoUsuario ( 
	idEquipo int references equipo (idEquipo),
    idAlumno int references alumno (idAlumno)
);

CREATE TABLE mensaje (
 idMensaje int primary key,
 contenido nvarchar(100),
 destinatario int references alumno (idAlumno),
 acceso nvarchar(100)
);

CREATE TABLE relAlumnoReporte(
	idRelAlumnoReporte int primary key,
    idAlumno int,
    idReporte int
);

/*vistas*/
create view AlumnoConsulta as
select a.idAlumno,a.nombre, a.paterno,a.materno, a.escuela, a.domicilio, a.promedio, a.usuario, a.contrasenia,a.ruta as idRuta, b.nombre as ruta
from alumno as a  
inner join bus as b on a.ruta = b.idBUs;

create view ReporteConsulta as
select r.idRelAlumnoReporte, r.idAlumno, a.nombre, a.paterno, a.materno, r.idReporte, e.descripcion
from relAlumnoReporte as r
inner join alumno as a on r.idAlumno = a.idAlumno
inner join reporte as e on r.idReporte = e.idReporte; 