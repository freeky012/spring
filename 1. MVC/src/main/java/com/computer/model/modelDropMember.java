package com.computer.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.computer.DAO.memberDAO;

public class modelDropMember implements voidCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		memberDAO memberdao = new memberDAO();
		memberdao.dropMember(id);
		
	}
	

}
