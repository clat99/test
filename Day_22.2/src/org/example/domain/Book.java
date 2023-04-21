package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Book implements Comparable<Book>{
	private int id;
	private String name;
	private String author;
	private String publisher;
	private float price;
	@Override
	public int compareTo(Book other) {
		return this.id - other.id;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-45s%-20s%-30s%-8.2f", this.id, this.name, this.author, this.publisher, this.price);
	}
}
