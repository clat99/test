package org.example.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		System.out.println( list.getClass().getName());	//java.util.Arrays$ArrayList
		System.out.println( list );	//[10, 20, 30, 40, 50]
	}
	public static void main1(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		
		//Object[] arr = list.toArray();
		
		Integer[] arr = new Integer[ list.size() ];
		list.toArray(arr);
		
		System.out.println( Arrays.toString(arr));	//[50, 10, 30, 20, 40]
	}
}
