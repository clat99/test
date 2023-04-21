package org.assignment.four.test;
import org.assignment.four.domain.*;
import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);
	
	int index = 0;
	Employee arr[] = new Employee [4];
	{
	arr[0] = new FullTimeEmployee();    //upcasting
	arr[1] = new PartTimeEmployee();
	arr[2] = new FullTimeEmployee();
	arr[3] = new PartTimeEmployee();
	}

	
	public void acceptRecord() {
		
	for (int index=0; index<arr.length; index++) {	
		System.out.println("Enter name of employee "+(index+1));
		arr[index].setName(sc.nextLine());
			
		System.out.println("Enter ID of employee"+(index+1));
		arr[index].setId(sc.nextInt());
		sc.nextLine();
			
		if(arr[index] != null) {
			
			if(arr[index] instanceof FullTimeEmployee) {
				FullTimeEmployee fulltime = (FullTimeEmployee) arr[index];       //downcasting
			
				System.out.println("Enter bonus: ");
				fulltime.setBonus(sc.nextDouble());		
			}
			
			if(arr[index] instanceof PartTimeEmployee) {
				PartTimeEmployee parttime = (PartTimeEmployee) arr[index];
				
				System.out.println("Enter Hours Worked by Part Time Employee: ");
				parttime.setHoursWorked(sc.nextInt());
				
				System.out.println("Enter Hourly rate of Part Time Employee: ");
				parttime.setHourlyRate(sc.nextDouble());			
			}
		}		
	}}

	public void calcSalary() {
		for(int index=0; index<arr.length; index++)
		{	arr[index].calculatePay();
			System.out.println(arr[index].getSalary());
		}
	}
	
	public void printPayRoll() {
		for(int index=0; index<arr.length; index++)	
			System.out.println(arr[index].toString());
	}
}
