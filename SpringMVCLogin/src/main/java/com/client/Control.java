package com.client;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("userName") String userName, @RequestParam("password") String password) {

		String message;
		if (userName != null && !userName.equals("") && userName.equals("pradeep") && password != null
				&& !password.equals("") && password.equals("123")) {
			message = "Welcome " + userName + ".";
			return new ModelAndView("welcome", "message", message);
		} else {
			message = "your are entering wrong details.";
			return new ModelAndView("errorPage", "message", message);
		}
	}
} 
