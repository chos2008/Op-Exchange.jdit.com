package com.jdit.onlinepaymentexchange;

import java.util.Map;

public interface AccountType$1 {

	public int[] getAllAccountType();
	public int[] getAllAccountLevel();
	
	public Map<Integer, String> map();
	public Map<Integer, String> getAllAccountTypeMap();
	public Map<Integer, String> getAllAccountLevelMap();
	/*
	//	PERSONAL, //个人
	//	GROUP,    //集团
	//  INTERNATIONAL  //国际
	//
	//  NORMAL    //普通
	//	GOLD,     //金牌
	//	PLATINUM, //白金
	//	DIAMOND   //钻石
	*/
	public static final short PERSONAL = 0x00;
	public static final short GROUP = 0x10;
	public static final short INTERNATIONAL = 0x20;
	
	public static final String PERSONAL_NAME = "个人帐户";
	public static final String GROUP_NAME = "集团帐户";
	public static final String INTERNATIONAL_NAME = "国际帐户";

	public static final short NORMAL = 0x00;
	public static final short GOLD = 0x01;
	public static final short PLATINUM = 0x02;
	public static final short DIAMOND = 0x03;
	
	public static final String NORMAL_NAME = "普通";
	public static final String GOLD_NAME = "金牌";
	public static final String PLATINUM_NAME = "白金";
	public static final String DIAMOND_NAME = "钻石";
}
