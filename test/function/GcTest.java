import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
public class GcTest {

	private static String readCommand() throws IOException
	{
		InputStream in = System.in;
		
		StringBuilder sb = new StringBuilder();
		while (true)
		{
			char c = (char) in.read();
			if (c == '\r')
			{
				in.read();
				break;
			}
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("----");
//		
//		List<String> list = new ArrayList<String>();
//		
//		while (true) 
//		{
//			System.out.print(">");
//			String line = readCommand();
//			if ("continue".equalsIgnoreCase(line)) 
//			{
//				break;
//			} else {
//				
//			}
//		}
//		
//		System.out.println("Continue!");
//		for (int i = 0; i < 10000000; i++)
//		{
//			list.add("" + i);
//			System.out.println("----" + i);
//			//Thread.sleep(2000);
//		}
	}
}
