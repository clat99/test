package org.sports.test;
import org.sports.domain.*;
import org.sports.subclasses.*;
import java.util.Scanner;

public class PlayerTest {
static Scanner sc = new Scanner(System.in);
	
	Player[] arr = new Player[4];
	{
	arr[0] = new FootballPlayer();
	arr[1] = new CricketPlayer();
	arr[2] = new FootballPlayer();
	arr[3] = new CricketPlayer();
	}
	
	public void acceptPlayerDetails() {
	
	for(int index=0; index<arr.length; index++)
	{
		System.out.println("Enter Player "+ (index+1)+"'s Name: ");
		arr[index].setName(sc.nextLine());
		
		System.out.println("Enter Age:");
		arr[index].setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Team: ");
		arr[index].setTeam(sc.nextLine());
		
		if(arr[index] instanceof FootballPlayer)
		{
			FootballPlayer football = (FootballPlayer) arr[index];
			System.out.println("Enter goals scored: ");
			football.setGoalsScored(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter assists made: ");
			football.setAssists(sc.nextInt());
			sc.nextLine();

		}
		else if(arr[index] instanceof CricketPlayer) {
			CricketPlayer cricket = (CricketPlayer) arr[index];
			System.out.println("Enter runs scored: ");
			cricket.setRunsScored(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter wickets taken: ");
			cricket.setWicketsTaken(sc.nextInt());
			sc.nextLine();
		}		
	}
	}
	
	//For Dynamic Method Dispatch on play()
	
	public void calculatePlay() {
		for(int index=0; index<arr.length; index++) {
			arr[index].play();
			System.out.println(arr[index].getScore());
		}
	}

	public void printTeamScore() {
	//	int teamScore = 0;
		for(int index=0; index<arr.length; index++) {
			System.out.println(arr[index].toString());
		}
		
	}
}
	


