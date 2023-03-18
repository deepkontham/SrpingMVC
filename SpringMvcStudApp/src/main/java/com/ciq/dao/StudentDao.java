package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Student;

public interface StudentDao {
	void save(Student student);
	int update(Student student);
	int delete(int id);
	List<Student> getAllstudends();
	//For updating 
	Student getbyid(int id);

}
