package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.StudentDaoImpl;
import com.ciq.services.StudentServiceimpl;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("deep.xml");
		 StudentServiceimpl bean = c.getBean(StudentServiceimpl.class);
		System.out.println(bean.getAllstudends());
		
	}

}
