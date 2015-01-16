/*
 * IService.java, 2013-6-14 下午09:04:39 xyluo
 * 
 * Copyright (c) 2011 Shanghai Qi(dea) Information Technology Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Qi(dea) or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package com.jdit.core.service;

import java.util.List;

import org.jdit.community.web.column.servlet.IA;

/**
 * 
 * @author xyluo
 * @version 1.0, 2013-6-14
 * @since 1.0
 */
public interface IService {

	public List<IA> getLatestTransactionList();
	
}
