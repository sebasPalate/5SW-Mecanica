package edu.strategy.impl;

/**
 *
 * @author Lenovo
 */
public interface IAuthenticationStrategy {
    public Principal authenticate(String userName, String passwrd);
}
