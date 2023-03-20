package com.ciq.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Employee;
import com.ciq.dao.EmployeeDaoimpl;

@Service
public class ServiceImpl implements ServiceDao{
	@Autowired
	private EmployeeDaoimpl daoimpl;
	

	@Override
	public void save(Employee employee) {
		daoimpl.save(employee);
		
		
	}

	@Override
	public int delete(int id) {
		return daoimpl.delete(id);
	}

	@Override
	public int update(Employee employee) {
		return daoimpl.update(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return daoimpl.getEmployees();
	}

	@Override
	public Employee updategetbyid(int id) {
		return daoimpl.updategetbyid(id);
	}

}
