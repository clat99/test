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
import java.util.Scanner;

public class Program {
	private static void writeRecord(String pathName)throws Exception {
		try ( DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream( new FileOutputStream(new File(pathName))))){
			outputStream.writeUTF("Sandeep");
			outputStream.writeInt(3778);
			outputStream.writeFloat(45000.50f);
		}
	}
	private static void readRecord(String pathName)throws Exception {
		try(DataInputStream inputStream = new DataInputStream(new BufferedInputStream( new FileInputStream(new File(pathName))))){
			String name = inputStream.readUTF();
			int empid = inputStream.readInt();
			float salary = inputStream.readFloat();
			System.out.println( name+"	"+empid+"	"+salary);
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
