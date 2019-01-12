package com.ixtapoli.impDao;

import java.util.List;
import com.ixtapoli.sql.Conexion;
import com.ixtapoli.dao.iCoordinadorDao;
import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Coordinador;
import com.ixtapoli.modelo.Equipo;
import com.ixtapoli.modelo.Faena;
import com.ixtapoli.modelo.Mensaje;
import com.ixtapoli.modelo.Reporte;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
        
public class coordinadorImpDao implements iCoordinadorDao{
    private Conexion cnx;
	final String REGISTRARFAENA = "{CALL Faena(1,0,?,?,?,?,?,?,?)}";
        final String GENERARREPORTE = "{CALL Reporte(1,?,?)}";
        final String CONSULTARREPORTES="{CALL Reporte(3,0,0)}";
        final String CONSULTAREPORTE="{CALL Reporte(3,?,0)}";
        final String ELIMINARREPORTE="{CALL Reporte(2,?,?)}";
    
    public coordinadorImpDao(){
        cnx = new Conexion();
    }

    @Override
    public boolean actualizarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarFaena(Faena s) {
        CallableStatement st;
        boolean bandera = false;
        try{
            st = cnx.getConexion().prepareCall(REGISTRARFAENA);
            st.setString(1, s.getNombre());
            st.setString(2, s.getFecha());
            st.setString(3, s.getHoraInicio());
            st.setString(4, s.getDescripcion());
            st.setString(5, s.getUbicacion());
            st.setString(6, s.getMateriales());
            st.setInt(7, s.getCupo());
            
            st.executeQuery();
            bandera = true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return bandera;
    }

    @Override
    public boolean eliminarFaena(Faena s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarFaena(Faena s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipo> consultarAsistencias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> consultarAsistenciasRecorrido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enviarMensaje(Mensaje s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarse(Coordinador usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean iniciarSesion(Coordinador usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarse(Coordinador usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mensaje> verMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUsuario(String ad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean generarReporte(Reporte r) {
        CallableStatement st;
        boolean bandera = false;
        try {
            st = cnx.getConexion().prepareCall(GENERARREPORTE);
            st.setInt(1, r.getIdAlumno().intValue());
            st.setInt(2, r.getIdReporte().intValue());
            st.executeQuery();
            bandera = true;
        } catch (Exception e) {
               System.out.println("Error generar reporte");
        }
        return bandera;
    }

    @Override
    public List<Reporte> consultarReportes() {
        CallableStatement st;
        ResultSet res;
        List<Reporte> rep = new ArrayList();
        try {
            st = cnx.getConexion().prepareCall(CONSULTARREPORTES);
            res = st.executeQuery();
            while(res.next()){
                Reporte r = new Reporte();
                r.setIdAlumno(res.getLong("idAlumno"));
                r.setNombre(res.getString("nombre"));
                r.setPaterno(res.getString("paterno"));
                r.setMaterno(res.getString("materno"));
                r.setIdReporte(res.getLong("idReporte"));
                r.setDescripcion(res.getString("descripcion"));
                rep.add(r);
            }
            
        } catch (Exception e) {
            System.out.println("Error consultar Reportes");
            e.printStackTrace();
        }
        return rep;
    }

    @Override
    public Reporte consultaReporte(Reporte r) {
        CallableStatement st;
        ResultSet res;
        Reporte re = new Reporte();
        try {
            st = cnx.getConexion().prepareCall(CONSULTAREPORTE);
            st.setInt(1, r.getIdAlumno().intValue());
            res = st.executeQuery();
            res.next();
            re.setIdAlumno(res.getLong("idAlumno"));
            re.setNombre(res.getString("nombre"));
            re.setPaterno(res.getString("paterno"));
            re.setMaterno(res.getString("materno"));
            re.setIdReporte(res.getLong("idReporte"));
            re.setDescripcion(res.getString("descripcion"));
        } catch (Exception e) {
            System.out.println("Error consulta Reporte");
            e.printStackTrace();
        }
        return re;
    }

    @Override
    public boolean eliminarReporte(Reporte r) {
        CallableStatement st;
        boolean bandera = false;
        try {
            st = cnx.getConexion().prepareCall(ELIMINARREPORTE);
            st.setInt(1, r.getIdAlumno().intValue());
            st.setInt(2, r.getIdReporte().intValue());
            st.executeQuery();
            bandera = true;
        } catch (Exception e) {
            System.out.println("Error eliminar Reporte");
            e.printStackTrace();
        }
       return bandera;
    }
    
}
