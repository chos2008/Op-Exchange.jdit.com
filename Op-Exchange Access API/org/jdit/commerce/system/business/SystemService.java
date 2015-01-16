/**
 * SystemService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jdit.commerce.system.business;

public interface SystemService extends javax.xml.rpc.Service {
    public java.lang.String getSystemAddress();

    public org.jdit.commerce.system.business.System getSystem() throws javax.xml.rpc.ServiceException;

    public org.jdit.commerce.system.business.System getSystem(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
