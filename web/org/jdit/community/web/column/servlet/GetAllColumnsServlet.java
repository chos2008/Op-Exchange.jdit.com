package org.jdit.community.web.column.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.jdit.community.common.model.Column;
//import org.jdit.community.service.ColumnService;
//import org.jdit.community.service.ColumnServiceImpl;

public class GetAllColumnsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		long sTime = System.currentTimeMillis();
//		
//		System.out.println("q: " + request.getParameter("q"));
//		System.out.println("sid: " + request.getParameter("sid"));
//		ColumnService columnService = new ColumnServiceImpl();
//		SessionFactory sessionFactory = new Configuration()
//			.configure("/org/jdit/community/support/hibernate/hibernate.cfg.xml")
//			.buildSessionFactory();
//		columnService.setSessionFactory(sessionFactory);
//		List<Column> columns = columnService.getAllColumns();
//		
//		long time2 = System.currentTimeMillis();
//		System.out.println("��ȡ��ݣ� ��ʱ�� " + (time2 - sTime) + " ms");
//		StringBuffer sBuffer = new StringBuffer();
//		sBuffer.append("<?xml version=\"1.0\" encoding=\"GB2312\"?>");
//		sBuffer.append("<columns>");
//		for (Column column : columns) {
//			sBuffer.append("<column>");
//			sBuffer.append("<name>" + column.getName() + "</name>");
//			sBuffer.append("<creation-date>" + column.getCreationDate() + "</creation-date>");
//			sBuffer.append("<desc>" + column.getDesc() + "</desc>");
//			sBuffer.append("</column>");
//		}
//		sBuffer.append("</columns>");
//		System.out.println("��װ��ݣ� ��ʱ�� " + (System.currentTimeMillis() - time2) + " ms");
//		response.setContentType("text/xml");
//		OutputStream oStream = response.getOutputStream();
//		oStream.write(sBuffer.toString().getBytes());
	}
}
