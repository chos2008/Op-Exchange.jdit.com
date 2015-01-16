/**
 * SystemSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jdit.commerce.system.business;

public class SystemSoapBindingSkeleton implements org.jdit.commerce.system.business.System, org.apache.axis.wsdl.Skeleton {
    private org.jdit.commerce.system.business.System impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getSysInfo", _params, new javax.xml.namespace.QName("", "getSysInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:System", "getSysInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSysInfo") == null) {
            _myOperations.put("getSysInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSysInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getSysVersion", _params, new javax.xml.namespace.QName("", "getSysVersionReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:System", "getSysVersion"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSysVersion") == null) {
            _myOperations.put("getSysVersion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSysVersion")).add(_oper);
    }

    public SystemSoapBindingSkeleton() {
        this.impl = new org.jdit.commerce.system.business.SystemServiceEndpoint();
    }

    public SystemSoapBindingSkeleton(org.jdit.commerce.system.business.System impl) {
        this.impl = impl;
    }
    public java.lang.String getSysInfo() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getSysInfo();
        return ret;
    }

    public java.lang.String getSysVersion() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getSysVersion();
        return ret;
    }

}
