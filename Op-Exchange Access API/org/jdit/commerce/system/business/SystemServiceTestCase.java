/**
 * SystemServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jdit.commerce.system.business;

public class SystemServiceTestCase extends junit.framework.TestCase {
    public SystemServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testSystemWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.jdit.commerce.system.business.SystemServiceLocator().getSystemAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.jdit.commerce.system.business.SystemServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1SystemGetSysInfo() throws Exception {
        org.jdit.commerce.system.business.SystemSoapBindingStub binding;
        try {
            binding = (org.jdit.commerce.system.business.SystemSoapBindingStub)
                          new org.jdit.commerce.system.business.SystemServiceLocator().getSystem();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.getSysInfo();
        // TBD - validate results
    }

    public void test2SystemGetSysVersion() throws Exception {
        org.jdit.commerce.system.business.SystemSoapBindingStub binding;
        try {
            binding = (org.jdit.commerce.system.business.SystemSoapBindingStub)
                          new org.jdit.commerce.system.business.SystemServiceLocator().getSystem();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.getSysVersion();
        // TBD - validate results
    }

}
