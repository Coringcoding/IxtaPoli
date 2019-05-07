/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ixtapoli.ws;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ixtapoli.impDao.alumnoImpDao;
import com.ixtapoli.modelo.Alumno;
import com.ixtapoli.modelo.Faena;
import com.ixtapoli.sql.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ixtaws")
public class ixtaws {

    
    final String INICIARSESION = "{CALL IniciarSesionAlumno(?,?)}";
     
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "usuario") String usr, @WebParam(name = "contra") String psw) {
        
        CallableStatement st = null;
        ResultSet rs = null;
        boolean bandera = false;
        alumnoImpDao n = new alumnoImpDao();
        String respuesta = null;
        
        try {
            Conexion cnx = new Conexion();
            st = cnx.getConexion().prepareCall(INICIARSESION);
            st.setString(1, usr);
            st.setString(2, psw);
            rs = st.executeQuery();

            while (rs.next()) {
                int num = rs.getInt(1);
                if (num == 1) {
                    bandera = true;
                }
            }
            String estatus = n.obtenerEstado(usr);
            
            if(bandera){
                respuesta = estatus;
            }else{
                respuesta = "NoRegistrado";
            }

        } catch (Exception e) {
            System.out.println("ErrorLogin.WS");
            e.printStackTrace();
        }

        return respuesta;
    }
    
    @WebMethod(operationName = "calendar")
    public String calendar(){
        alumnoImpDao al = new alumnoImpDao();
        List<Faena> faena = new ArrayList();
        faena = al.consultarFaenas();
        
            JsonArray jarr = new JsonArray();
            for (int i = 0; i < faena.size(); i++) {
                JsonObject json = new JsonObject();
                    json.addProperty("title", faena.get(i).getNombre());
                    //json.addProperty("start", faena.get(i).getFecha());
                    json.addProperty("fecha", faena.get(i).getFecha());
                    String[] fechas = faena.get(i).getFecha().split("-");
                    json.addProperty("anio", fechas[0]);
                    json.addProperty("mes", fechas[1]);
                    json.addProperty("dia", fechas[2]);
                    json.addProperty("hora", faena.get(i).getHoraInicio());
                    json.addProperty("horaE", faena.get(i).getHoraInicio().substring(0,2));
                    json.addProperty("minutoE", faena.get(i).getHoraInicio().substring(3,5));
                    if(faena.get(i).getHoraInicio().substring(6).equalsIgnoreCase("AM")){
                    json.addProperty("tiempoE","0");
                    }else{
                    json.addProperty("tiempoE","1");
                    }
                    json.addProperty("descripcion", faena.get(i).getDescripcion());
                    json.addProperty("ubicacion", faena.get(i).getUbicacion());
                    json.addProperty("materiales",faena.get(i).getMateriales());
                    json.addProperty("cupo", faena.get(i).getCupo());
                    //json.addProperty("color", "#880000");
                    
                    jarr.add(json);
                }
            System.out.println(jarr.toString());
        
        return jarr.toString();
    }
    
    
    @WebMethod(operationName = "registro")
    public boolean registro(@WebParam(name = "nombre") String nombre, @WebParam(name = "paterno") String paterno, 
            @WebParam(name = "materno") String materno, @WebParam(name = "escuela") String escuela, 
            @WebParam(name = "domicilio") String domicilio, @WebParam(name = "promedio") String promedio, 
            @WebParam(name = "usuario") String usr, @WebParam(name = "contra") String contra,
            @WebParam(name = "ruta") int ruta){
        alumnoImpDao al = new alumnoImpDao();
        Alumno a = new Alumno();
        a.setNombre(nombre);
        a.setPaterno(paterno);
        a.setMaterno(materno);
        a.setEscuela(escuela);
        a.setDomicilio(domicilio);
        a.setPromedio(Float.parseFloat(promedio));
        a.setUsr(usr);
        a.setContra(contra);
        a.setRuta(ruta);
        boolean res = al.registrarse(a);
        return res;
    }
}
