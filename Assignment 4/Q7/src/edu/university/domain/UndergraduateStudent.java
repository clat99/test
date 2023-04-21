package edu.university.domain;

import lombok.Getter;
import lombok.Setter;

public class UndergraduateStudent extends Student {
	
	@Getter @Setter int creditHours;
	@Getter @Setter double tuitionRate;
	
public UndergraduateStudent() {
		this("",0,"",0.0,0,0.0);
		}


	public UndergraduateStudent(String name, int id, String major, double gpa, int creditHours, double tuitionRate) {
		super(name, id, major, gpa);
		this.creditHours = creditHours;
		this.tuitionRate = tuitionRate;
	}


@Override
public void calculateTuition(){
	super.calculateTuition();
	
	tuitionRate = 500 * creditHours;
	
	if(gpa>=3.5) {
		tuitionRate = tuitionRate * (0.2*tuitionRate);
	}
	
		
}
}