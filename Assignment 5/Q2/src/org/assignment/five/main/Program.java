package org.assignment.five.main;
import org.assignment.five.lib.Library;

import java.util.Arrays;

import org.assignment.five.domain.Book;

public class Program {
	public static void main(String[] args) {
		
	Book[] arr = Library.getArray();
	
	Arrays.sort(arr);
		
	Library.printRecord(arr);
		
	}

}
