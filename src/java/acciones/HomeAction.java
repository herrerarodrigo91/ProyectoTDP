
package acciones;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import modelos.*;

public class HomeAction extends ActionSupport {
    //private Iterator<Entidad> ie;
    //private BancoEntidades be;
    private Collection<Entidad> ce;
    private Controlador cont;
    private boolean modoAdmin;
     
//    public HomeAction(){
//        
//    }
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de HomeAction");
        cont=new Controlador();
        ce=cont.entidades();
        modoAdmin=(ActionContext.getContext().getSession().containsKey("logeado"));
        
        System.out.println("Modo admin da como resultado:    "+modoAdmin);
        System.out.println("la llave log da como resultado:   "+ActionContext.getContext().getSession().get("log"));
        return SUCCESS;
    }



    public Collection<Entidad> getCe() {
        System.out.println("se ejecuto getCe de HomeAction");
        return ce;
    }

    public void setCe(Collection<Entidad> ce) {
        System.out.println("se ejecuto setCe de HomeAction");
        this.ce = ce;
    }

    public boolean isModoAdmin() {
        return modoAdmin;
    }

    public void setModoAdmin(boolean modoAdmin) {
        this.modoAdmin = modoAdmin;
    }

   
    
    

  
    
}
