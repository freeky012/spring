package com.computer.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.computer.DAO.memberDAO;


public class DropController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		memberDAO memberdao = new memberDAO();
		memberdao.dropMember(id);
	
	return "logout.do";
		
		
		
	}

}
