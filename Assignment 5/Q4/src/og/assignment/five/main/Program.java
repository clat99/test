package og.assignment.five.main;

import java.util.Arrays;
import java.util.Comparator;

import org.assignment.five.domain.*;
import org.assignment.five.test.MenuItemTest;

public class Program {


	public static void main(String[] args) {
	
	int choice;
	while((choice = MenuItemTest.menuList()) != 0) {
		
		Comparator<MenuItem> comparator = null;	
		MenuItem[] arr = MenuItemTest.getArray();
		MenuItemTest.acceptRecord(arr);
		System.out.println("Sorted array: ");
			
		switch(choice) {
		case 1:   //Sort by name
			comparator = new NameComparator();
			break;
			
		case 2:   //Sort by price
			comparator = new PriceComparator();
			break;
			
		case 3: //Sort by calories
			comparator = new CalorieComparator();
			break;
	
		}
		Arrays.sort(arr, comparator);
		MenuItemTest.printRecord(arr);		
		
		}
	}
}
