package org.sports.test;

public class Program {

	public static void main(String[] args) {
		
		PlayerTest test = new PlayerTest();
		
		int choice;
		
		while((choice = Menu.menuList()) != 0) {		
			switch(choice) {
					
			case 1: //Add Player Details
					test.acceptPlayerDetails();
					break;

			case 2: test.calculatePlay();
					break;
					
			case 3://Print Total score of Team
				 	test.printTeamScore();
				break;			
			}
		}
	}
}
