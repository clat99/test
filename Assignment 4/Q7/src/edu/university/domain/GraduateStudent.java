package edu.university.domain;

import lombok.Getter;
import lombok.Setter;

public class GraduateStudent extends Student {
	
	@Getter @Setter double researchFee;
	@Getter @Setter double tuitionRate;
	@Getter @Setter double creditHour;

	public GraduateStudent() {
		this("",0,"",0.0,0,0.0,0.0);
		}


	public GraduateStudent(String name, int id, String major, double gpa, double researchFee, double tuitionRate, double creditHour) {
		super(name, id, major, gpa);
		this.researchFee = researchFee;
		this.tuitionRate = tuitionRate;
		this.creditHour = creditHour;
	}


@Override
public void calculateTuition(){
	super.calculateTuition();
	
	tuitionRate = 1000 * creditHour;
	
	if(researchFee>5000) {
		tuitionRate = tuitionRate - (0.1*tuitionRate);
	}
}
}