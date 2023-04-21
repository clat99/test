package org.example.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	private static void writeRecord(String pathName)throws Exception {
		try ( FileOutputStream outputStream = new FileOutputStream(new File(pathName));){
			for( char ch = 'A'; ch <= 'Z'; ++ ch )
				outputStream.write(ch);	
		}
	}
	private static void readRecord(String pathName)throws Exception {
		try(FileInputStream inputStream = new FileInputStream(new File(pathName));){
			int data;
			while( ( data = inputStream.read( ) ) != -1 )
				System.out.print((char)data+" ");
			System.out.println();
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
