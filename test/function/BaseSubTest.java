/*
 * BaseSubTest.java, 2013-9-7 下午08:58:07 A.DA
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
public class BaseSubTest {

	public static void main(String[] args) throws Exception 
	{
		Base b = new Base(1,1);
		b.getSti();
		b.get();
		
		Sub s = new Sub(2, 2);
		s.getSti();
		s.get();
		
		Base a = new Sub(3, 3);
		a.getSti();
		a.get();
	}
}
