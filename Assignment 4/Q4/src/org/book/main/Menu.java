package org.book.main;
import java.util.Scanner;

public class Menu {
	
static Scanner sc = new Scanner(System.in);
	public static int menuList(){
		
	System.out.println("0. EXIT");
	System.out.println("1. Add Book Records ");
	System.out.println("2. Calculate Book Records");
	System.out.println("3. Print Book Records");
	System.out.print("Enter choice");
			
	return sc.nextInt();	
	}

}
