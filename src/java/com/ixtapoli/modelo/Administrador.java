package com.ixtapoli.modelo;

public class Administrador extends Usuario {
		
	private int edad;
	private String telefono;
	
	public Administrador() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
		
}
