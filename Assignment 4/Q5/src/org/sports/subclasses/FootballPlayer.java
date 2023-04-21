package org.sports.subclasses;
import org.sports.domain.*;

import lombok.Data;

public @Data class FootballPlayer extends Player {
	
	int goalsScored;
	int assists;
	
	public FootballPlayer() {
		this("",0,"",0,0,0);

	}
	
	public FootballPlayer(String name, int age, String team, int score, int goalsScored, int assists) {
		super(name, age, team, score);
		this.goalsScored = goalsScored;
		this.assists = assists;
	}
	
	@Override
	public void play() {
	//a FootballPlayer scores an additional 5 goals for every assist they make
		score = goalsScored + 5*(assists);
	}

	
	
	

}
