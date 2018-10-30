package de.kit.legomindstorm.gruppe05.menu;

import de.kit.legomindstorm.gruppe05.states.MenuState;
import lejos.hardware.lcd.LCD;
import lejos.utility.TextMenu;

public class Menu {
	
	private MenuState menuState;
	private TextMenu t;
	
	/**
	 * Creates a new menu
	 * @param items items that are shown in the menu
	 * @param menuState
	 */
	public Menu(String[] items, MenuState menuState) {
		this.menuState = menuState;
		this.t = new TextMenu(items);
	}
	
	/**
	 * Shows a menu where an item is chosen
	 * The corresponding state is started
	 */
	public void showMenu() {
		
		//index of selected item
		int index = t.select();
		LCD.clear();
		//
		menuState.startState(index);
	}
}
