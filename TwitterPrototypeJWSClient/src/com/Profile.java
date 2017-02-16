/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface Profile extends java.rmi.Remote {
    public java.lang.String retrieveTweet(java.lang.String userId) throws java.rmi.RemoteException;
    public int insertTweet(java.lang.String userId, java.lang.String tweetTextId, java.lang.String tweetData, java.lang.String hashtagData, java.lang.String isCreator, java.lang.String currentDate, java.lang.String userHandle) throws java.rmi.RemoteException;
}
