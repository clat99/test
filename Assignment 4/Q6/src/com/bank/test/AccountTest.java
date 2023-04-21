package com.bank.test;
import com.bank.domain.*;
import java.util.Scanner;

public class AccountTest {
	
	Account [] arr = new Account[4];
	
	{
	arr[0] = new SavingsAccount();          //upcasting
	arr[1] = new CheckingAccount();
	arr[2] = new SavingsAccount();
	arr[3] = new CheckingAccount();
	}

	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		for(int index=0; index<arr.length; index++)
		{
			if(arr[index] != null)
			{
				System.out.println("Enter Account Number of user "+(index+1));
				arr[index].setAccountNumber(sc.nextLine());
				
				System.out.println("Enter balance of user "+(index+1));
				arr[index].setBalance(sc.nextDouble());
				sc.nextLine();

				if(arr[index] instanceof SavingsAccount) 
				{
				SavingsAccount save = (SavingsAccount) arr[index];
				System.out.println("Set interest rate: ");
				save.setInterestRate(sc.nextDouble());
				}
				
				//if(arr[index] instanceof CheckingAccount) {
					
				//CheckingAccount checking = 
					
				}
		}
		}
	}


