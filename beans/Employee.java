package com.org.beans;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String dep;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDep(String dep) {
		this.dep = dep;
	}
	public void display() {
		System.out.print("|	");
		System.out.print(id);
		System.out.print("	|	");
		System.out.print(name);
		System.out.print("	|	");
		System.out.print(age);
		System.out.print("	|	");
		System.out.print(dep);
		System.out.print("	|	");
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------");
	}
}
