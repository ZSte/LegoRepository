package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class LineFollowState implements State {

	/**
	 * Starts the LineFollowState
	 */
	public void start(Context c) {
		System.out.println("Entered LineFollow State");
		c.setState(this);
	}
	
	/**
	 * Returns the State's name
	 */
	public String toString() {
		return "LineFollowState";
	}
}
