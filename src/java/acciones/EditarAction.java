package acciones;

import com.opensymphony.xwork2.ActionSupport;
import modelos.BancoEntidades;
import modelos.Controlador;
import modelos.Entidad;


public class EditarAction extends ActionSupport{
    
    private String nuevoNombre;
    private String nuevaCalificacion;
    private String nuevaDescripcion;
    private String idBean;
    private Controlador cont;
    
//    public EditarAction(){
//        cont=new Controlador();
//    }
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de EditarAction");
        cont=new Controlador();
        int idEditar=Integer.parseInt(idBean);
        cont.remove(idEditar);
        Entidad ent=new Entidad();
        
        ent.setNombre(nuevoNombre);
        ent.setCalificacion(Integer.parseInt(nuevaCalificacion));
        ent.setDescripcion(nuevaDescripcion);
        cont.agregarEntidad(ent);
        return SUCCESS;
    }

    public String getNuevoNombre() {
        System.out.println("se ejecuto getNuevoNombre de EditarAction");
        return nuevoNombre;
    }

    public void setNuevoNombre(String nuevoNombre) {
        System.out.println("se ejecuto setNuevoNombre de EditarAction");
        this.nuevoNombre = nuevoNombre;
    }

    public String getNuevaCalificacion() {
        System.out.println("se ejecuto getNuevaCalificacion de EditarAction");
        return nuevaCalificacion;
    }

    public void setNuevaCalificacion(String nuevaCalificacion) {
        System.out.println("se ejecuto setNuevaCalificacion de EditarAction");
        this.nuevaCalificacion = nuevaCalificacion;
    }

    public String getNuevaDescripcion() {
        System.out.println("se ejecuto getNuevaDescripcion de EditarAction");
        return nuevaDescripcion;
    }

    public void setNuevaDescripcion(String nuevaDescripcion) {
        System.out.println("se ejecuto setnuevaDescripcion de EditarAction");
        this.nuevaDescripcion = nuevaDescripcion;
    }

    

    public String getIdBean() {
        System.out.println("se ejecuto getIdBean de EditarAction");
        return idBean;
    }

    public void setIdBean(String idBean) {
        System.out.println("se ejecuto setIdBean de EditarAction");
        this.idBean = idBean;
    }
    
    
    
    
}
