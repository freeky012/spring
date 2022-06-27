package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import VO.bbsVO;
import service.bbsService;

@Controller
public class bbsController {
	
	private final bbsService bbsservice;

	@Autowired
	public bbsController(bbsService bbsservice) {
		this.bbsservice = bbsservice;
	}
	
	
	////////////////// 리스트 /////////////////////
	@RequestMapping("/bbsList")
	public String bbsList(Model model)
	{
		ArrayList<bbsVO> list = bbsservice.bbsList();
		
		model.addAttribute("list", list);		
		
		return "bbs/bbsList";
	}
	
	//////////////////글쓰기////////////////////////
	@RequestMapping("/bbsInsert")
	public String bbsInsert()
	{
		return "bbs/bbsInsert";
	}
	
	@RequestMapping("/bbsInsertPro")
	public String bbsInsertPro(bbsVO bvo, MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException
	{
		
		
		if(!file.isEmpty())
		{
			String uploadFolder ="/resources/images";
			String path = request.getSession().getServletContext().getRealPath(uploadFolder); 
			String uuid = UUID.randomUUID().toString();
			String fileName = uuid + "_" + file.getOriginalFilename();
			file.transferTo(new File(path, fileName));
			bvo.setPhoto(fileName);
		}
		bbsservice.bbsInsert(bvo);
		return "redirect:bbsList";
	}
	
	/////////////////글수정////////////////////////
	
	@RequestMapping("/bbsUpdate")
	public String bbsUpdate(int bbsNo, Model model)
	{
		model.addAttribute("bvo", bbsservice.bbsOneList(bbsNo));
		return "bbs/bbsUpdate";
	}
	
	@RequestMapping("/bbsUpdatePro")
	public String bbsUpdatePro(bbsVO bvo)
	{		
		bbsservice.bbsUpdate(bvo);
		return "redirect:bbsList";
	}
	
	//////////////////글삭제////////////////////
	
	@RequestMapping("/bbsDeletePro")
	public String bbsDeletePro(int bbsNo)
	{
		bbsservice.bbsDelete(bbsNo);
		return "redirect:bbsList";
	}

}
