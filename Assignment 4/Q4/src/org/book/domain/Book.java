package org.book.domain;

public class Book {
	
	public String title;
	protected String author;
	protected String publisher;
	protected double price;
	protected int numPages;
	
	public Book() {
		this("","","",0.0,0);
	}
		
	public Book(String title, String author, String publisher, double price, int numPages) {
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.numPages = numPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-10.2f%-10d", this.title, this.author, this.publisher, this.price, this.numPages);
	}

	public void calculatePrice(){ 
	
		this.price = this.price*this.numPages;
	}

}
