package org.assignment.four;

import java.util.Scanner;

public class HospitalManager {

static Scanner sc = new Scanner(System.in);
	
public static int menuList() {
	
	System.out.println("1. Add Patient Record");
	System.out.println("2. Add Medical Record");
	System.out.println("3. Get Patient Record");
	System.out.println("4. Get Medical Record");
	System.out.println("5. Exit ");
	System.out.print("Enter your choice :" );
	
	return sc.nextInt();
}

public static void addPatientRecord() {
	 Patient patient = new Patient();

	 System.out.println("Enter patient name: ");
	 patient.setName(sc.nextLine());
	 patient.setName(sc.nextLine());
	 System.out.println("Enter patient age: ");
	 patient.setAge(sc.nextInt());
	 System.out.println("Enter patient gender: ");
	 patient.setGender(sc.nextLine());
	 patient.setGender(sc.nextLine());
	 System.out.println("Enter patient address: ");
	 patient.setAddress(sc.nextLine());	
}

public static void addMedicalRecord() {
	System.out.println("Enter today's date: ");
	// LocalDate ld = LocalDate.now();
	 MedicalRecord medical = new MedicalRecord();
	// medical.setDate(sc.nextLine());
	 System.out.println("Enter doctor's name: ");
	 medical.setDoctorName(sc.nextLine());
	 System.out.println("Enter diagnosis: ");
	 medical.setDiagnosis(sc.nextLine());
	 System.out.println("Enter Treatment: ");
	 medical.setTreatment(sc.nextLine());		 
	 
	 
	
}

public static void getPatientRecord() {
	 Patient patient = new Patient();

	 System.out.println("Enter patient name: ");
	 patient.getName();
	 System.out.println("Enter patient age: ");
	 patient.getAge();
	 System.out.println("Enter patient gender: ");
	 patient.getGender();
	 System.out.println("Enter patient address: ");
	 patient.getAddress();	
	
}


	
}
