package org.example.main;
public class Program {
	public static int hashCode( int element ) {
		int prime = 31;
		int result = 17;
		result = result * prime + element;
		return result;
	}
	public static void main(String[] args) {
		int empid = 42;
		int hashCode = Program.hashCode(empid);
		int slot = hashCode % 7;
		System.out.println("Empid	:	"+empid);
		System.out.println("HashCode	:	"+hashCode);
		System.out.println("slot	:	"+slot);
		
		int empid2 = 14;
		int hashCode2 = Program.hashCode(empid2);
		int slot2 = hashCode2 % 7;
		System.out.println("Empid	:	"+empid2);
		System.out.println("HashCode	:	"+hashCode2);
		System.out.println("slot	:	"+slot2);
		
	}
	public static void main2(String[] args) {
		for( int count = 1; count <= 100; ++ count ) {
			int data = count;
			int hashCode = Program.hashCode(data);
			int slot = hashCode % 7;
			System.out.println( data+"	"+hashCode+"	"+slot);
		}
	}
	public static void main1(String[] args) {
		int empid = 3758;
		int hashCode = Program.hashCode(empid);
		int slot = hashCode % 7;
		System.out.println("Empid	:	"+empid);
		System.out.println("HashCode	:	"+hashCode);
		System.out.println("slot	:	"+slot);
	}
}
