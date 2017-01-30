package acciones;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import modelos.BancoEntidades;
import modelos.Controlador;
import modelos.Entidad;

public class IOAction extends ActionSupport {
    
    private String idBean;
    private String nombre;
    private String calificacion;
    private String imagen;
    private String descripcion;
    private String boton;
    private Controlador cont;
    private boolean modoAdmin;
    private String video;
    
//    public IOAction(){
//        cont=new Controlador();
//    }
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de IOAction");
        cont=new Controlador();
        if("verEntidad".equals(boton)){
            llenarVer(Integer.parseInt(idBean));
            return "verEntidadResult";
        }
        if("eliminarEntidad".equals(boton)){
            cont.remove(Integer.parseInt(idBean));
            return "eliminarEntidadResult";
        }
        if("editarEntidad".equals(boton)){
            llenarVer(Integer.parseInt(idBean));
            return "editarEntidadResult";
        }
        modoAdmin=(ActionContext.getContext().getSession().containsKey("logeado"));
        return SUCCESS;
    }
    
    public void llenarVer(int id){
        System.out.println("se ejecuto llenarVer de IOAction");
        Entidad ent=cont.getEntidad(id);
        nombre=ent.getNombre();
        calificacion=ent.getCalificacion()+"";
        imagen=ent.getNombreImagen();
        descripcion=ent.getDescripcion();
        video=ent.getNombreVideo();
        
    }

    public String getBoton() {
        System.out.println("se ejecuto getBoton de IOAction");
        return boton;
    }

    public void setBoton(String boton) {
        System.out.println("se ejecuto setBoton de IOAction");
        this.boton = boton;
    }
    
    public String getNombre() {
        System.out.println("se ejecuto getNombre de IOAction");
        return nombre;
    }

    public void setNombre(String nombre) {
        System.out.println("se ejecuto setNombre de IOAction");
        this.nombre = nombre;
    }

    public String getCalificacion() {
        System.out.println("se ejecuto getCalificacion de IOAction");
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        System.out.println("se ejecuto setCalificacion de IOAction");
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        System.out.println("se ejecuto getDescripcion de IOAction");
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        System.out.println("se ejecuto setDescripcion de IOAction");
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
    

   
    
    
    
    

    public String getIdBean() {
        System.out.println("se ejecuto getIdBean de IOAction");
        return idBean;
    }

    public void setIdBean(String idBean) {
        System.out.println("se ejecuto setIdBean de IOAction");
        this.idBean = idBean;
    }

    public boolean isModoAdmin() {
        return modoAdmin;
    }

    public void setModoAdmin(boolean modoAdmin) {
        this.modoAdmin = modoAdmin;
    }
    
//    public String regresar(){
//        if(modoAdmin){
//            return "atrasuser";
//        }else{
//            ActionContext.getContext().getActionInvocation()
//        }
//    }
    
    
 
    
    
}
