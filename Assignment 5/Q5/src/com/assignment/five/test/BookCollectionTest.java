package com.assignment.five.test;
import com.assignment.five.domain.BookCollection;

import java.util.Scanner;

public class BookCollectionTest {
static Scanner sc = new Scanner(System.in);
		
	public static BookCollection[] getArray() {
		
	BookCollection[] arr = new BookCollection[2];
	
	arr[0] = new BookCollection();
	arr[1] = new BookCollection();
//	arr[2] = new MenuItem();
//	arr[3] = new MenuItem();
//	arr[4] = new MenuItem();
	
	return arr;
	}
	
	public static void addBook(BookCollection[] arr) {
	
	if(arr != null) {
		for(BookCollection element : arr) {
			sc.nextLine();
						
			System.out.println("Enter Title: ");
			element.setTitle(sc.nextLine());
			
			System.out.println("Enter Author: ");
			element.setAuthor(sc.nextLine());
			
			System.out.println("Enter publication year: ");
			try {
				element.setPublicationYear(sc.nextInt());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.nextLine();
		
	}}}

	public static void getBooks(BookCollection[] arr) {		
		if(arr!=null) {
		for(BookCollection element : arr) {
			System.out.println(element);
		}	
		
		System.out.println();
		}
	}

	public static int menuList() {
		
		System.out.println("0. Exit ");
		System.out.println("1. Add Book ");
		System.out.println("2. Remove Book ");
		System.out.println("3. Get Book Record ");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}
}
