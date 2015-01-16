package com.jdit.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class CascadeMenu extends BaseMenu {
	private CascadeMenu parent;

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public String lookupPath() {
		String path = "";
		CascadeMenu m = this;
		while (m != null) {
			String p = m.getName();
			p = Pattern.compile("/").matcher(p).replaceAll("//");
			path = "/" + p + path;
			m = m.getParent();
		}
		return path;
	}
	
	public List<String> lookupPathAsList() {
		List<String> path = new LinkedList<String>();
		CascadeMenu m = this;
		while (m != null) {
			String name = m.getName();
			path.add(0, name);
			m = m.getParent();
		}
		return path;
	}
	
	public List<Menu> getChildren() {
		return null;
	}

	public boolean isLeaf() {
		return false;
	}

	public boolean isRoot() {
		return parent == null;
	}

	///////////////////////////////////////
	public CascadeMenu getParent() {
		return parent;
	}
	public void setParent(CascadeMenu menu) {
		this.parent = menu;
	}
}
