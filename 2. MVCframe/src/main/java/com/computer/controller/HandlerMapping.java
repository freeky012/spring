package com.computer.controller;

import java.util.HashMap;
import java.util.Map;

import com.computer.member.Controller;
import com.computer.member.DetailController;
import com.computer.member.DropController;
import com.computer.member.JoinController;
import com.computer.member.ListController;
import com.computer.member.LoginController;
import com.computer.member.LogoutController;
import com.computer.member.UpdateController;

public class HandlerMapping {
	
	private Map<String, Controller> mappings;
	
	public HandlerMapping()
	{
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/listMember.do", new ListController());
		mappings.put("/detailMember.do", new DetailController());
		mappings.put("/joinMember.do", new JoinController());
		mappings.put("/updateMember.do", new UpdateController());
		mappings.put("/dropMemeber.do", new DropController());
		mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path)
	{
		return mappings.get(path);
	}
}
