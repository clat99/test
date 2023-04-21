package com.bank.main;
import com.bank.test.*;

import java.util.Scanner;

	public class Program {

		static Scanner sc = new Scanner(System.in);
			public static int menuList(){
				
			System.out.println("0. EXIT");
			System.out.println("1. Add New Account ");
			System.out.println("2. Calculate Book Records");
			System.out.println("3. Print Book Records");
			System.out.print("Enter choice ");
					
			return sc.nextInt();	
			}

		public static void main(String[] args) {
								
			AccountTest test = new AccountTest();
			int choice;
			
			while((choice = Program.menuList()) != 0) {		
				switch(choice) {
						
				case 1: //Add records
					    test.acceptRecord();
						break;

				case 2: //Calculate total Price	
						//booktest.calculatePrice();
						break;
						
				case 3: //Print total records
						//booktest.printBookInfo();
						break;			
				}
			}
		}
	}


