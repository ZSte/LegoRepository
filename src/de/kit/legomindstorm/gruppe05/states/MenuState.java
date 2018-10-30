package de.kit.legomindstorm.gruppe05.states;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import de.kit.legomindstorm.gruppe05.Context;
import de.kit.legomindstorm.gruppe05.menu.Menu;

/*
 * The first state entered
 * represents the menu
 */

public class MenuState implements State {
	
	private Menu m;

	/*
	 * States that can be entered from Menu are initialized
	 */
	private BridgeState b = new BridgeState();
	private PushObstaclesState p = new PushObstaclesState();
	private LabyrinthState lab = new LabyrinthState();
	//
	private LineFollowState line = new LineFollowState();
	
	//private List<String> i = new ArrayList<String>();
	//a LinkedHashMap is used so that items stay in insertion order
	private Map<String, State> i1 = new LinkedHashMap<String, State>();
	
	private String[] menuItems;
	
	private State[] states;
	
	private Context c;

	/**
	 * Starts the MenuState
	 * Initializes a LinkedHashMap which contains all other states
	 */
	public void start(Context c) {
		this.c = c;
		System.out.println("Entered Menu State");
		c.setState(this);
		/*i.add(b.toString());
		i.add(p.toString());
		i.add(lab.toString());
		i.add(line.toString());
		
		for(String s: i) {
			System.out.println(s);
		}*/
		
		i1.put(b.toString(), b);
		i1.put(p.toString(), p);
		i1.put(lab.toString(), lab);
		i1.put(line.toString(), line);
		
		System.out.println("I1 " + i1.get("BridgeState"));
		
		menuItems = i1.keySet().toArray(new String[0]);
		
		//menuItems = new String[i.size()];
		//menuItems = i.toArray(menuItems);
		
		System.out.println(Arrays.toString(menuItems));
		
		states = i1.values().toArray(new State[0]);
		
		for(State s: states) {
			System.out.println("STATE " + s + " " + s.getClass().getName());
		}
		
		m = new Menu(menuItems, this);
		m.showMenu();
	}
	
	/**
	 * Returns the State's name
	 */
	public String toString() {
		return "MenuState";
	}
	
	/**
	 * Starts the state with index i in the states array
	 * @param i index of the state which is started
	 */
	public void startState(int i) {
		states[i].start(c);
	}
}
