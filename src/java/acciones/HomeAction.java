
package acciones;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import modelos.*;

public class HomeAction extends ActionSupport {
    //private Iterator<Entidad> ie;
    //private BancoEntidades be;
    private Collection<Entidad> ce;
    private Controlador cont;
     
//    public HomeAction(){
//        
//    }
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de HomeAction");
        cont=new Controlador();
        ce=cont.entidades();
        return SUCCESS;
    }

//    public Iterator<Entidad> getIe() {
//        System.out.println("se ejecuto getIe de HomeAction");
//        return ie;
//    }

//    public void setIe(Iterator<Entidad> ie) {
//        System.out.println("se ejecuto setIe de HomeAction");
//        this.ie = ie;
//    }
//
//    public BancoEntidades getBe() {
//        System.out.println("se ejecuto getBe de HomeAction");
//        return be;
//    }
//
//    public void setBe(BancoEntidades be) {
//        System.out.println("se ejecuto setBe de HomeAction");
//        this.be = be;
//    }

    public Collection<Entidad> getCe() {
        System.out.println("se ejecuto getCe de HomeAction");
        return ce;
    }

    public void setCe(Collection<Entidad> ce) {
        System.out.println("se ejecuto setCe de HomeAction");
        this.ce = ce;
    }

  
    
}
