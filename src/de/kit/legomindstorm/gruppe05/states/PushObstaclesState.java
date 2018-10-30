package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class PushObstaclesState implements State {

	/**
	 * Starts the PushObstacleState
	 */
	public void start(Context c) {
		System.out.println("Entered PushObstacles State");
		c.setState(this);
	}
	
	/**
	 * Returns the State's name
	 */
	public String toString() {
		return "PushObstacleState";
	}
}
