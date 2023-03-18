package com.ciq.services;

import java.util.List;

import com.ciq.pojo.Student;

public interface StudentService {
	void save(Student student);
	int update(Student student);
	int delete(int id);
	List<Student> getAllstudends();
	Student getbyid(int id);


}
