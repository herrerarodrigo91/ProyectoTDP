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
public class EliminarPartidoAction extends IOAction { //hay que borrar esta clase
    
    @Override
    public String execute(){
        System.out.println("se ejecuto execute de EliminarAction");
        return SUCCESS;
    }
    
}
