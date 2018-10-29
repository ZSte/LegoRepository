package de.kit.legomindstorm.gruppe05;
import de.kit.legomindstorm.gruppe05.states.State;

public class Context {

	private State state;
	
	public Context() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
		System.out.println("Changed state " + state.toString());
	}
	
	public State getState() {
		return this.state;
	}
}
