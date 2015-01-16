package com.jdit.onlinepaymentexchange;

/**
 * Hi 电子帐户模型 定义。一个帐户下可以关联多张电子支付卡
 * 
 * @author Adr, Ada
 * @version 1.0 2008.04.23
 */
public class HiAccount {
	private double balance;
	private int unit; // 计量单位 千(K) 万(W), 百万(M), 千万(KW), 亿(HM), 十亿(B), 百亿(HB), 千亿(TB)
	private byte status;
	
	private String name;
	private String _real_name;
	private String _id_card;
	
}