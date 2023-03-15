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

	@RequestMapping(value = "/adds",method = RequestMethod.GET)
    public ModelAndView addlogic(@RequestParam("txtnum1") int a,@RequestParam("txtnum2") int c)
    {
        return new ModelAndView("welcome","result", a+c);
        
    	}

}
