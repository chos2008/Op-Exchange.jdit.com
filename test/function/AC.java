/*
 * AC.java, 2013-8-14 上午10:35:03 A.DA
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
public class AC {

	private void sleep() 
	{
		try {
			Thread.sleep(1000 * 60 * 60 * 24);
		} catch (InterruptedException e) {
			System.out.println("wake up from sleep...");
		}
	}
	
	private void wait0() 
	{
		try {
			wait(1000 * 60 * 60 * 24);
		} catch (InterruptedException e) {
			System.out.println("wake up from wait...");
		}
	}
	
	public synchronized void put() 
	{
		System.out.println("put...");
		sleep();
	}
	
	public synchronized int get() 
	{
		System.out.println("get...");
		sleep();
		return -1;
	}
	
	public synchronized void put1()
	{
		System.out.println("put1...");
		wait0();
	}
	
	public synchronized int get1() 
	{
		System.out.println("get1...");
		sleep();
		return -1;
	}
	
	public void test()
	{
		System.out.println("test...");
	}
}
