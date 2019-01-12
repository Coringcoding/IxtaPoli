package com.ixtapoli.modelo;

public class Recorrido {

	private Long idRecorrido;
	private String horaInicio;
	private String fecha;
		
	public Recorrido() {
		
	}

	public Long getIdRecorrido() {
		return idRecorrido;
	}

	public void setIdRecorrido(Long idRecorrido) {
		this.idRecorrido = idRecorrido;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
			
}
