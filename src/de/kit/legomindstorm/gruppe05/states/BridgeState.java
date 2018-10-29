package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;

public class BridgeState implements State {

	public void start(Context c) {
		System.out.println("Entered BridgeState");
		c.setState(this);
	}
	
	public String toString() {
		return "BridgeState";
	}
}
