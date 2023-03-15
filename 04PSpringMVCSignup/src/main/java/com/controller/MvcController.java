package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	@RequestMapping(value="/signup" , method=RequestMethod.GET)
	public ModelAndView signup() {
		
		ModelAndView model=new ModelAndView("jithu");
		return model;
		
	}
	
    @RequestMapping(value =  "/signup",method = RequestMethod.POST)
	public ModelAndView login(String Firstname, String Lastname, String emailid, String username, String password) {
		
    	String data="Firstname:"+Firstname+"Lastname:"+Lastname+"emailid :"+emailid+"username:"+username+"password:"+password;
		return new ModelAndView("signup","msg",data);
}
}
