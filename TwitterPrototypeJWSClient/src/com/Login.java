/**
 * Login.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface Login extends java.rmi.Remote {
    public java.lang.String login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public int signup(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String userHandle, java.lang.String dob, java.lang.String contactNo, java.lang.String location) throws java.rmi.RemoteException;
}
