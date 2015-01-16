/*
 * Base.java, 2013-9-7 下午08:51:59 A.DA
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
 * @version 1.0, 2013-9-7
 * @since JDK1.6
 */
public class Base {

	static int sti;
	
	int i;
	
	public Base()
	{
		
	}
	
	public Base(int sti, int i)
	{
		this.sti = sti;
		this.i = i;
	}
	
	void getSti() 
	{
		System.out.println("Base getSti() " + sti);
	}
	
	void get() 
	{
		System.out.println("Base get() " + i);
	}
}
