package com.jspiders;

public class Employee {
	private String id;
	private String name;
	private int age;
	private Double salary;
	
	static int count= 101;
	
	public Employee(String name, int age, Double salary) {
		this.id="JSP"+count;
		this.name=name;
		this.age=age;
		this.salary=salary;
		count++;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(Double salary) {
		this.salary=salary;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Id is : "+id+" Name Is : "+name+", Age Is : "+age+", Salary Is : "+salary;
	}
	
}
