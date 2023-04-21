package com.assignment.five.main;

import com.assignment.five.domain.*;
import com.assignment.five.test.BookCollectionTest;

public class Program {


	public static void main(String[] args) {
	
	int choice;
	while((choice = BookCollectionTest.menuList()) != 0) {
		
		BookCollection[] arr = BookCollectionTest.getArray();
		
		switch(choice) {
		case 1:   //Add book record
			BookCollectionTest.addBook(arr);
			break;
			
		case 2:   //Remove book record
			break;
			
		case 3: //print book record
			BookCollectionTest.getBooks(arr);		
			break;
	
	}}}
}
