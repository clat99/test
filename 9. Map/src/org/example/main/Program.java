package org.example.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program {
	private static Map<Integer, String> getMap() {
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "DAC");
		map.put(2, "DMC");
		map.put(3, "DESD");
		map.put(4, "DBDA");
		map.put(5, "DIVESD");
		return map;
	}
	private static void printAndCountEntries(Map<Integer, String> map) {
		System.out.println("Entries Count	:	"+map.size());
	}
	private static void printKeys(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.print(key+"	");
		}
		System.out.println();
	}
	private static void printValues(Map<Integer, String> map) {
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.print(value+"	");
		}
		System.out.println();
	}
	private static void printEntries(Map<Integer, String> map) {
		 Set<Entry<Integer, String>> entries = map.entrySet();
		 for (Entry<Integer, String> entry : entries) 	{
			System.out.println(entry.getKey()+"	"+entry.getValue());
		}
	}
	private static void printEntry(Map<Integer, String> map, int id) {
		Integer key = new Integer(id);
		if( map.containsKey(key)) {
			String value = map.get(key);
			System.out.println( key+"	"+value);
		}else
			System.out.println(key+" not found");
	}
	private static void removeEntry(Map<Integer, String> map, int id) {
		Integer key = new Integer(id);
		if( map.containsKey(key)) {
			String value = map.remove(key);
			System.out.println( key+"	"+value+" is removed");
		}else
			System.out.println(key+" not found");
	}
	public static void main(String[] args) {	
		Map<Integer, String> map = Program.getMap( );
		//Program.printAndCountEntries( map );
		//Program.printKeys( map );
		//Program.printValues( map );
		//Program.printEntries( map );
		//Program.printEntry( map, 3 );
		//Program.removeEntry( map, 3 );
		
		List<String> list = new ArrayList<>(map.values());
		System.out.println(list);
	}
}
