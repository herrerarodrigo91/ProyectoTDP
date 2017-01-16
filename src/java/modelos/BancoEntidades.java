/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.io.Serializable;
import org.apache.struts2.ServletActionContext;




public class BancoEntidades implements Serializable{
    
    private Map<Integer,Entidad> entidadesMap;
    private static BancoEntidades bEntidades;
    //private String direccion;
    private int controlId;

    private BancoEntidades() { //aca se uso el patron de diseño singleton!!!!
        
        System.out.println("se ejecuto BancoEntidades");
        //direccion= ServletActionContext.getServletContext().getRealPath("/Datos/ubicame.txt");
        controlId=0;
        //System.out.println("direccion desde BancosPartidos= "+direccion);
        entidadesMap=new LinkedHashMap<Integer,Entidad>();
        
    }
    //////////////////////////////////CONSTRUCTOR/////////////////////////////////////////////////////////////                                                                           
    public static BancoEntidades getInstance(){
        System.out.println("se ejecuto getInstance de Banco Entidades");
        if(bEntidades==null){
           bEntidades=new BancoEntidades();
        }
        return bEntidades;
    }
    
    
    ///////////////////////////////METODOS////////////////////////////////////////////////////////////

//    public String getDireccion() {
//        System.out.println("se ejecuto getDireccion de BancoEntidades");
//        return direccion;
//    }

    public Entidad encontrarEntidad(int id){
        System.out.println("se ejecuto encontrarEntidad de BancoEntidad ");
        return (entidadesMap.get(id));
    }
    
    
    public void borrarEntidad(int id){
        System.out.println("se ejecuto borrarEntidad de BancoEntidad ");
        
        Entidad entidadBorrar=entidadesMap.get(id);
        System.out.println("se borro la entidad de nombre:"+entidadBorrar.getNombre());
        
        entidadesMap.remove(id);
    }
    
    
    
    
    
    public void guardar(Entidad ent){
        System.out.println("se ejecuto guardar de BancoEntidad ");
        entidadesMap.put(ent.getId(), ent);
        
    }
    
   
     public Map<Integer,Entidad> getEntidadesMap() {
         System.out.println("se ejecuto getEntidadesMap de BancoEntidad ");
        return entidadesMap;
    }

    public void setEntidadesMap(Map<Integer, Entidad> entidadesMap) {
         System.out.println("se ejecuto setEntidadesMap de BancoEntidad ");
        this.entidadesMap = entidadesMap;
    }

    public int getControlId() {
        System.out.println("se ejecuto getControlId de BancoEntidad ");

        return controlId;
    }

    public void setControlId(int controlId) {
        System.out.println("se ejecuto setControlId de BancoEntidad ");

        this.controlId = controlId;
    }
    
 
    
    public Iterator<Entidad> getItEntidades(){
        System.out.println("se ejecuto getIEntidades de BancoEntidad ");

        return (entidadesMap.values().iterator());
    }
    
    
    
    
    
}
