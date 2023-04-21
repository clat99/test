package edu.university.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public @NoArgsConstructor @AllArgsConstructor class Student {
	
	@Getter @Setter String name;
	@Getter @Setter int id;
	@Getter @Setter String major;
	@Getter @Setter double gpa;
	//@Getter @Setter double tuition;
	
public void calculateTuition() {
	}


}
