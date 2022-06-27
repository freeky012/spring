package com.computer.member;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;



@Controller
public class DetailController {

	@RequestMapping("detailMember.do")
	public ModelAndView handleRequest(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		memberDAO memberdao = new memberDAO();
		memberDTO memberdto = new memberDTO();
		
		memberdto = memberdao.detailMember(id);
		
		request.setAttribute("memberdto", memberdto);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp?pageinfo=/detailMember.jsp");
		return mav;
			
	}

}
