package org.assignment.five.lib;
import org.assignment.five.domain.Book;

public class Library {

	static Book arr[] = new Book[5];
	
	public static Book[] getArray() {
		
		arr[0] = new Book("New World Order", "Shashi Tharoor", 2020 );
		arr[1] = new Book("The Selfish Gene", "Richard Dawkins", 1976);
		arr[2] = new Book("Sapiens", "Yuval Noah Harari", 2014);
		arr[3] = new Book("Digital Fortress", "Dan Brown", 1998);
		arr[4] = new Book("The Discovery of India", "Jawaharlal Nehru", 1946);
		
		return arr;
	}

	public static void printRecord(Book[] arr) {
	
		for(Book element : arr)
			System.out.println(element);
	}
	
}

	