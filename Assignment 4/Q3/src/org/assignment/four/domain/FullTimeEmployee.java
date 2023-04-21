package org.assignment.four.domain;

public class FullTimeEmployee extends Employee{
	
	double bonus;
	
	public FullTimeEmployee() {
		this("",0,0.0,0.0);
	}

	public FullTimeEmployee(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void calculatePay() {
		//this.salary = this.salary + (0.1 * this.salary);
		this.salary = this.bonus / 0.1;
	
	}

	//@Override
	//public String toString() {
		//return "FullTimeEmployee [bonus=" + bonus + "]";
	}
	


