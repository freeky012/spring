package com.computer.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.computer.DAO.memberDAO;

@Controller
public class LoginController{
	
	@RequestMapping("/login.do")
	public ModelAndView handleRequest(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		memberDAO memberdao = new memberDAO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		int result = memberdao.userCheck(id, password);
		
		ModelAndView mav = new ModelAndView();

		request.setAttribute("result", result);

		if(result == 1) {
			session.setAttribute("id", id);
			session.setAttribute("password", password);
			mav.setViewName("index.jsp");
		} else
		{
			mav.setViewName("loginForm.jsp");
		}
						
		return mav;
		
		
		
	}

}
