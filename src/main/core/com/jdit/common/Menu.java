package com.jdit.common;

import java.util.List;

public interface Menu {
	public String getId();
	public String getName();
	public void setName(String name);

	public boolean isLeaf();
	public boolean isRoot();
	
	public List<Menu> getChildren();
	public Menu getParent();
}