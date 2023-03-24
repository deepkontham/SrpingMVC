package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ciq.pojo.Student;
import com.ciq.services.StudentServiceimpl;

@Controller
public class RestControl {
	
	
	@Autowired
	private StudentServiceimpl serviceImpl;
	
	
	@ResponseBody
	@GetMapping("/rest")
	public String loginpage() {
		return "restcontroller";
		
	}
	@ResponseBody
	@GetMapping("/Rgetall")
	public List<Student> getAll(){
		return serviceImpl.getAllstudends();
		
		
	}
	@ResponseBody
	@GetMapping("/byid/{id}")
	public Student getbyid(@PathVariable int id) {
		return serviceImpl.getbyid(id);
		
	}
	
	@ResponseBody
	@PostMapping("/saved")
	public void insert(@RequestBody Student student) {
		 serviceImpl.save(student);
		
	}
	@ResponseBody
	@GetMapping("/delt/{id}")
	public int delete(@PathVariable int id) {
		return serviceImpl.delete(id);
		
	}
	@ResponseBody
	@PostMapping("/upd")
	public int update(@RequestBody Student student) {
		return serviceImpl.update(student);
		
	}
	
	
	

}
