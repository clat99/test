package org.example.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable{
	private String name;
	private int empid;
	private transient float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
}
public class Program {
	private static void writeRecord(String pathName)throws Exception {
		try ( ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream( new FileOutputStream(new File(pathName))))){
			Employee emp = new Employee("Sandeep", 3778, 45000.50f);
			outputStream.writeObject(emp);	//Serialization
		}
	}
	private static void readRecord(String pathName)throws Exception {
		try(ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream( new FileInputStream(new File(pathName))))){
			Employee emp = (Employee) inputStream.readObject();	//Deserialization
			System.out.println(emp.toString());
		}
	}
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		String pathName = "Sample.dat";
		while( ( choice = Program.menuList( ) ) != 0 ) {
			try {
				switch( choice ) {
				case 1:
					Program.writeRecord( pathName );
					break;
				case 2:
					Program.readRecord( pathName );
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
