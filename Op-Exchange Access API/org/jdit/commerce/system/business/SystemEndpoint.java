package org.jdit.commerce.system.business;

import javax.xml.rpc.ServiceException;

import org.jdit.commerce.system.System;
import org.springframework.remoting.jaxrpc.ServletEndpointSupport;

public class SystemEndpoint extends ServletEndpointSupport implements System {

	private System sys;

	protected void onInit() throws ServiceException {
		sys = (System) getWebApplicationContext().getBean("systemService");
	}

	public String getSysInfo() {
		return sys.getSysInfo();
	}
	
	public String getSysVersion() {
		return sys.getSysVersion();
	}
}