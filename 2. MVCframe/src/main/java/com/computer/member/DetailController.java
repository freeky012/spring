package com.computer.member;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class DetailController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		memberDAO memberdao = new memberDAO();
		memberDTO memberdto = new memberDTO();
		
		memberdto = memberdao.detailMember(id);
		
		request.setAttribute("memberdto", memberdto);
		
	return "index.jsp?pageinfo=/detailMember";
		
		
		
	}

}
