package edu.university.test;
import java.awt.Graphics2D;
import java.util.Arrays;
import java.util.Scanner;
import edu.university.domain.*;

public class StudentTest {
Scanner sc = new Scanner(System.in);
	
	Student[] arr = new Student[4];
	
	{
	arr[0] = new UndergraduateStudent();
	arr[1] = new GraduateStudent();
	arr[2] = new UndergraduateStudent();
	arr[3] = new GraduateStudent();
	}
	
	public void acceptStudentDetails() {
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] !=null ) { 
				System.out.println("Enter Name of "+(index+1)+"st student ");
				arr[index].setName(sc.nextLine());
				
				System.out.println("Enter student ID: ");
				try  {
					arr[index].setId(sc.nextInt());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				
				System.out.println("Enter major: ");
				arr[index].setMajor(sc.nextLine());
				
	
				System.out.println("Enter GPA: ");
				try {
					arr[index].setGpa(sc.nextDouble());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				
				if(arr[index] instanceof UndergraduateStudent) {
					UndergraduateStudent undergrad = (UndergraduateStudent) arr[index];
					
					System.out.println("Enter credit hours: ");
					undergrad.setCreditHours(sc.nextInt());
					sc.nextLine();
					
					
				//	System.out.println("Enter Tuition Rate: ");
				//	undergrad.setTuitionRate(sc.nextDouble());
				}
				
				else if(arr[index] instanceof GraduateStudent) {
					GraduateStudent grad = (GraduateStudent) arr[index];
					
					System.out.println("Enter credit hours: ");
					grad.setCreditHour(sc.nextInt());
					sc.nextLine();
					
					System.out.println("Enter Research Fee: ");
					grad.setResearchFee(sc.nextDouble());	
					sc.nextLine();
				}			
			} }
		System.out.println("Student details entered succesfully!");
	}
	
	public void calcTuition() {
		for(int index=0; index<arr.length; index++)
		{
			if(arr[index] instanceof UndergraduateStudent) {	
				UndergraduateStudent undergrad = (UndergraduateStudent) arr[index];

				arr[index].calculateTuition();
				System.out.println("Tuition of student "+(index+1)+": " + undergrad.getTuitionRate());
			}
			
			else if(arr[index] instanceof GraduateStudent) {	
				GraduateStudent grad = (GraduateStudent) arr[index];

				arr[index].calculateTuition();
				System.out.println("Tuition of student "+(index+1)+": " + grad.getTuitionRate());
				
			}
		}
	}
	
	public void printTuition() {
		double t1=0.0, t2=0.0;
		for(int index=0; index<arr.length; index++)
		{
			if(arr[index] instanceof UndergraduateStudent) {	
				UndergraduateStudent undergrad = (UndergraduateStudent) arr[index];

				arr[index].calculateTuition();
				t1 = undergrad.getTuitionRate();
			}
			
			else if(arr[index] instanceof GraduateStudent) {	
				GraduateStudent grad = (GraduateStudent) arr[index];

				arr[index].calculateTuition();
				t2 = grad.getTuitionRate();
			}
		}
		System.out.println("Total tuition of university: "+ (t1 + t2));
	}	
	

}
