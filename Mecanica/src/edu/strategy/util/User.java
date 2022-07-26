
package edu.strategy.util;

/**
 *
 * @author Lenovo
 */
public class User {
    private String userName;
    private String password;
    private String rol;

    public User(String userName, String password, String rol) {
        this.userName = userName;
        this.password = password;
        this.rol = rol;
    }

    /** GET AND SET */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
