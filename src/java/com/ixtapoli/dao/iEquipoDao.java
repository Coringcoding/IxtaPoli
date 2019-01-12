package com.ixtapoli.dao;

import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Faena;

public interface iEquipoDao {

	public boolean agregarIntegrante(Alumno s);
	
	public boolean eliminarIntegrante(Alumno s);
	
	public boolean inscribirFaena(Faena s);
	
	public boolean pasarAsistencia();
	
	//Dudas sobre el método pasarAsistencia()
	
}
