package com;

public class LoginProxy implements com.Login {
  private String _endpoint = null;
  private com.Login login = null;
  
  public LoginProxy() {
    _initLoginProxy();
  }
  
  public LoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginProxy();
  }
  
  private void _initLoginProxy() {
    try {
      login = (new com.LoginServiceLocator()).getLogin();
      if (login != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)login)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (login != null)
      ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Login getLogin() {
    if (login == null)
      _initLoginProxy();
    return login;
  }
  
  public java.lang.String login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.login(username, password);
  }
  
  public int signup(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String userHandle, java.lang.String dob, java.lang.String contactNo, java.lang.String location) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.signup(email, firstName, lastName, password, userHandle, dob, contactNo, location);
  }
  
  
}