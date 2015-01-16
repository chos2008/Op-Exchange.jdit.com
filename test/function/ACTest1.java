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

public class ACTest1 {

	public static void main(String[] args) throws Exception 
	{
		final AC ac = new AC();
		
		final Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				ac.put1();
			}
		});
		t1.start();
		
		
		new Thread(new Runnable() {
			
			public void run() {
				ac.get1();
			}
		}).start();
		
	}
	
	
}
