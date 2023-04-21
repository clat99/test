package org.example.main;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
public class Program{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println( list.add(10));
		System.out.println( list.add(20));
		System.out.println( list.add(10));
		
		System.out.println();
		
		Set<Integer> set = new LinkedHashSet<>();
		System.out.println( set.add(50));
		System.out.println( set.add(60));
		System.out.println( set.add(50));
	}
	public static void main2(String[] args) {
		Deque<Integer> stk = new ArrayDeque<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		
		Integer element = null;
		while( !stk.isEmpty()) {
			element = stk.peek();
			System.out.println("Removed element is	:	"+element);
			stk.pop();
		}
	}
	public static void main1(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		
		Integer element = null;
		while( !stk.empty()) {
			element = stk.peek();
			System.out.println("Removed element is	:	"+element);
			stk.pop();
		}
	}
}
