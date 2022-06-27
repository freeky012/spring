package com.computer.member;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LogoutController {

	@RequestMapping("/logout.do")
	public ModelAndView handleRequest(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.invalidate();
				
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
		
		
		
	}

}
