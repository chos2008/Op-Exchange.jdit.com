/**
 * SystemServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jdit.commerce.system.business;

public class SystemServiceLocator extends org.apache.axis.client.Service implements org.jdit.commerce.system.business.SystemService {

    public SystemServiceLocator() {
    }


    public SystemServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for System
    private java.lang.String System_address = "http://localhost:8080/axis/services/System";

    public java.lang.String getSystemAddress() {
        return System_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemWSDDServiceName = "System";

    public java.lang.String getSystemWSDDServiceName() {
        return SystemWSDDServiceName;
    }

    public void setSystemWSDDServiceName(java.lang.String name) {
        SystemWSDDServiceName = name;
    }

    public org.jdit.commerce.system.business.System getSystem() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(System_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystem(endpoint);
    }

    public org.jdit.commerce.system.business.System getSystem(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.jdit.commerce.system.business.SystemSoapBindingStub _stub = new org.jdit.commerce.system.business.SystemSoapBindingStub(portAddress, this);
            _stub.setPortName(getSystemWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemEndpointAddress(java.lang.String address) {
        System_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.jdit.commerce.system.business.System.class.isAssignableFrom(serviceEndpointInterface)) {
                org.jdit.commerce.system.business.SystemSoapBindingStub _stub = new org.jdit.commerce.system.business.SystemSoapBindingStub(new java.net.URL(System_address), this);
                _stub.setPortName(getSystemWSDDServiceName());
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
        if ("System".equals(inputPortName)) {
            return getSystem();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:System", "SystemService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:System", "System"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("System".equals(portName)) {
            setSystemEndpointAddress(address);
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
