package com.assignment.five.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter 
public class BookCollection {
	
	private String title;
	private String author;
	private int publicationYear;
	
	@Override
	public String toString() {
		return "Title: [title], Author: [author], Year: [publicationYear]";
	}
	
	
	

}
