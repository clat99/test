package org.assignment.four;

import java.util.Scanner;
import java.time.LocalDate;

public class Q1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int choice;
	
	while ((choice = HospitalManager.menuList() )!= 5) {
		
		switch (choice) {
		
		case 1 : HospitalManager.addPatientRecord();
				 break;
				 
		case 2 : HospitalManager.addMedicalRecord(); 
			 	 break;
			 
		case 3 : HospitalManager.getPatientRecord();
			 break;
			 
		case 4 :
			 break;
		}
	}
	
	

	}

}
