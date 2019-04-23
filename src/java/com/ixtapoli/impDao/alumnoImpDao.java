package com.ixtapoli.impDao;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

import com.ixtapoli.dao.iAlumnoDao;
import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Equipo;
import com.ixtapoli.modelo.Faena;
import com.ixtapoli.modelo.Mensaje;
import com.ixtapoli.modelo.Solicitud;
import com.ixtapoli.sql.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class alumnoImpDao implements iAlumnoDao {
	
	private Conexion cnx;
        private ResultSet rs;
	final String REGISTRARALUMNO = "{CALL Usuario(1,?,?,?,?,?,?,?,?,?,?,0)}";
	final String ELIMINARALUMNO = "{CALL Usuario(2,?,'','','','','',0,'','',0,0)}";
	final String EDITARALUMNO = "{CALL Usuario(3,,?,?,?,?,?,?,?,?,?,?)}";
        final String CONSULTARFAENAS = "{CALL faena(4,0,'','0000-00-00','','','','',0)}";
        final String INICIARSESION = "{CALL IniciarSesionAlumno(?,?)}";
        final String OBTENERESTADO = "{CALL ObtenerEstado(?)}";
        	
	public alumnoImpDao() {
		
		cnx = new Conexion();
		
	}

	@Override
	public boolean registrarse(Alumno usr) {
		CallableStatement st = null;
                boolean bandera = false; 
                
                try {
                    
                    st = cnx.getConexion().prepareCall(REGISTRARALUMNO);
                    st.setInt(1,0);
                    st.setString(2, usr.getNombre());
                    st.setString(3, usr.getPaterno());
                    st.setString(4, usr.getMaterno());
                    st.setString(5, usr.getEscuela());
                    st.setString(6, usr.getDomicilio());
                    st.setFloat(7, usr.getPromedio());
                    st.setString(8, usr.getUsr());
                    st.setString(9, usr.getContra());
                    st.setInt(10, usr.getRuta());
                    
                    st.executeQuery();
                    
                    bandera = true;
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
		return bandera;
	}

	@Override
	public boolean iniciarSesion(Alumno usr) {
        CallableStatement st = null;
        ResultSet rs = null;
        boolean bandera = false;

        try {

            st = cnx.getConexion().prepareCall(INICIARSESION);
            st.setString(1, usr.getUsr());
            st.setString(2, usr.getContra());
            rs = st.executeQuery();

            while (rs.next()) {
                int num = rs.getInt(1);
                if (num == 1) {
                    bandera = true;
                }
            }

        } catch (Exception e) {
        }

        return bandera;
	}

	@Override
	public boolean eliminarse(Alumno usr) {
        CallableStatement st = null;
        boolean bandera = false;
        try {
            st = cnx.getConexion().prepareCall(ELIMINARALUMNO);
            st.setLong(1, usr.getId());
            st.executeQuery();
            bandera = true;

        } catch (Exception e) {
        }
        return bandera;
    }

	@Override
	public List<Mensaje> verMensajes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizarInformacion(Alumno usr) {
		CallableStatement st = null;
                boolean bandera = false; 
                
                try {
                    
                    st = cnx.getConexion().prepareCall(REGISTRARALUMNO);
                    st.setLong(1,usr.getId());
                    st.setString(2, usr.getNombre());
                    st.setString(3, usr.getPaterno());
                    st.setString(4, usr.getMaterno());
                    st.setString(5, usr.getEscuela());
                    st.setString(6, usr.getDomicilio());
                    st.setFloat(7, usr.getPromedio());
                    st.setString(8, usr.getUsr());
                    st.setString(9, usr.getContra());
                    st.setInt(10, usr.getRuta());
                    
                    st.executeQuery();
                    
                    bandera = true;
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
		return bandera;		
	}

	@Override
	public boolean enviarSolicitud(Alumno s) {
        
        Solicitud x = new Solicitud();
        x.setNombre(s.getNombre());
        x.setPaterno(s.getPaterno());
        x.setMaterno(s.getMaterno());
        
        return false;
    }

	@Override
	public boolean formarEquipo(Equipo s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String verCalendario() {
	List<Faena> faena = new ArrayList();
        String calendar;
        faena = consultarFaenas();
        
            JsonArray jarr = new JsonArray();
            for (int i = 0; i < faena.size(); i++) {
                JsonObject json = new JsonObject();
                    json.addProperty("title", faena.get(i).getNombre());
                    json.addProperty("start", faena.get(i).getFecha());
                    json.addProperty("fecha", faena.get(i).getFecha());
                    json.addProperty("hora", faena.get(i).getHoraInicio());
                    json.addProperty("descripcion", faena.get(i).getDescripcion());
                    json.addProperty("ubicacion", faena.get(i).getUbicacion());
                    json.addProperty("materiales",faena.get(i).getMateriales());
                    json.addProperty("cupo", faena.get(i).getCupo());
                    json.addProperty("color", "#880000");
                    
                   jarr.add(json);
                }
            String event = jarr.toString().replaceAll("\"", "'");
            calendar = "<script>$(document).ready(function(){$('#calendar').fullCalendar({"
                    + "events:"+event+","
                    + "eventClick: function(calEvent, jsEvent, view){even(calEvent, jsEvent, view);},"
                    + "header: {left:'prev',center: 'title',right:'today,next'},"
                    + " fixedWeekCount: false,"
                            + "firstDay: 0"
                    + "});});</script>";
            
		return calendar;
	}

    @Override
    public List<Faena> consultarFaenas() {
        List<Faena> faena = new ArrayList<>();
        CallableStatement st = null;
        try {
            st = cnx.getConexion().prepareCall(CONSULTARFAENAS);
            rs = st.executeQuery();
            while(rs.next()){
             Faena f = new Faena();
             f.setIdFaena(rs.getLong("idFaena"));
             f.setNombre(rs.getString("nombre"));
             f.setFecha(rs.getString("fecha"));
             f.setHoraInicio(rs.getString("hora"));
             f.setDescripcion(rs.getString("descripcion"));
             f.setUbicacion(rs.getString("ubicacion"));
             f.setMateriales(rs.getString("materiales"));
             f.setCupo(rs.getInt("cupo"));
             faena.add(f);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return faena;
    }

    @Override
    public boolean validarUsuario(String ad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerEstado(String s) {
        CallableStatement st = null;
        ResultSet rs = null;
        String estado = "";
        
        try {
            st = cnx.getConexion().prepareCall(OBTENERESTADO);
            st.setString(1, s);
            
            rs = st.executeQuery();

            while (rs.next()) {
                estado = rs.getString(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return estado;
    }

}
