package com.computer.member;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class DetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		memberDAO memberdao = new memberDAO();
		memberDTO memberdto = new memberDTO();
		
		memberdto = memberdao.detailMember(id);
		
		request.setAttribute("memberdto", memberdto);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("detailMember");
		return mav;
			
	}

}
