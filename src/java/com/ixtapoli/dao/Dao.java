package com.ixtapoli.dao;

import java.util.List;
import com.ixtapoli.modelo.Mensaje;

public interface Dao<O> {
	
	/* M�todos gen�ricos */
	
	public boolean registrarse(O usr);
        
        public boolean validarUsuario(String ad);
	
	public boolean iniciarSesion(O usr);
	
	public boolean eliminarse(O usr);
		
	public List<Mensaje> verMensajes();

}
