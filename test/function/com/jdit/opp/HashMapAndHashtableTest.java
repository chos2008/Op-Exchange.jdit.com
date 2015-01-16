package com.jdit.opp;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import junit.framework.TestCase;

public class HashMapAndHashtableTest extends TestCase {
	private Map<Integer, String> map0 = 
		new HashMap<Integer, String>();
	
	private Map<Integer, String> map1 = 
		new Hashtable<Integer, String>();
	
//	public void testPerformance0() {
//		long startTime = System.currentTimeMillis();
//		Thread[] t = new Thread[100];
//		for (int i = 0; i < t.length; i++) {
//			t[i] = new Thread() {
//				public void run() {
//					for (int j = 0; j < 5000; j++) {
//						map0.put(j, j + "");
//					}
//				}
//			};
//			t[i].start();
//		}
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("ÏûºÄ0: " + (endTime - startTime) + " ms");
//	}
	
	public void testPerformance1() {
		long startTime = System.currentTimeMillis();
		Thread[] t = new Thread[100];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread() {
				public void run() {
					for (int j = 0; j < 5000; j++) {
						map1.put(j, j + "");
					}
				}
			};
			t[i].start();
		}
		while (true) {
			if (map1.size() == 500000) {
				long endTime = System.currentTimeMillis();
				System.out.println("ÏûºÄ1: " + (endTime - startTime) + " ms");
				break;
			}
		}
	}
}
