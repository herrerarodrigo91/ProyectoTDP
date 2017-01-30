package acciones;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import modelos.Controlador;
import modelos.Entidad;



public class CargarAction extends ActionSupport implements ServletRequestAware {
    
    private String nombre;
    private String calificacion;
    private String descripcion;
    private File imagen;
    private String imagenContentType;
    private String imagenFileName;
    private HttpServletRequest servletRequest;
    
    private boolean mostrarInfoImagen=false;
    private boolean mostrarVideo=false;
    private Controlador cont;
    private String video;
    
    
    @Override
    public String execute()throws Exception{
        System.out.println("se ejecuto execute de CargarAction");
        
        cont=new Controlador();
        Entidad ent=new Entidad();
        ent.setNombre(nombre);
        ent.setCalificacion(Integer.parseInt(calificacion));
        ent.setDescripcion(descripcion);
        ent.setNombreVideo(video);
        System.out.println("el nombre del video queda como:$$$$$$$$$$$$$$$$$$$$$"+video);
        
        try{
            String direccionImagen = servletRequest.getSession().getServletContext().getRealPath("/");
            File imagenACrear = new File(direccionImagen , imagen.getName());
            System.out.println("el nombre de la imagen es!!!!!:"+imagen.getName());
            FileUtils.copyFile(this.imagen , imagenACrear);
        }catch(Exception e){
            System.out.println("se agarro el error*****************");
            
            e.printStackTrace();
            addActionError("no se cargo ninguna imagen");
            //hace imagen= new File ...
            String direccionImagen = servletRequest.getSession().getServletContext().getRealPath("/");
            imagen= new File(direccionImagen , "EmptyImage.tmp");
            ent.setNombreImagen(imagen.getName());  
            cont.agregarEntidad(ent);
            mostrarInfoImagen=true;
            System.out.println("el nombre del video queda como:$$$$$$$$$$$$$$$$$$$$$"+video);

            return INPUT;
             
        }
        mostrarInfoImagen=true;
        ent.setNombreImagen(imagen.getName());
        cont.agregarEntidad(ent);
        System.out.println("el nombre vacio de la descripcion es:###########"+descripcion);
        return SUCCESS;
        
    }
   

    public String getCalificacion() {
        System.out.println("se ejecuto getCalificacion de CargarAction");
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        System.out.println("se ejecuto setCalificacion de CargarAction");
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        System.out.println("se ejecuto getDescripcion de CargarAction");
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        System.out.println("se ejecuto setDescripcion de CargarAction");
        this.descripcion = descripcion;
    }
    
    public String getNombre() {
        System.out.println("se ejecuto getNombre de CargarAction");
        return nombre;
    }

    public void setNombre(String nombre) {
        System.out.println("se ejecuto setNombre de CargarAction");
        this.nombre = nombre;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public String getImagenContentType() {
        return imagenContentType;
    }

    public void setImagenContentType(String imagenContentType) {
        this.imagenContentType = imagenContentType;
    }

    public String getImagenFileName() {
        return imagenFileName;
    }

    public void setImagenFileName(String imagenFileName) {
        this.imagenFileName = imagenFileName;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }
    
    public String getNombreImagen(){
        return imagen.getName();
    }

    public boolean getMostrarInfoImagen() {
        return mostrarInfoImagen;
    }

    public String getVideo() {
        
        return video;
    }

    public void setVideo(String video) {
        
        if(!video.equals("")&&(video.contains("https://www.youtube.com/"))){
              //mostrarVideo=true;
            this.video=video.replace("watch?v=","embed/");            
        }else{this.video ="";}
        
    }

    public boolean isMostrarVideo() {
        return mostrarVideo;
    }
    
    
    
    
    
    
    
 
    
}
