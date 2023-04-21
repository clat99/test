package org.book.test;
import org.book.domain.Book;
import org.book.subclasses.*;

import java.util.Scanner;

public class BookTest {
	static Scanner sc = new Scanner(System.in);
	
	Book arr[] = new Book[6];
	
	{
	arr[0] = new FictionBook();
	arr[1] = new NonFictionBook();
	arr[2] = new ReferenceBook();
	arr[3] = new FictionBook();
	arr[4] = new NonFictionBook();
	arr[5] = new ReferenceBook();
	}
	
	public void acceptRecord() {
		
		for(int index=0; index<arr.length; index++)
		{
			if(arr[index] != null); {
				System.out.println("Enter Book title: ");
				arr[index].setTitle(sc.nextLine());
				sc.nextLine();
				
				System.out.println("Enter Book Author ");
				arr[index].setAuthor(sc.nextLine());
				
				System.out.println("Enter Publisher ");
				arr[index].setPublisher(sc.nextLine());
				
				System.out.println("Enter price: ");
				arr[index].setPrice(sc.nextDouble());
				
				System.out.println("Enter No. of Pages: ");
				arr[index].setNumPages(sc.nextInt());
				
				if(arr[index] instanceof FictionBook)
				 {
					FictionBook fiction = (FictionBook) arr[index];
					System.out.println("Enter Genre: ");
					fiction.setGenre(sc.nextLine());
					
				 }
				
				else if (arr[index] instanceof NonFictionBook)
				{
					NonFictionBook nonfiction = (NonFictionBook) arr[index];
					System.out.println("Enter Subject: ");
					nonfiction.setSubject(sc.nextLine());
				}
				
				else if (arr[index] instanceof ReferenceBook)
				{
					ReferenceBook reference = (ReferenceBook) arr[index];
					System.out.println("Enter Edition");
					reference.setEdition(sc.nextInt());
				}
			}
		}
	}
	
	public void calculatePrice() {
		for(int index=0; index<arr.length; index++)
		{
			arr[index].calculatePrice();
			System.out.println(arr[index].getPrice());
		}
	}
	
	public void printBookInfo() {
		for(int index=0; index<arr.length; index++)
			System.out.println(arr[index].toString());
	}
	
}