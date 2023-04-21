package org.assignment.four.main;
import java.util.Scanner;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		
		System.out.println("0. Exit");
		System.out.println("1. Accept Record of employees");
		System.out.println("2. Calculate Salary of employees");
		System.out.println("3. Print PayRoll ");
		return sc.nextInt();
	}

}
