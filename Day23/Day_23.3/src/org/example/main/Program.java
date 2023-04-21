package org.example.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	private static void writeRecord(String pathName) {
		byte bs = 123;
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File(pathName));
			outputStream.write(bs);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void readRecord(String pathName) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(pathName));
			byte bs =  (byte) inputStream.read();
			System.out.println("Value	:	"+bs);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			switch( choice ) {
			case 1:
				Program.writeRecord( pathName );
				break;
			case 2:
				Program.readRecord( pathName );
				break;
			}
		}
	}
}
