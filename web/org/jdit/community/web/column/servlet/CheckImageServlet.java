package org.jdit.community.web.column.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * <p>
 * @version 	1.0,  下午05:20:51 2011-3-18
 * @author 	ADA, ADR
 * @author 	Luo, Xiao-Yong
 * @see		
 * @see         
 */
public class CheckImageServlet extends HttpServlet {

	private static final long serialVersionUID = 7088050039095155693L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String rand = (String)session.getAttribute("rand");
		String input = request.getParameter("rand");
		  if (rand.equals(input)) {
			  response.getWriter().write("<font color=green>Equal，Success!</font>");
		  } else {
			  response.getWriter().write("<font color=red>Not Equal，Fail!</font>");
		  }
	}
}
