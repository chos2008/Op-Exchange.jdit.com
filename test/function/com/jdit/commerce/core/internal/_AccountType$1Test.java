package com.jdit.commerce.core.internal;

import java.util.Iterator;
import java.util.Map;

import com.jdit.onlinepaymentexchange.internal._AccountType$1;

import junit.framework.TestCase;

public class _AccountType$1Test extends TestCase {
	private _AccountType$1 accountType;
	protected void setUp() throws Exception {
		super.setUp();
		accountType = new _AccountType$1();
	}
	
	public void testGetAllAccountLevel() {
		System.out.println("--->" + "getAllAccountLevel()" + "<---");
		int level[] = accountType.getAllAccountLevel();
		for (int i = 0; i < level.length; i++) {
			System.out.println("--->" + level[i]);
		}
		System.out.println("--------------------------------------");
	}
	
	public void testGetAllAccountType() {
		System.out.println("--->" + "getAllAccountType()" + "<---");
		int type[] = accountType.getAllAccountType();
		for (int i = 0; i < type.length; i++) {
			System.out.println("--->" + type[i]);
		}
		System.out.println("--------------------------------------");
	}
	
	public void testMap() {
		System.out.println("--->" + "map()" + "<---");
		Map<Integer, String> map = accountType.map();
		Iterator<Integer> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			int i = iter.next();
			System.out.println("--->" + i + ":" + map.get(i));
		}
		System.out.println("--------------------------------------");
	}
	
	public void testGetAccountType() {
		System.out.println("--->" + "getAccountType()" + "<---");
		int index[] = new int[] {-1, 0, 17, 35, 36};
		for (int i = 0; i < index.length; i++) {
			String s = accountType.getAccountType(index[i]);
			System.out.println("--->" + index[i] + ":" + s);
		}
		System.out.println("--------------------------------------");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		accountType = null;
	}
}
