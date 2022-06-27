package com.computer.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
    	memberDAO memberdao = new memberDAO();
		ArrayList<memberDTO> list = memberdao.listMember();
		request.setAttribute("list", list);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listMember");
		return mav;
		
	}

}
