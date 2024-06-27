package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/verify")
	public ModelAndView abc(String uname, String pwd) {
		ModelAndView mv = new ModelAndView();
		if(uname.equals(pwd)) {
			mv.addObject("user", uname);
			mv.setViewName("welcome.jsp");
		}
		else {
			mv.setViewName("invalid.jsp");
		}
		return mv;
	}
}
