
package acciones;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {
    private String user;
    private String password;
    
    @Override
    public String execute(){
        return SUCCESS;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
       

    
    

    
}
