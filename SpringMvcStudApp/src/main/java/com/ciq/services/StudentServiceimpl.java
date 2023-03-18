package com.ciq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.StudentDaoImpl;
import com.ciq.pojo.Student;
import com.mysql.cj.util.DnsSrv.SrvRecord;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	private StudentDaoImpl serviceimpl;
	

	@Override
	public void save(Student student) {
		 serviceimpl.save(student);
	}

	@Override
	public int update(Student student) {
		return serviceimpl.update(student);
	}

	@Override
	public int delete(int id) {
		return serviceimpl.delete(id);
	}

	@Override
	public List<Student> getAllstudends() {
		// TODO Auto-generated method stub
		return serviceimpl.getAllstudends();
	}

	@Override
	public Student getbyid(int id) {
		return serviceimpl.getbyid(id);
	}

}
