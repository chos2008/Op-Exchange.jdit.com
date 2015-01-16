/*
 * @(#)Merchant.java   2011-3-18
 * <p>
 * Copyright 2008 JDIT INC, Inc. All rights reserved.
 * JDIT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 * @version  1.0,  2011-3-18
 * @author  ADA, ADR, Luo, Xiao-Yong
 */
package com.jdit.onlinepaymentexchange;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 商户定义
 * <p>
 * @version 	1.0,  下午12:32:01 2011-3-18
 * @author 	ADA, ADR
 * @author 	Luo, Xiao-Yong
 * @see		
 * @see         
 */
public class Merchant {
	private String name;
	
	/**
	 * 商户所在地址
	 */
	private String location;
	
	/**
	 * 经营行业，所从事的行业
	 */
	private String trades;
	
	/**
	 * 经营业务，所经营的业务
	 */
	private String businesses;
	
	/**
	 * 所经营、生产、制造或研发的产品
	 */
	private String products;
	/**
	 * {@link #businesses}, {@link #products} 都可归为商品，按照
	 * 商品的分类规则，{@link #businesses}通常指的是虚拟商品；
	 * 而{@link #products}指的是实物商品。
	 */

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTrades() {
		return trades;
	}

	public void setTrades(String trades) {
		this.trades = trades;
	}

	public String getBusinesses() {
		return businesses;
	}

	public void setBusinesses(String businesses) {
		this.businesses = businesses;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}
}