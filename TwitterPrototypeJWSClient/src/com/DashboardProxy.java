package com;

public class DashboardProxy implements com.Dashboard {
  private String _endpoint = null;
  private com.Dashboard dashboard = null;
  
  public DashboardProxy() {
    _initDashboardProxy();
  }
  
  public DashboardProxy(String endpoint) {
    _endpoint = endpoint;
    _initDashboardProxy();
  }
  
  private void _initDashboardProxy() {
    try {
      dashboard = (new com.DashboardServiceLocator()).getDashboard();
      if (dashboard != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dashboard)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dashboard)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dashboard != null)
      ((javax.xml.rpc.Stub)dashboard)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Dashboard getDashboard() {
    if (dashboard == null)
      _initDashboardProxy();
    return dashboard;
  }
  
  public java.lang.String retrieveAllTweets(java.lang.String email) throws java.rmi.RemoteException{
    if (dashboard == null)
      _initDashboardProxy();
    return dashboard.retrieveAllTweets(email);
  }
  
  
}