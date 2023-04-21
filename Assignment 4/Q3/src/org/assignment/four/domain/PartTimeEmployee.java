package org.assignment.four.domain;

public class PartTimeEmployee extends Employee {
	
	int hoursWorked;
	double hourlyRate;
	
	public PartTimeEmployee() {
		this("",0,0.0,0,0.0);
	}
	
	public PartTimeEmployee(String name, int id, double salary, int hoursWorked, double hourlyRate) {
		
		super(name, id, salary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public void calculatePay() {
		
		if(this.hoursWorked > 40)
			this.salary = (this.hoursWorked * this.hourlyRate) + 0.2*(this.hoursWorked * this.hourlyRate);
			
		else
			this.salary = this.hoursWorked * this.hourlyRate;
			
	}
	
	

}
