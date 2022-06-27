package com.computer.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface intCommand {
	
	int execute(HttpServletRequest request, HttpServletResponse response);

}
