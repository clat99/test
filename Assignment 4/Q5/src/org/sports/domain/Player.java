package org.sports.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public @NoArgsConstructor @AllArgsConstructor class Player {

	@Getter @Setter private String name;
	@Getter @Setter private int age;
	@Getter @Setter private String team;
	@Getter @Setter public int score;

	
	public void play() {
		
	}
	
	public String toString() {
		return String.format("%-25s", this.team);
		
	}
}
