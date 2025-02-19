package com.org.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.org.beans.Employee;

@Configurable
public class javaConfigureEmp {
	
	@Bean
	public Employee emp1() {
		Employee e = new Employee();
		e.setId(1);
		e.setName("sahil");
		e.setAge(20);
		e.setDep("IT");
		return e;
	}
	@Bean
	public Employee emp2() {
		Employee e = new Employee();
		e.setId(2);
		e.setName("nayan");
		e.setAge(20);
		e.setDep("IT");
		return e;
	}
	@Bean
	public Employee emp3() {
		Employee e = new Employee();
		e.setId(3);
		e.setName("vishal");
		e.setAge(100);
		e.setDep("IT");
		return e;
	}
}
