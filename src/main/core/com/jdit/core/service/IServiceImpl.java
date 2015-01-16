/*
 * IServiceImpl.java, 2013-6-14 下午09:04:57 xyluo
 * 
 * Copyright (c) 2011 Shanghai Qi(dea) Information Technology Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Qi(dea) or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package com.jdit.core.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jdit.community.web.column.servlet.IA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 
 * @author xyluo
 * @version 1.0, 2013-6-14
 * @since 1.0
 */
@Service
public class IServiceImpl implements IService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 查看最近两个月的交易记录
	 * <p>
	 * 即：以当前时间为准，往后推至上个月的一号零点零分零秒。
	 * 
	 * @return
	 */
	public List<IA> getLatestTransactionList() 
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date from = calendar.getTime();
		return getTransactionList(from);
	}
	
	public List<IA> getTransactionList(Date from) 
	{
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = format.format(from);
		List<Map<String, Object>> rs = jdbcTemplate.queryForList("SELECT * FROM pay_transaction WHERE TIMESTAMP >= ? ORDER BY TIMESTAMP DESC", s);
		List<IA> ias = new ArrayList<IA>(rs.size());
		for (Map<String, Object> result : rs) 
		{
			IA ia = new IA();
			ia.setId((Integer) result.get("id"));
			ia.setTsn((String) result.get("transaction_sn"));
			ia.setItem("淘宝购物-131-2098-4792 上海联通50元快充 上海联通充值卡50元 上海联通手机话费充值");
			ia.setAmount(((BigDecimal) result.get("amount")).floatValue());
			ia.setStatus(((String) result.get("status")).charAt(0));
			ia.setTimestamp((Date) result.get("timestamp"));
			ias.add(ia);
		}
		return ias;
	}
}
