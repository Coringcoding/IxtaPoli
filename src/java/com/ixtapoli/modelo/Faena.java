package com.ixtapoli.modelo;

public class Faena {

	private Long idFaena;
	private String nombre;
	private String fecha;
	private String horaInicio;
	private String descripcion;
	private String ubicacion;
	private String materiales;
	private String video;
	private int cupo;

	public Long getIdFaena() {
		return idFaena;
	}

	public void setIdFaena(Long idFaena) {
		this.idFaena = idFaena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
			
}
