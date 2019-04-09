package com.ixtapoli.modelo;

public class Alumno extends Usuario {
	
	private boolean status;
	private float promedio;
	private String escuela;
	private String domicilio;
        private int ruta;
        private String rutaS;
        private int tipous;
		
	public Alumno() {
		super();
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
			
	public float getPromedio() {
		return promedio;
	}
	
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	public String getEscuela() {
		return escuela;
	}
	
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

        public int getRuta() {
            return ruta;
        }

        public void setRuta(int ruta) {
            this.ruta = ruta;
        }

        public String getRutaS() {
            return rutaS;
        }

        public void setRutaS(String rutaS) {
            this.rutaS = rutaS;
        }

        public int getTipous() {
            return tipous;
        }

        public void setTipous(int tipous) {
            this.tipous = tipous;
        }
        
        
        
        
	        
}
