package com.ixtapoli.dao;

import java.util.List;
import com.ixtapoli.modelo.Administrador;
import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Coordinador;
import com.ixtapoli.modelo.Solicitud;

public interface iAdministradorDao extends Dao<Administrador>{

	public boolean aceptarSolicitud(Solicitud s);
	
	public boolean rechazarSolicitud(Solicitud s);
	
	public List<Solicitud> consultarSolicitudes();
        
        public List<Alumno> consultarAlumnos(int idA);
	
	public boolean promoverUsuario(Alumno s);
	
	public boolean degradarUsuario(Coordinador s);
        
        public boolean actualizarDatos(Alumno s);
	
}
