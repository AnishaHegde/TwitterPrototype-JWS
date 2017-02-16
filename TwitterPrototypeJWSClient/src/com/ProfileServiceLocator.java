/**
 * ProfileServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ProfileServiceLocator extends org.apache.axis.client.Service implements com.ProfileService {

    public ProfileServiceLocator() {
    }


    public ProfileServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProfileServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Profile
    private java.lang.String Profile_address = "http://localhost:8080/TwitterPrototypeJWS/services/Profile";

    public java.lang.String getProfileAddress() {
        return Profile_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProfileWSDDServiceName = "Profile";

    public java.lang.String getProfileWSDDServiceName() {
        return ProfileWSDDServiceName;
    }

    public void setProfileWSDDServiceName(java.lang.String name) {
        ProfileWSDDServiceName = name;
    }

    public com.Profile getProfile() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Profile_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProfile(endpoint);
    }

    public com.Profile getProfile(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ProfileSoapBindingStub _stub = new com.ProfileSoapBindingStub(portAddress, this);
            _stub.setPortName(getProfileWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProfileEndpointAddress(java.lang.String address) {
        Profile_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.Profile.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ProfileSoapBindingStub _stub = new com.ProfileSoapBindingStub(new java.net.URL(Profile_address), this);
                _stub.setPortName(getProfileWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Profile".equals(inputPortName)) {
            return getProfile();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com", "ProfileService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com", "Profile"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Profile".equals(portName)) {
            setProfileEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
