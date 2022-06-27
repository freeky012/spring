package com.computer.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class ListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
    	memberDAO memberdao = new memberDAO();
		ArrayList<memberDTO> list = memberdao.listMember();
		request.setAttribute("list", list);
	
	return "index.jsp?pageinfo=/listMember";
		
		
		
	}

}
