package org.sports.subclasses;

import lombok.Data;
import org.sports.domain.*;

public @Data class CricketPlayer extends Player{
	
	int runsScored;
	int wicketsTaken;
	
	public CricketPlayer() {
		//super();
		this("",0,"",0,0,0);
	}
	
	public CricketPlayer(String name, int age, String team, int score, int runsScored, int wicketsTaken) {
		super(name, age, team, score);
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}
	
	@Override
	public void play() {
//A CricketPlayer scores an additional 10 runs for every wicket they take
		super.play();
		score = runsScored + 10* (wicketsTaken);
	}

	
	

}
