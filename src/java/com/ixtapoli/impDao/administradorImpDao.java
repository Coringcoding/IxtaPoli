
package com.ixtapoli.impDao;

import com.ixtapoli.dao.iAdministradorDao;
import com.ixtapoli.modelo.Administrador;
import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Coordinador;
import com.ixtapoli.modelo.Mensaje;
import com.ixtapoli.modelo.Solicitud;
import com.ixtapoli.sql.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
        
public class administradorImpDao implements iAdministradorDao{
    
    private Conexion cnx;
    private ResultSet res;
    final String REGISTRARADMINISTRADOR = "{CALL Administrador(1,0,?,?,?,?,?,?,?)}";
    final String INICIARSESION = "{CALL IniciarSesionAdmin(?,?)}";
    final String VALIDARADMINISTRADOR = "{CALL ValidarAdministrador(?)}";
    final String CONSULTARALUMNOS="{CALL Usuario(4,?,'','','','','',0,'','',0,0)}";
    final String ACTUALIZARDATOS="{CALL Usuario(3,?,?,?,?,?,?,?,?,?,0,?)}";
    final String CONSULTARSOLICITUDES = "{CALL Solicitudes(0,3)}";
    final String CAMBIARSOLICITUD = "{CALL Solicitudes(?,?)}";

    public administradorImpDao(){
        cnx = new Conexion();
    }

    @Override
    public boolean CambiarSolicitud(int idS, int Es){
        boolean bandera = false;
        CallableStatement st;
        try{
            st = cnx.getConexion().prepareCall(CAMBIARSOLICITUD);
            st.setInt(1, idS);
            st.setInt(2, Es);
            st.executeQuery();
            bandera = true;
        }catch(Exception e){
            System.out.println("Error al cambiar solicitud Alumno");
            e.printStackTrace();
        }
        return bandera;
    }

    @Override
    public List<Solicitud> consultarSolicitudes() {
        ResultSet res;
        CallableStatement st;
        List<Solicitud> solicitudes = new ArrayList();
        
        try{
            st = cnx.getConexion().prepareCall(CONSULTARSOLICITUDES);
            res = st.executeQuery();
            while(res.next()){
                String estado = res.getString("estatus");
                if(estado.equalsIgnoreCase("Espera")){
                Solicitud s = new Solicitud();
                s.setIdSolicitud(res.getLong("idRelEstadoAlumno"));
                s.setNombre(res.getString("nombre"));
                s.setPaterno(res.getString("paterno"));
                s.setMaterno(res.getString("materno"));
                s.setEscuela(res.getString("escuela"));
                s.setPromedio(res.getFloat("promedio"));
                s.setDomicilio(res.getString("domicilio"));
                s.setUsr(res.getString("usuario"));
                s.setRuta(0);res.getString("ruta");
                solicitudes.add(s);
                }
            }
        }catch(Exception e){
            System.out.println("Error al consultar solicitudes");
            e.printStackTrace();
        }
        return solicitudes;
    }

    @Override
    public List<Alumno> consultarAlumnos(int idA) {
        List<Alumno> al = new ArrayList();
        ResultSet res;
        CallableStatement st;
        try{
            st = cnx.getConexion().prepareCall(CONSULTARALUMNOS);
            st.setInt(1, idA);
            res = st.executeQuery();
            String estatus = "";
            while(res.next()){
                estatus = res.getString("estatus");
                if(estatus.equalsIgnoreCase("Aceptado")){
                Alumno a = new Alumno();
                a.setId(res.getLong("idAlumno"));
                a.setNombre(res.getString("nombre"));
                a.setPaterno(res.getString("paterno"));
                a.setMaterno(res.getString("materno"));
                a.setEscuela(res.getString("escuela"));
                a.setDomicilio(res.getString("domicilio"));
                a.setPromedio(res.getFloat("promedio"));
                a.setUsr(res.getString("usuario"));
                a.setContra(res.getString("contrasenia"));
                a.setRutaS(res.getString("ruta"));
                a.setRuta(res.getInt("idRuta"));
                a.setTipous(res.getInt("idTipoUsuario"));
                al.add(a);
                }
            }
            
        }catch(Exception e){
            System.out.println("Error consultarAlumnos");
            e.printStackTrace();
        }
        return al;
    }

    @Override
    public boolean promoverUsuario(Alumno s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean degradarUsuario(Coordinador s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarse(Administrador usr) {
        CallableStatement st = null;
        boolean bandera = false;
        try{
        st = cnx.getConexion().prepareCall(REGISTRARADMINISTRADOR);
        st.setString(1, usr.getNombre());
        st.setString(2, usr.getPaterno());
        st.setString(3, usr.getMaterno());
        st.setInt(4, usr.getEdad());
        st.setString(5, usr.getUsr());
        st.setString(6, usr.getTelefono());
        st.setString(7, usr.getContra());
        
        res  = st.executeQuery();
        res.next();
        bandera = Boolean.parseBoolean(res.getString("msj"));
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return bandera;
    }

   @Override
    public boolean iniciarSesion(Administrador usr) {
        CallableStatement st = null;
        ResultSet rs= null;
        boolean bandera = false;
        
        try{
            st= cnx.getConexion().prepareCall(INICIARSESION);
            st.setString(1, usr.getUsr());
            st.setString(2, usr.getContra());
            
            rs = st.executeQuery();
            
            
            while (rs.next()) {
                int num = rs.getInt(1);
                if (num == 1) {
                    bandera = true;
                }
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("No se toma");
        
        }
        
        return bandera;
        
    }

    @Override
    public boolean eliminarse(Administrador usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mensaje> verMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUsuario(String ad) {
        boolean bandera = false;
        try{
            CallableStatement st = cnx.getConexion().prepareCall(VALIDARADMINISTRADOR);
            st.setString(1, ad);
            res = st.executeQuery();
            res.next();
            if(res.getInt("cuantos") == 0){
                bandera = true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en validacion");
        }
        return bandera;
    }

    @Override
    public boolean actualizarDatos(Alumno s) {
        CallableStatement st;
        boolean bandera = false;
        try {
            st = cnx.getConexion().prepareCall(ACTUALIZARDATOS);
            st.setInt(1, s.getId().intValue());
            st.setString(2, s.getNombre());
            st.setString(3, s.getPaterno());
            st.setString(4, s.getMaterno());
            st.setString(5, s.getEscuela());
            st.setString(6, s.getDomicilio());
            st.setFloat(7, s.getPromedio());
            st.setString(8, s.getUsr());
            st.setString(9, s.getContra());
            st.setInt(10, s.getTipous());
            st.executeQuery();
            bandera = true;
        } catch (Exception e) {
            System.out.println("Error actualizar datos");
            e.printStackTrace();
        }
        return bandera;
    }
    
}
