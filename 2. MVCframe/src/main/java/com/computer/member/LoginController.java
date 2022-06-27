package com.computer.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.computer.DAO.memberDAO;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		memberDAO memberdao = new memberDAO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		int result = memberdao.userCheck(id, password);
		
		if(result == 1) {
			session.setAttribute("id", id);
			session.setAttribute("password", password);
		}
				
		return "index";
		
		
		
	}

}
