
package edu.strategy.impl;

/**
 *
 * @author Lenovo
 */
public class Principal {
    private String userName;
    private String rol;
    public Principal(String userName, String rol) { 
        this.userName = userName;
        this.rol = rol;
    }

    public Principal(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** GET AND SET */
    public String getUserName() { 
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() { 
        return "Principal{" + "userName=" + userName + ", rol=" + rol + '}';
    }
}
