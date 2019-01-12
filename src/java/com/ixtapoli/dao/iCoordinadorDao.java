package com.ixtapoli.dao;

import java.util.List;

import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Coordinador;
import com.ixtapoli.modelo.Equipo;
import com.ixtapoli.modelo.Faena;
import com.ixtapoli.modelo.Mensaje;
import com.ixtapoli.modelo.Reporte;

public interface iCoordinadorDao extends Dao<Coordinador> {

	public boolean actualizarInformacion();
	
	public boolean registrarFaena(Faena s);
	
	public boolean eliminarFaena(Faena s);
	
	public boolean actualizarFaena(Faena s);
	
	public List<Equipo> consultarAsistencias();
	
	public List<Alumno> consultarAsistenciasRecorrido();
			
	public boolean enviarMensaje(Mensaje s);
        
        public boolean generarReporte(Reporte r);
        
        public List <Reporte> consultarReportes();
        
        public Reporte consultaReporte(Reporte r);
        
        public boolean eliminarReporte(Reporte r);
	
}
