package com.computer.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface voidCommand {
	
	void execute(HttpServletRequest request, HttpServletResponse response);

}
