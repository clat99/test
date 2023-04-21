package org.example.main;

import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Program{
	public static void main(String[] args){
		Vector<Integer> v = new Vector<>();
		for( int count = 1; count <= 10; ++ count )
			v.add(count);
		
		Integer element = null;
		Iterator<Integer> itr = v.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
			if( element == 10 )
				v.add(11);	//ConcurrentModificationException
		}
	}
	public static void main1(String[] args){
		Vector<Integer> v = new Vector<>();
		for( int count = 1; count <= 10; ++ count )
			v.add(count);
		
		Integer element = null;
		Enumeration<Integer> e = v.elements() ;
		while( e.hasMoreElements()) {
			element = e.nextElement();
			System.out.println(element);
			if( element == 10 )
				v.add(11);	//OK
		}
		System.out.println(v);
	}
}
