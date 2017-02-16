/**
 * DashboardService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface DashboardService extends javax.xml.rpc.Service {
    public java.lang.String getDashboardAddress();

    public com.Dashboard getDashboard() throws javax.xml.rpc.ServiceException;

    public com.Dashboard getDashboard(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
