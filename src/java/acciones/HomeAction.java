
package acciones;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import modelos.ClaseLista;
import modelos.Persona;

public class HomeAction extends ActionSupport {
    private List<Persona> cl;
    
    
    @Override
    public String execute(){
        cl=new LinkedList<Persona>() {};
        cl.add(new Persona("alejandro","gomez"));
        cl.add(new Persona("tincho","guzma"));
        cl.add(new Persona("lucho","perez"));
        return SUCCESS;
    }

    public List<Persona> getCl() {
        return cl;
    }

    public void setCl(List<Persona> cl) {
        this.cl = cl;
    }

    
    
    
    
    
}
