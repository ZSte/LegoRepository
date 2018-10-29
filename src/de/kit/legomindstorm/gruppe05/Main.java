package de.kit.legomindstorm.gruppe05;
import de.kit.legomindstorm.gruppe05.states.LineFollowState;
import de.kit.legomindstorm.gruppe05.states.MenuState;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c = new Context();
		
		//start the menu state as first
		MenuState m = new MenuState();
		m.start(c);
		//LineFollowState l = new LineFollowState();
		//l.start(c);
	}

}
