package de.kit.legomindstorm.gruppe05;
import de.kit.legomindstorm.gruppe05.states.State;

public class Context {

	/**
	 * The actual state the context is in
	 */
	private State state;
	
	public Context() {
		state = null;
	}
	
	/**
	 * Changes the actual state of the context
	 * @param state new state
	 */
	public void setState(State state) {
		this.state = state;
		System.out.println("Changed state " + state.toString());
	}
	
	/**
	 * Returns the actual state of the context
	 * @return actual context state
	 */
	public State getState() {
		return this.state;
	}
}
