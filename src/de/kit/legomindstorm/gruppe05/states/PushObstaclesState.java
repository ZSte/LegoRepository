package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class PushObstaclesState implements State {

	public void start(Context c) {
		System.out.println("Entered PushObstacles State");
		c.setState(this);
	}
	
	public String toString() {
		return "PushObstacleState";
	}
}
