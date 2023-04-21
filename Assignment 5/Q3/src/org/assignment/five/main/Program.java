package org.assignment.five.main;
import java.util.Arrays;
import java.util.Comparator;

import org.assignment.five.domain.Product;
import org.assignment.five.test.ProductTest;

public class Program {

	public static void main(String[] args) {
	
	Product[] arr = ProductTest.getArray();	
	
	ProductTest test = new ProductTest();
	test.acceptRecord(arr);
	
	System.out.println("Unsorted array based on input is: ");
	test.printRecord(arr);
	
	Comparator<Product> comparator = null;
	comparator = new PriceComparator();
	Arrays.sort(arr, comparator);
	
	System.out.println("Sorted array is: ");
	test.printRecord(arr);
	}

}
