package edu.strategy.impl;

/**
 *
 * @author Lenovo
 */
public class AuthenticationProvider {

    private IAuthenticationStrategy authenticationStrategy;

    public void setAuthenticationStrategy(IAuthenticationStrategy strategy){
        this.authenticationStrategy = strategy; 
    }

    public Principal authenticate(String userName, String password) {
        if (authenticationStrategy == null) {
            throw new RuntimeException("Estrategia de autenticación no definida");
        }
        return authenticationStrategy.authenticate(userName, password);
    }
}
