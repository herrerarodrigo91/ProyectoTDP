
package acciones;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Collection;
import java.util.Map;
import modelos.BancoEntidades;
import modelos.Controlador;
import modelos.Entidad;


public class AdminAction extends ActionSupport {
    private String user;
    private String password;
    private Collection<Entidad> ce;
    private Controlador cont;
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de AdminAction");
        cont=new Controlador();
        if(ActionContext.getContext().getSession().containsKey("log")){
            ce=cont.entidades();
            return SUCCESS;
        }
        else{
                if("admin".equals(user) && "password".equals(password)){
                Map session=ActionContext.getContext().getSession();
                session.put("log",true);
               ce=cont.entidades();
                return SUCCESS;
               }
                return ERROR;
        }
        
        
    }
    
    public String logout()throws Exception{
        System.out.println("se ejecuto logoutde AdminAction");
        Map session=ActionContext.getContext().getSession();
        session.remove("log");
        return SUCCESS;
    }
    
    public String mostrarVistaCrearPartido(){
        System.out.println("se ejecuto mostrarVistaCrearPartido de AdminAction");
        return SUCCESS;
    }
    
    public String mostrarVistaAgregarImagen(){
        System.out.println("se ejecuto mostrarVistaAgregarImagende AdminAction");
        return SUCCESS;
    }
    
    public String getUser() {
        System.out.println("se ejecuto getUser de AdminAction");
        return user;
    }

    public void setUser(String user) {
        System.out.println("se ejecuto setUser de AdminAction");
        this.user = user;
    }

    public String getPassword() {
        System.out.println("se ejecuto getPassword de AdminAction");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("se ejecuto setPasswordde AdminAction");
        this.password = password;
    }

    public Collection<Entidad> getCe() {
        System.out.println("se ejecuto getCe de AdminAction");
        return ce;
    }

    public void setCe(Collection<Entidad> ce) {
        System.out.println("se ejecuto setCe de AdminAction");
        this.ce = ce;
    }
    
  
}
