/**
 * ProfileService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface ProfileService extends javax.xml.rpc.Service {
    public java.lang.String getProfileAddress();

    public com.Profile getProfile() throws javax.xml.rpc.ServiceException;

    public com.Profile getProfile(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
