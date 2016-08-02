package modelos;
import java.util.LinkedList;
import java.util.Map;
//la ide es poner en el mapa entradas de <id,partido> para poder encontrar con el id el 
//partido mas rapido mas eficiente 
//poner en persona como atributo id
//un metodo que retorne un iterador con los value del map
//poder pasar de String a entero para poder usar el id para buscar los partidos


public class ClaseLista {
     LinkedList<Persona> listaPersonas;
     
    
    public ClaseLista(){
      listaPersonas=new LinkedList<Persona>();
      listaPersonas.add(new Persona("rodrigo","herrera"));
      listaPersonas.add(new Persona("eduardo","lopez"));
      listaPersonas.add(new Persona("catalina","gonzales"));
      
    }

    public LinkedList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    
}
