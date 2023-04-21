package org.book.main;


import org.book.test.BookTest;


public class Program {

	public static void main(String[] args) {
	
		
		BookTest booktest = new BookTest();						

		int choice;
		
		while((choice = Menu.menuList()) != 0) {		
			switch(choice) {
					
			case 1: //Add Book records
				    booktest.acceptRecord();
					break;

			case 2: //Calculate total Price	
					booktest.calculatePrice();
					break;
					
			case 3: //Print total records
					booktest.printBookInfo();
					break;			
			}
		}
	}
}
