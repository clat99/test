package org.assignment.five.test;
import org.assignment.five.domain.Product;

import java.util.Scanner;

public class ProductTest {
static Scanner sc = new Scanner(System.in);
		
	public static Product[] getArray() {
		
	Product[] arr = new Product[5];
	
	arr[0] = new Product();
	arr[1] = new Product();
	arr[2] = new Product();
	arr[3] = new Product();
	arr[4] = new Product();
	
	return arr;
	}
	
	public void acceptRecord(Product[] arr) {
	
	if(arr != null) {
		for(Product element : arr) {
			
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
			
			System.out.println("Enter category: ");
			element.setCategory(sc.nextLine());
		
	}}}

	public void printRecord(Product[] arr) {		
		if(arr!=null) {
		for(Product element : arr) {
			System.out.println(element);
		}	
		
		System.out.println();
		}
	}
}
