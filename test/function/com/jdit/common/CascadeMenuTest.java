package com.jdit.common;

import java.util.List;

import junit.framework.TestCase;

public class CascadeMenuTest extends TestCase {
	protected void setUp() {
		
	}
	
	public void testLookupPath() {
		CascadeMenu parent = new CascadeMenu();
		parent.setName("ROOT");
		CascadeMenu m = new CascadeMenu();
		m.setName("���� / ����");
		m.setParent(parent);
		String p = m.lookupPath();
		System.out.println("--->" + p);
	}
	
	public void testLookupPathAsArray() {
		CascadeMenu root = new CascadeMenu();
		root.setName("R/O/O/T");
		
		CascadeMenu parent = new CascadeMenu();
		parent.setName("һ���˵�");
		parent.setParent(root);
		
		CascadeMenu m = new CascadeMenu();
		m.setName("���� / ����");
		m.setParent(parent);
		
		List<String> path = m.lookupPathAsList();
		for (int i = 0, size = path.size(); i < size; i++) {
			String s = path.get(i);
			System.out.println("--->" + s);
		}
	}
}
