package com.ciq.dao;

import java.util.List;

import com.ciq.Employee;

public interface EmpolyeeDao {
	void save(Employee employee);
	int delete (int id);
	int update(Employee employee);
	List<Employee> getEmployees();
	Employee updategetbyid(int id);
}
