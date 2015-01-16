/*
 * StudentController.java, 2013-6-7 下午05:52:04 xyluo
 * 
 * Copyright (c) 2011 Shanghai Qi(dea) Information Technology Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Qi(dea) or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package org.jdit.community.web.column.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.jdit.core.service.IService;

/**
 * 
 * @author xyluo
 * @version 1.0, 2013-6-7
 * @since 1.0
 */
@Controller
public class IController {

	@Autowired
	private IService iService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));//注册个人编辑器。
		// binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
	}

//	@RequestMapping(params = "method=add")
	@RequestMapping("/i.do")
	public String addStudent(HttpServletRequest request, ModelMap model) throws IOException {

		List<IA> list = new ArrayList<IA>();
		list.add(new IA());
		list.add(new IA());
		list.add(new IA());
		list.add(new IA());
		list.add(new IA());
		list.add(new IA());
		list.add(new IA());

		List<IA> ias = iService.getLatestTransactionList();
		
		model.addAttribute("studentlist", ias);//request保存这个对象
		return "i";
	}
}
