package org.book.subclasses;

import org.book.domain.Book;

public class NonFictionBook extends Book{

	String subject;
	
	public NonFictionBook() {
		this("","","",0.0,0,"");
	}

	public NonFictionBook(String title, String author, String publisher, double price, int numPages, String subject) {
		super(title, author, publisher, price, numPages);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void calculatePrice() {
	if(subject=="history" || subject=="History")
		this.price = this.price - (0.15*price);
	}
	
}