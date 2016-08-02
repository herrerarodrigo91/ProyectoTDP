/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Rodrigo
 */
public class InfoAction extends ActionSupport {
    
    private String apellidoBean;
    @Override
    public String execute(){
        return SUCCESS;
    }

    public String getApellidoBean() {
        return apellidoBean;
    }

    public void setApellidoBean(String apellidoBean) {
        this.apellidoBean = apellidoBean;
    }
    
    
    
}
