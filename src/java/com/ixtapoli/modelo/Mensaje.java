package com.ixtapoli.modelo;

public class Mensaje {
	
	private Long idMensaje;
	private String contenido;
	private String acceso;
	
	public Mensaje() {
		
	}

	public Long getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Long idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}
			
}
