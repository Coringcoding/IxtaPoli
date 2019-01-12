/* Clase general para los tipos de usuario */

package com.ixtapoli.modelo;

public class Usuario {
	
	private Long id;
	private String nombre;
	private String materno;
	private String paterno;
	private String usr;
	private String contra;
	
	public Usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMaterno() {
		return materno;
	}
	
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
	public String getPaterno() {
		return paterno;
	}
	
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
		
	public String getUsr() {
		return usr;
	}
	
	public void setUsr(String usr) {
		this.usr = usr;
	}
	
	public String getContra() {
		return contra;
	}
	
	public void setContra(String contra) {
		this.contra = contra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
			
}
