package com.computer.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.computer.DAO.memberDAO;

public class modelLogin implements intCommand{

	@Override
	public int execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		memberDAO memberdao = new memberDAO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		int result = memberdao.userCheck(id, password);
		
		if(result == 1) {
			session.setAttribute("id", id);
			session.setAttribute("password", password);
		}
			
		
		return result;
		
		
	
	}
	

}
