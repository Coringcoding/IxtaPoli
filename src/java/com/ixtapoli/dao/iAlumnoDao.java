package com.ixtapoli.dao;

import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Equipo;
import com.ixtapoli.modelo.Faena;
import com.ixtapoli.modelo.Solicitud;
import java.util.List;

public interface iAlumnoDao extends Dao<Alumno> {

	public boolean actualizarInformacion(Alumno s);
	
	public boolean enviarSolicitud(Alumno s);
	
	public boolean formarEquipo(Equipo s);
        
        public List<Faena> consultarFaenas();
	
	public String verCalendario();
        
        public String obtenerEstado(String s);
        
        public String ObtenerTipo(String s);
	
	//Faltan acciones para las cosas del recorrido

}
