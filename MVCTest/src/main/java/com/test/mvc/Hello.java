package com.test.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//비지니스 업무 처리 or 데이터베이스 처리
		//화면 제작 > JSP에게 위임
		
		System.out.println("Hello");
		
		//resp.sendRedirect("/mvc/hello.jsp");
		
		int count = 100;
		
		req.setAttribute("count", count);
		//pageContext > RequestDispatcher
		
		RequestDispatcher dispacher = req.getRequestDispatcher("/WEB-INF/views/hello.jsp");
		
		dispacher.forward(req, resp);
		
	}//doGet
	
	

}//Hello extends HttpServlet
