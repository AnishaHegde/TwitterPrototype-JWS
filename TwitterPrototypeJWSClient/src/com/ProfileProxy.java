package com;

public class ProfileProxy implements com.Profile {
  private String _endpoint = null;
  private com.Profile profile = null;
  
  public ProfileProxy() {
    _initProfileProxy();
  }
  
  public ProfileProxy(String endpoint) {
    _endpoint = endpoint;
    _initProfileProxy();
  }
  
  private void _initProfileProxy() {
    try {
      profile = (new com.ProfileServiceLocator()).getProfile();
      if (profile != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)profile)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)profile)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (profile != null)
      ((javax.xml.rpc.Stub)profile)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Profile getProfile() {
    if (profile == null)
      _initProfileProxy();
    return profile;
  }
  
  public int insertTweet(java.lang.String userId, java.lang.String tweetTextId, java.lang.String tweetData, java.lang.String hashtagData, java.lang.String isCreator, java.lang.String currentDate, java.lang.String userHandle) throws java.rmi.RemoteException{
    if (profile == null)
      _initProfileProxy();
    return profile.insertTweet(userId, tweetTextId, tweetData, hashtagData, isCreator, currentDate, userHandle);
  }
  
  public java.lang.String retrieveTweet(java.lang.String userId) throws java.rmi.RemoteException{
    if (profile == null)
      _initProfileProxy();
    return profile.retrieveTweet(userId);
  }
  
  
}