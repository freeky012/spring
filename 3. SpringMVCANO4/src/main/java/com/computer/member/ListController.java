package com.computer.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

@Controller
public class ListController {

	@RequestMapping("/listMember.do")
	public ModelAndView handleRequest(HttpServletRequest request) {
		
    	memberDAO memberdao = new memberDAO();
		ArrayList<memberDTO> list = memberdao.listMember();
		System.out.println(list);
		request.setAttribute("list", list);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp?pageinfo=/listMember.jsp");
		return mav;
		
	}

}
