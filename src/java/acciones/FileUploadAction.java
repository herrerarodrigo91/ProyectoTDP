/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Rodrigo
 */
public class FileUploadAction extends ActionSupport implements ServletRequestAware{
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;
    
    @Override
    public String execute(){
        System.out.println("se ejectuo execute de FileUploadAction");
        try{
            String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
            System.out.println("direccion del servidor : "+filePath);
            File fileToCreate = new File(filePath,this.userImageFileName);
            FileUtils.copyFile(this.userImage , fileToCreate);
        }catch(Exception e){
            e.printStackTrace();
            addActionError(e.getMessage());
            return INPUT;
        }
        
        return SUCCESS;
    }

    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }
    
    
    
    
    
    
    
    
}
