package org.assignment.four.main;
import org.assignment.four.test.EmployeeTest;
import org.assignment.four.domain.*;

public class Program {

	public static void main(String[] args) {
		
	int choice;
	EmployeeTest employeetest = new EmployeeTest();

	while((choice = Menu.menuList()) != 0 ) {
		switch(choice) {
		
		case 1: //Accept Record
				employeetest.acceptRecord();
			break;
			
		case 2: //Calculate Salary
				employeetest.calcSalary();
			break;
			
		case 3: //Print Record
				employeetest.printPayRoll();
			break;
		}
	}
	}

}
