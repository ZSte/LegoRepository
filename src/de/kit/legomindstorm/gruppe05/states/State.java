package de.kit.legomindstorm.gruppe05.states;
import de.kit.legomindstorm.gruppe05.Context;

public interface State {
	
	/**
	 * Starts the state
	 * @param c
	 */
	public void start(Context c);
	
	/**
	 * Returns the State's name
	 * @return
	 */
	public String toString();
}
