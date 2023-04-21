package org.example.main;

class Employee{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = result * prime + this.empid;
		return result;
	}
}
public class Program {
	public static void main(String[] args) {
		Employee e1 = new Employee("Sandeep", 3778, 45000.50f );
		Employee e2 = new Employee("Sandeep", 3778, 45000.50f );
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
