package com.computer.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.computer.DAO.memberDAO;
import com.computer.DTO.memberDTO;

public class modelJoinMember implements intCommand{

	@Override
	public int execute(HttpServletRequest request, HttpServletResponse response) {
		
		memberDAO memberdao = new memberDAO();
		memberDTO memberdto = new memberDTO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		String job = request.getParameter("job");
		String regDate = request.getParameter("regDate");
		int age = Integer.valueOf(request.getParameter("age"));
		String content = request.getParameter("content");
		
		if(!(password.equals(password2))) 
		{
			request.setAttribute("result", 0);
			return 0;
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
		
		
		int result = memberdao.joinMember(memberdto);
		request.setAttribute("result", result);
		return result;
		
	
	
	}
	

}
