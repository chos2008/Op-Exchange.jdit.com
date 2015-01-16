/*
 * ACTest.java, 2013-8-14 上午10:38:37 A.DA
 * 
 * Copyright (c) 2013 JDIT Corp Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by JDIT or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */

/**
 * 
 * 
 * @author A.DA, A.DR, Luo, XIAO-YONG
 * @version 1.0, 2013-8-14
 * @since JDK1.6
 */

class ACThread extends Thread 
{
	private AC ac;
	
	public ACThread(AC ac) 
	{
		this.ac = ac;
	}
}
public class ACTest {

	public static void main(String[] args) throws Exception 
	{
		final AC ac = new AC();
		
		
		
		final Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				ac.put();
			}
		});
		t1.start();
//		
//		new Thread(new Runnable() {
//			
//			public void run() {
//				ac.get();
//			}
//		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				ac.test();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t1.interrupt();
			}
		}).start();
	}
	
	
}
