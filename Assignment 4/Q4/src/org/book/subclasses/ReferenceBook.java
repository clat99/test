package org.book.subclasses;

import org.book.domain.Book;

public class ReferenceBook extends Book{

	int edition;
	
	public ReferenceBook() {
		this("","","",0.0,0,0);
	}

	public ReferenceBook(String title, String author, String publisher, double price, int numPages, int edition) {
		super(title, author, publisher, price, numPages);
		this.edition = edition;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	@Override
	public void calculatePrice() {
		if (edition<5)
			this.price = this.price - (0.2*price);
		
	}
	
}
