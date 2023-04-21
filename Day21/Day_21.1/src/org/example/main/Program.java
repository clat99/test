package org.example.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static List<Integer> getList( ){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		return list;
	}
	//Object[] elementData;
	private static int capacity(List<Integer> list) throws Exception{
		Class<?> c = list.getClass();
		Field field = c.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[]) field.get(list);
		return elementData.length;
	}
	public static void main(String[] args) {
		try {
			List<Integer> list = Program.getList();
			System.out.println("Size		:	"+list.size());	//5
			
			int capacity = Program.capacity( list );
			System.out.println("Capacity	:	"+capacity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main10(String[] args) {
		List<Integer> list = Program.getList();
		ListIterator<Integer> itr = list.listIterator();
		Integer element = null;
		while( itr.hasNext()) {
			element = itr.next();
			System.out.print( element+"	");
		}
		System.out.println();
		while( itr.hasPrevious()) {
			element = itr.previous();
			System.out.print( element+"	");
		}
	}
	public static void main9(String[] args) {
		List<Integer> list = Program.getList();
		/* Consumer<Integer> action = System.out::println;
		list.forEach(action); */ 
		list.forEach( System.out::println );
	}
	public static void main8(String[] args) {
		List<Integer> list = Program.getList();
		/* Consumer<Integer> action = ( element )-> System.out.println( element );
		list.forEach(action); */
		list.forEach( element -> System.out.println( element ) );
	}
	public static void main7(String[] args) {
		List<Integer> list = Program.getList();
		for( Integer element : list )
			System.out.println( element );
	}
	public static void main6(String[] args) {
		List<Integer> list = Program.getList();
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main5(String[] args) {
		int[] arr = new int[ ] { 10, 20, 30 };
		//int element = arr[ arr.length ];	//ArrayIndexOutOfBoundsException
		
		String str = "CDAC";
		//char ch = str.charAt(str.length());	//StringIndexOutOfBoundsException
		
		List<Integer> list = Program.getList();
		Integer element = list.get( list.size() );	//IndexOutOfBoundsException
	}
	public static void main4(String[] args) {
		List<Integer> list = Program.getList();
		Integer element = null;
		for( int index = 0; index < list.size(); ++ index ) {
			element = list.get( index );
			System.out.println(element);
		}
	}
	public static void main3(String[] args) {
		List<Integer> list = Program.getList();
		System.out.println( list.toString());
	}
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(2, 30);
		System.out.println( list.toString());
	}
	public static void main1(String[] args){
		Collection<Integer> collection = new ArrayList<>();	//OK: Upcasting
		List<Integer> list = new ArrayList<>();	//OK: Upcasting
		ArrayList<Integer> arrayList = new ArrayList<>();	//OK
	}
}
