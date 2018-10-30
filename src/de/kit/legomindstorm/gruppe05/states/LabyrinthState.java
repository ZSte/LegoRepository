package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class LabyrinthState implements State {

	/**
	 * Starts the LabyrinthState
	 */
	public void start(Context c) {
		System.out.println("Entered Labyrinth State");
		c.setState(this);
	}
	
	/**
	 * Returns the State's name
	 */
	public String toString() {
		return "LabyrinthState";
	}
}
