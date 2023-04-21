package org.assignment.five.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.lang.Comparable; 

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Book implements Comparable<Book> {
	
	private String title;
	private String author;
	private int publicationYear;
	
	@Override
	public int compareTo(Book other) {
		if(this.publicationYear < other.publicationYear)
			return +1;
		if(this.publicationYear > other.publicationYear)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return String.format("%-25s%-20s%-10d", this.title, this.author, this.publicationYear);
	}
	
	

}
