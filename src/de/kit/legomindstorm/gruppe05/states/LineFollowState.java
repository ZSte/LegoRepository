package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class LineFollowState implements State {

	public void start(Context c) {
		System.out.println("Entered LineFollow State");
		c.setState(this);
	}
	
	public String toString() {
		return "LineFollowState";
	}
}
