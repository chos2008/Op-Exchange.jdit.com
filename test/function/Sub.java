/*
 * Sub.java, 2013-9-7 下午08:53:22 A.DA
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
public class Sub extends Base {

	static int sti;
	
	int i;
	
	public Sub(int sti, int i)
	{
		Sub.sti = sti;
		this.i = i;
//		Base.sti = spsti;
//		super.i = spi;
	}
	
	void getSti() 
	{
		System.out.println("Sub getSti() " + Sub.sti + ", sp sti: " + Base.sti);
	}
	
	void get() 
	{
		System.out.println("Sub get() " + this.i + ", sp i: " + super.i);
	}
}
