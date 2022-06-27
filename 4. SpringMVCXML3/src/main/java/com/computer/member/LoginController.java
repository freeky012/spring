package com.computer.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.computer.DAO.memberDAO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		memberDAO memberdao = new memberDAO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		int result = memberdao.userCheck(id, password);
		
		if(result == 1) {
			session.setAttribute("id", id);
			session.setAttribute("password", password);
		}
				
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:index.jsp");
		return mav;
		
		
		
	}

}
