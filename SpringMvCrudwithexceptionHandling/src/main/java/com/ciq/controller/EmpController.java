package com.ciq.controller;

import java.sql.SQLException;
import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.Employee;
import com.ciq.Services.ServiceDao;
import com.ciq.Services.ServiceImpl;

@Controller
public class EmpController {
	@Autowired
	private ServiceImpl impl;

	@GetMapping("/all")
	public ModelAndView getall(Employee employee) {
//		String s="error";
//		if(s.equalsIgnoreCase("error")) {
//			throw new NullPointerException("null pointer exception occured");
//		}
		List<Employee> vp = impl.getEmployees();
		System.out.println(vp);
		return new ModelAndView("findall", "map", vp);

	}
//	@ExceptionHandler(value = NullPointerException.class)
//	public String nullpointerException() {
//		return "NullpointerException";
//		
//	}

	@GetMapping("/save")
	public String save(Employee employee) {
		return "register";

	}

	@PostMapping("/insert")
	public ModelAndView saved(@Valid Employee employee,BindingResult result) {
//		if(result.hasErrors()) {
//		return new ModelAndView("NullpointerException");
//		}
		impl.save(employee);
		ModelAndView m=new ModelAndView("redirect:all");
		return m;

	}
//	@ExceptionHandler(value = SQLException.class)
//	public String nullpointerException() {
//		return "NullpointerException";
//	
//	}
	
	@GetMapping("/delete")
	public String deleted(@RequestParam int id) {
		impl.delete(id);
		return "redirect:all";
 
	}

	@GetMapping("/up")
	public ModelAndView updated(@RequestParam int id) {
		Employee employ = impl.updategetbyid(id);

		return new ModelAndView("update", "dp", employ);

	}
    @PostMapping("/dt")
	public String update(Employee employee) {
		int update = impl.update(employee);
		System.out.println("updated");

		return "redirect:all";

	}

}
