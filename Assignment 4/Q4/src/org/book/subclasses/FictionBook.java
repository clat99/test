package org.book.subclasses;
import org.book.domain.Book;


public class FictionBook extends Book {
	
	String genre;
	
	public FictionBook() {
		this("","","",0.0,0,"");
	}

	public FictionBook(String title, String author, String publisher, double price, int numPages, String genre) {
		super(title, author, publisher, price, numPages);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void calculatePrice() {
		super.calculatePrice();
		if(this.genre == "romance" || this.genre == "Romance")
			price = this.price - (0.10*price); 
	}
	

}
