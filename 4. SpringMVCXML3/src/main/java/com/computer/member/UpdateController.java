package com.computer.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		memberDAO memberdao = new memberDAO();
		memberDTO memberdto = new memberDTO();
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String password2 = (String) session.getAttribute("password");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		String job = request.getParameter("job");
		String regDate = request.getParameter("regDate");
		int age = Integer.valueOf(request.getParameter("age"));
		String content = request.getParameter("content");
		
		ModelAndView mav = new ModelAndView();
		if(!(password.equals(password2))) 
		{
			mav.setViewName("updateMemberForm.jsp");
			return mav;
		}
				
		memberdto.setId(id);
		memberdto.setPassword(password);
		memberdto.setEmail(email);
		memberdto.setTel(tel);
		memberdto.setAddr(addr);
		memberdto.setJob(job);
		memberdto.setRegDate(regDate);
		memberdto.setAge(age);
		memberdto.setContent(content);
		
		memberdao.updateMember(memberdto);
		
		mav.setViewName("redirect:index.jsp");
		return mav;
		
		
		
	}

}
