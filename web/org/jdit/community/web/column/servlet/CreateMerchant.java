/*
 * @(#)CreateMerchant.java   2011-3-23
 * <p>
 * Copyright 2008 JDIT INC, Inc. All rights reserved.
 * JDIT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * @version  1.0,  2011-3-23
 * @author  ADA, ADR, Luo, Xiao-Yong
 */
package org.jdit.community.web.column.servlet;

import com.jdit.onlinepaymentexchange.Merchant;

/**
 *
 * <p>
 * @version 	1.0,  下午09:29:55 2011-3-23
 * @author 	ADA, ADR
 * @author 	Luo, Xiao-Yong
 * @see		
 * @see         
 */
public class CreateMerchant {
	public void execute() {
		Merchant merchant = new Merchant();
		merchant.setName("Alibaba");
		merchant.setLocation("中国.浙江省.杭州市");
		merchant.setTrades("互联网行业，信息行业，电子商务行业，软件行业，金融行业，物流行业");
		merchant.setBusinesses("支付宝，淘宝，阿里云，云计算，云存储，B2B，C2C，B2C");
		merchant.setProducts("");
		System.out.println(merchant);
	}
}
