package com.jdit.common;

import java.util.List;

public class BaseMenu implements Menu {
	private int OBJECTID;
	private String name;
	
	public String toString() {
		return null;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Menu> getChildren() {
		return null;
	}
	
	public String getId() {
		return String.valueOf(OBJECTID);
	}
	
	public Menu getParent() {
		return null;
	}
	
	public boolean isLeaf() {
		return true;
	}
	
	public boolean isRoot() {
		return true;
	}
	
	////////////////////////////////////
	public int getOBJECTID() {
		return OBJECTID;
	}
	public void setOBJECTID(int OID) {
		OBJECTID = OID;
	}
}
