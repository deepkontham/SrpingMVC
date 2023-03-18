package com.ciq.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.catalina.tribes.membership.McastServiceImpl;
import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.pojo.Student;
import com.ciq.services.StudentServiceimpl;
@Controller
public class StudController {
	   
	@Autowired
	private StudentServiceimpl serviceImpl;
	
	@RequestMapping(value="/add",method = RequestMethod.GET)

	public String add() {
		return "insert";
	}
	
	@GetMapping("/all")
	public ModelAndView getAll() {
		List<Student> list=serviceImpl.getAllstudends();
		System.out.println(list);
		return new ModelAndView("findall", "map",list);
	}
	     @GetMapping("/save")
		public String save() {
			return "insert";
			
			
		}
	     @PostMapping("/jk")
	     public String get(Student student) {
	    	 serviceImpl.save(student);
			return "redirect:all";
	     }
	     
	     //for updating 
	     @GetMapping("/updatePage")
	     public ModelAndView getbyid(@RequestParam int id) {
	    	 Student s=serviceImpl.getbyid(id);
			return new ModelAndView("Update", "stu", s);
	    	 
	     }
		  
		@PostMapping("/update")
		public String update( Student student) {
			serviceImpl.update(student);
			return "redirect:all";
			
		}
		@GetMapping("/delete")
		public String delete(@RequestParam int id) {
			serviceImpl.delete(id);   
			return "redirect:all";
			
		}

		
	}


