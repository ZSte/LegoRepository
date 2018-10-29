package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class LabyrinthState implements State {

	public void start(Context c) {
		System.out.println("Entered Labyrinth State");
		c.setState(this);
	}
	
	public String toString() {
		return "LabyrinthState";
	}
}
