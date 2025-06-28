package com.jlcindia.bookstore.servlet;

import javax.servlet.http.HttpServlet;

import com.jlcindia.bookstore.service.UserService;
import com.jlcindia.bookstore.service.UserServiceImpl;

public class JLCBaseServlet extends HttpServlet{

	
	public static UserService userService;
	
	static {
		userService=new UserServiceImpl();
	}
}
