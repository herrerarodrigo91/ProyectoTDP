/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Collection;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Rodrigo
 */
public class Controlador {
    private BancoEntidades bancoEnt;
    private String direccion=ServletActionContext.getServletContext().getRealPath("/datosProyectoTDP.txt");
    
    public Controlador(){
        bancoEnt=Serializer.read(direccion);
        if(bancoEnt==null){
            bancoEnt=BancoEntidades.getInstance();
        }
        Serializer.write(bancoEnt, direccion);
    }
    
    public void agregarEntidad(Entidad e){
        bancoEnt=Serializer.read(direccion);
        e.setId(bancoEnt.getControlId());
        int sigId=(bancoEnt.getControlId())+1;
        bancoEnt.setControlId(sigId);
        bancoEnt.guardar(e);
        Serializer.write(bancoEnt, direccion);
    }
    
    public void remove(int id){
        bancoEnt=Serializer.read(direccion);
        bancoEnt.borrarEntidad(id);
        Serializer.write(bancoEnt, direccion);
    }
    
    public Collection<Entidad> entidades(){
        return bancoEnt.getEntidadesMap().values();
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public Entidad getEntidad(int id){
        return bancoEnt.encontrarEntidad(id);
    }
}
