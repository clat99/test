package org.example.main;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program{
	public static void main(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);
		que.offer(50);	//OK
		//que.offer(null);	//Not Allowed
		
		Integer element = null;
		while( !que.isEmpty() ) {
			element = que.peek();
			System.out.println("Removed element is	:	"+element);
			que.poll();
		}
	}
	public static void main1(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		//que.add(null);	//Not Allowed
		
		Integer element = null;
		while( !que.isEmpty() ) {
			element = que.element();
			System.out.println("Removed element is	:	"+element);
			que.remove();
		}
	}
}
