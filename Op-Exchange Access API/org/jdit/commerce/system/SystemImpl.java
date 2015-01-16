package org.jdit.commerce.system;

public class SystemImpl implements System {

	public String getSysInfo() {
		return "JDIT COMMERCE PLATFORM\n" + 
			"Copyright 2004 JDIT SYS CORP, Inc. All rights reserved.";
	}

	public String getSysVersion() {
		return "JDIT COMMERCE 1.0";
	}

}
