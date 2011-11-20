package com.iwebproject.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iwebproject.bean.User;
import com.iwebproject.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld(User user) {
		logger.info("helloWorld() method begin...");
		
		this.userService.create(user);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("helloWorld");
		mav.addObject("message", "Hello World!");
		
		logger.info("helloWorld() method end...");
		
		return mav;
	}
}
