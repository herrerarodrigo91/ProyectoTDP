/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

/**
 *
 * @author Rodrigo
 */
public class informacionAction extends IOAction {
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de InformacionAction");
        return SUCCESS;
    }
    
}
