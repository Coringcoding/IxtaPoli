package com.ixtapoli.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private Connection conexion = null;
	final String MOTOR = "mysql";
	final String SERVIDOR = "localhost";
	final String PUERTO = "8080";
	final String BASE = "Ixtapoli";
	final String USUARIO = "root";
	final String CONTRA = "n0m3l0";
	
	public Conexion() {
				
		final String URL = "jdbc:" + MOTOR + "://" + SERVIDOR + "/" + BASE;	
		final String USERNAME = USUARIO;
		final String PASSWORD = CONTRA;
		
		try {
			
			Class.forName("com." + MOTOR + ".jdbc.Driver");
			conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Conexion exitosa");
			
		} catch (Exception e) {
			
			e.printStackTrace();
                        System.out.println("Conexion fallida");
			
		}
				
	}
	
	public Connection getConexion() {
		
		return conexion;
		
	}
	
}
