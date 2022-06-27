package com.computer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.computer.model.intCommand;
import com.computer.model.modelDropMember;
import com.computer.model.modelJoinMember;
import com.computer.model.modelListMember;
import com.computer.model.modelLogin;
import com.computer.model.modelLogout;
import com.computer.model.modelUpdateMember;
import com.computer.model.voidCommand;





@WebServlet("/member/*")
public class memController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		System.out.println("AAAAAAAAAAAAAAAAAAAA");
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String url = request.getRequestURI();
		voidCommand vcommand = null;
		intCommand icommand = null;
		int result = 0;
		String view = "/index.jsp";
		
					
		if(url.contains("index")) {
			view = "/index.jsp";
		} 
		else if (url.contains("login"))
		{
			
			icommand = new modelLogin();
			result = icommand.execute(request, response);
			
			if (result == 1)
				view = "/index.jsp";
			else
				view = "/loginForm.jsp";

		}
		else if(url.contains("logout"))
		{ 
			vcommand = new modelLogout();
			vcommand.execute(request,response);
			view ="/index.jsp";
		}
		else if(url.contains("joinMember"))
		{ 
			icommand = new modelJoinMember();
			result = icommand.execute(request,response);
			if(result == 1) view ="/loginForm.jsp";
			else view = "/joinMemberForm.jsp";
		}
		else if(url.contains("listMember"))
		{ 
			vcommand = new modelListMember();
			vcommand.execute(request,response);
			view = "/index.jsp";
		}
		else if(url.contains("updateMember"))
		{ 
			icommand = new modelUpdateMember();
			result = icommand.execute(request,response);
			if(result == 1) view = "/index.jsp";
			else view = "/updateMemberForm.jsp";
			
		}
		else if(url.contains("dropMember"))
		{ 
			vcommand = new modelDropMember();
			vcommand.execute(request,response);
			view ="/logout.do";
		} 
		
			
		 RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	     dispatcher.forward(request, response);
	}
	
}
