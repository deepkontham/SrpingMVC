package com.ciq.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.Employee;

import cm.ciq.Queries.Queries;

@Repository
public class EmployeeDaoimpl implements EmpolyeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Employee employee) {
		int insert=0;
		Object[] s = { employee.getId(), employee.getName(), employee.getDob(), employee.getCity() };
		if(employee.getId()!=0) {
		insert = jdbcTemplate.update(Queries.INSERT_QUERY, s);
		}else {
			throw new IllegalArgumentException("person not found");
		}
		System.out.println(insert + "Inserted Employee");

	}

	@Override
	public int delete(int id) {
		Object[] d = { id };
		int delete = jdbcTemplate.update(Queries.DELETE_QUERY, d);

		return delete;
	}

	@Override
	public int update(Employee employee) {
		Object[]e= {employee.getName(),employee.getDob(),employee.getCity(),employee.getId()};
		int update = jdbcTemplate.update(Queries.UPDATE_QUERY,e);
		return update;		}
	

	@Override
	public List<Employee> getEmployees() {
		List<Employee> list = jdbcTemplate.query(Queries.Retrive_All, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDob(rs.getDate(3));
				e.setCity(rs.getString(4));
				return e;
			}
		});
		return list;

	}

	@Override
	public Employee updategetbyid(int id) {

		return jdbcTemplate.queryForObject(Queries.updategetby_id, new BeanPropertyRowMapper<>(Employee.class),
				new Object[] { id });
	}

}
