package acciones;

import com.opensymphony.xwork2.ActionSupport;
import modelos.BancoEntidades;
import modelos.Controlador;
import modelos.Entidad;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;


public class EditarAction extends ActionSupport implements ServletRequestAware {
    
    private String nuevoNombre;
    private String nuevaCalificacion;
    private String nuevaDescripcion;
    private String idBean;
    private File nuevaImagen;
    private String nuevaImagenContentType;
    private String nuevaImagenFileName;
    private HttpServletRequest servletRequest;
    private Controlador cont;
    
//    public EditarAction(){
//        cont=new Controlador();
//    }
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de EditarAction");
        cont=new Controlador();
        int idEditar=Integer.parseInt(idBean);
        
        Entidad entVieja = cont.getEntidad(idEditar);
        entVieja.setNombre(nuevoNombre);
        entVieja.setCalificacion(Integer.parseInt(nuevaCalificacion));
        entVieja.setDescripcion(nuevaDescripcion);
        try{
            String direccionImagen = servletRequest.getSession().getServletContext().getRealPath("/");
            File imagenACrear = new File(direccionImagen , nuevaImagen.getName());
            System.out.println("el nombre de la imagen es!!!!!:"+nuevaImagen.getName());
            FileUtils.copyFile(this.nuevaImagen , imagenACrear);
            entVieja.setNombreImagen(nuevaImagen.getName());
        }catch(Exception e){
//            String direccionImagen = servletRequest.getSession().getServletContext().getRealPath("/");
//            nuevaImagen= new File(direccionImagen , entVieja.getNombreImagen());
//            entNueva.setNombreImagen(nuevaImagen.getName());  
//            
//            cont.remove(idEditar);
//        cont.agregarEntidad(entNueva);
            cont.actualizar();
            return INPUT;
        }
        cont.actualizar();
        return SUCCESS;
    }
//        Entidad entNueva=new Entidad();
//        
//        entNueva.setNombre(nuevoNombre);
//        entNueva.setCalificacion(Integer.parseInt(nuevaCalificacion));
//        entNueva.setDescripcion(nuevaDescripcion);
//        try{
//            String direccionImagen = servletRequest.getSession().getServletContext().getRealPath("/");
//            File imagenACrear = new File(direccionImagen , nuevaImagen.getName());
//            System.out.println("el nombre de la imagen es!!!!!:"+nuevaImagen.getName());
//            FileUtils.copyFile(this.nuevaImagen , imagenACrear);
//            entNueva.setNombreImagen(nuevaImagen.getName());
//        }catch(Exception e){
//            System.out.println("se agarro el error*****************");
//            
//            e.printStackTrace();
//            addActionError("no se cargo ninguna imagen");
//            //hace imagen= new File ...
//            String direccionImagen = servletRequest.getSession().getServletContext().getRealPath("/");
//            nuevaImagen= new File(direccionImagen , entVieja.getNombreImagen());
//            entNueva.setNombreImagen(nuevaImagen.getName());  
//            
//            cont.remove(idEditar);
//        cont.agregarEntidad(entNueva);
//            return INPUT;
//        }
//        cont.remove(idEditar);
//        cont.agregarEntidad(entNueva);
//        return SUCCESS;
//    }

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

    public File getNuevaImagen() {
        return nuevaImagen;
    }

    public void setNuevaImagen(File nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    public String getNuevaImagenContentType() {
        return nuevaImagenContentType;
    }

    public void setNuevaImagenContentType(String nuevaImagenContentType) {
        this.nuevaImagenContentType = nuevaImagenContentType;
    }

    public String getNuevaImagenFileName() {
        return nuevaImagenFileName;
    }

    public void setNuevaImagenFileName(String nuevaImagenFileName) {
        this.nuevaImagenFileName = nuevaImagenFileName;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }
    
    
    
    
    
    
}
