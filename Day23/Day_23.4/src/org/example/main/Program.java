package org.example.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	private static void writeRecord(String pathName)throws Exception {
		byte bs = 123;
		try ( FileOutputStream outputStream = new FileOutputStream(new File(pathName));){
			outputStream.write(bs);
		}
	}
	private static void readRecord(String pathName)throws Exception {
		try(FileInputStream inputStream = new FileInputStream(new File(pathName));){
			byte bs =  (byte) inputStream.read();
			System.out.println("Value	:	"+bs);
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
