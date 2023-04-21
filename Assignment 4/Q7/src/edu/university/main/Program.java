package edu.university.main;
import edu.university.test.*;

public class Program {

	public static void main(String[] args) {
	
	StudentTest test = new StudentTest();

		int choice;
		
		while((choice = Menu.menuList()) != 4) {		
			switch(choice) {
					
			case 1: //Add Student Details
					test.acceptStudentDetails();
					break;

			case 2: //Calculate total tuition	
					test.calcTuition(); 
					break;
					
			case 3: //Print total tuition of University
					test.printTuition();
					break;			
			}
		}
	}
}
