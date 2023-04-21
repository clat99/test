package org.example.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		
		System.out.println(list);	//[50, 10, 30, 20, 40]
		//Collections.sort( list );
		list.sort(null);
		System.out.println(list);	//[10, 20, 30, 40, 50]
		
	}
	public static List<Integer> getList( ){
		List<Integer> list = new ArrayList<>();
		for( int count = 1; count <= 10; ++ count  )
			list.add( count * 10 );
		return list;
	}
	public static void main5(String[] args) {
		List<Integer> list = Program.getList();	//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		Integer key = new Integer(50);
		if( list.contains(key)) {
			//list.remove(key);
			int index = list.indexOf(key);
			list.remove(index);
			System.out.println( list );	//[10, 20, 30, 40, 60, 70, 80, 90, 100]
		}else
			System.out.println(key+" not found.");
	}
	public static void main4(String[] args) {
		List<Integer> list = Program.getList();	//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		Collection<Integer> keys = new ArrayList<>( );
		keys.add(30);
		keys.add(50);
		keys.add(70);
		if( list.containsAll(keys)) {
			list.removeAll(keys);	//[10, 20, 40, 60, 80, 90, 100]
			//list.retainAll(keys);	//[30, 50, 70]
			System.out.println( list );	
		}else
			System.out.println(keys+" not found.");
	}
	public static void main3(String[] args) {
		List<Integer> list = Program.getList();	//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		Integer key = new Integer(500);
		if( list.contains(key)) {
			int index = list.indexOf(key);
			System.out.println( key+" found at index : "+index);
		}else
			System.out.println(key+" not found.");
	}
	public static void main2(String[] args) {
		Collection<Integer> collection = new ArrayList<>();	
		collection.add(30);
		collection.add(40);
		collection.add(50);
		
		List<Integer> list = new ArrayList<>(  );	
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(70);
		list.addAll(2, collection);
		System.out.println(list);
	}
	public static void main1(String[] args){
		Collection<Integer> collection = new ArrayList<>();	
		collection.add(30);
		collection.add(40);
		collection.add(50);
		
		//List<Integer> list = new ArrayList<>( collection );	//OK
		List<Integer> list = new ArrayList<>(  );	
		list.add(10);
		list.add(20);
		list.addAll(collection);
		System.out.println(list);
	}
}
