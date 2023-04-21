package org.sports.test;
import java.util.Scanner;

public class Menu {
	
static Scanner sc = new Scanner(System.in);
	public static int menuList(){
		
	System.out.println("0. EXIT");
	System.out.println("1. Add Player Details ");
	System.out.println("2. Calculate Score ");
	System.out.println("3. Print Team Record ");
	System.out.print("Enter choice: ");
			
	return sc.nextInt();	
	}

}
