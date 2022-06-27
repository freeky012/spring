package com.computer.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.computer.DAO.memberDAO;

@Controller
public class DropController  {

	@RequestMapping("/dropMember.do")
	public ModelAndView handleRequest(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		memberDAO memberdao = new memberDAO();
		memberdao.dropMember(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("logout.do");
		return mav;
		
	}

}
