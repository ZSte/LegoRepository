package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class BridgeState implements State {

	/**
	 * Starts the BridgeState
	 */
	public void start(Context c) {
		System.out.println("Entered BridgeState");
		c.setState(this);
	}
	
	/**
	 * Returns the State's name
	 */
	public String toString() {
		return "BridgeState";
	}
}
