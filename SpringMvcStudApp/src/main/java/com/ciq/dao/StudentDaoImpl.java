package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciq.pojo.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public void save(Student student) {
		String insert = "insert into student values(?,?,?,?)";
		Object[] per = { student.getId(), student.getName(),student.getDob(),student.getCity() };
		int i = jdbcTemplate.update(insert, per);

		System.out.println(i + "inserted successfully");

	
		
		

	}

	@Override
	public int update(Student student) {
		
		String update = "update student set name=?,dob=?,city=? where id=? ";
		Object[] ep = { student.getName(),student.getDob(), student.getCity(), student.getId() };
		int result = jdbcTemplate.update(update, ep);
		System.out.println(result);
		return result;

	}

	@Override
	public int delete(int id) {
		String delete="delete from student where id=?";
		Object[]d= {id};
		int d1 = jdbcTemplate.update(delete, d);
		System.out.println(d1);
		
		return d1;		
		
		
		
		

	}

	@Override
	public List<Student> getAllstudends() {
		List<Student>list =jdbcTemplate.query("select * from student",(RowMapper<Student>) (rs, rowNum) -> {
			Student s=new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setDob(rs.getString(3));
			s.setCity(rs.getString(4));
			
			return s;
		});
		return list;
		
		
	}

	@Override
	public Student getbyid(int id) {
		return	 jdbcTemplate.queryForObject("select*from Student where id=?",
				new BeanPropertyRowMapper<>(Student.class),	new Object[] {id});		}
	}

//	

