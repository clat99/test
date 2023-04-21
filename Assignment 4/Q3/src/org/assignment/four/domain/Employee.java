package org.assignment.four.domain;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	public Employee() {
		this("",0,0.0);
	}
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	public void calculatePay() {
		//TODO
	}
	
	@Override
	public String toString() {
		return String.format("%-20s%-10d%-10.2f", this.name, this.id, this.salary); 
	
	}

	
}
