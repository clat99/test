package edu.university.main;

import java.util.Scanner;

public class Menu {
	
static Scanner sc = new Scanner(System.in);
	public static int menuList(){
	
	System.out.println("1. Add Student Details ");
	System.out.println("2. Calculate total tuition");
	System.out.println("3. Print total tuition of University");
	System.out.println("4. EXIT");
	System.out.print("Enter choice: ");
			
	return sc.nextInt();	
	}

}