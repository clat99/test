package org.assignment.five.test;
import org.assignment.five.domain.MenuItem;

import java.util.Scanner;

public class MenuItemTest {
static Scanner sc = new Scanner(System.in);
		
	public static MenuItem[] getArray() {
		
	MenuItem[] arr = new MenuItem[5];
	
	arr[0] = new MenuItem();
	arr[1] = new MenuItem();
	arr[2] = new MenuItem();
	arr[3] = new MenuItem();
	arr[4] = new MenuItem();
	
	return arr;
	}
	
	public static void acceptRecord(MenuItem[] arr) {
	
	if(arr != null) {
		for(MenuItem element : arr) {
			
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			element.setName(sc.nextLine());
			
			System.out.println("Enter price: ");
			try {
				element.setPrice(sc.nextDouble());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.nextLine();
			
			System.out.println("Enter calories: ");
			try {
				element.setCalories(sc.nextInt());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.nextLine();
		
	}}}

	public static void printRecord(MenuItem[] arr) {		
		if(arr!=null) {
		for(MenuItem element : arr) {
			System.out.println(element);
		}	
		
		System.out.println();
		}
	}

	public static int menuList() {
		
		System.out.println("0. Exit ");
		System.out.println("1. Sort by name: ");
		System.out.println("2. Sort by price: ");
		System.out.println("3. Sort by calories: ");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}
}
