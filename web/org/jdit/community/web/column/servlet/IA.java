/*
 * Student.java, 2013-6-7 下午05:52:56 xyluo
 * 
 * Copyright (c) 2011 Shanghai Qi(dea) Information Technology Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Qi(dea) or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package org.jdit.community.web.column.servlet;

import java.util.Date;

/**
 * 
 * @author xyluo
 * @version 1.0, 2013-6-7
 * @since 1.0
 */
public class IA {

	private int id;
	
	private String tsn;
	
	private String item;
	
	private float amount;
	
	private char status;
	
	private Date timestamp;
	
	public IA() {
		id = (int) (Math.random() * 100);
		tsn = String.valueOf(id);
		item = "淘宝购物-131-2098-4792 上海联通50元快充 上海联通充值卡50元 上海联通手机话费充值";
		timestamp = new Date();
	}
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tsn
	 */
	public String getTsn() {
		return tsn;
	}


	/**
	 * @param tsn the tsn to set
	 */
	public void setTsn(String tsn) {
		this.tsn = tsn;
	}


	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}


	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}


	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}


	/**
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}


	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}


	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
