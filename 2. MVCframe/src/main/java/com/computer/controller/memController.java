package com.computer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.computer.member.Controller;

@WebServlet("*.do")
public class memController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	
	@Override
	public void init() throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		Controller ctrl = handlerMapping.getController(path);
		String viewName = ctrl.handleRequest(request, response);
		
		String view = null;
		if(!viewName.contains(".do"))
		{
			view = viewResolver.getView(viewName);
		} else
		{
			view = viewName;
		}
	
		 RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	     dispatcher.forward(request, response);
	}
	
}
