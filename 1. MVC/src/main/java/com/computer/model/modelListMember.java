package com.computer.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class modelListMember implements voidCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
				
		memberDAO memberdao = new memberDAO();
		
		ArrayList<memberDTO> list = memberdao.listMember();
		
		request.setAttribute("list", list);
	
	}
	

}
