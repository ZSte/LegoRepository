package de.kit.legomindstorm.gruppe05.menu;

import lejos.hardware.lcd.LCD;
import lejos.utility.TextMenu;

public class Menu {
	TextMenu t;
	
	public Menu(String[] items) {
		t = new TextMenu(items);
	}
	
	public void showMenu() {
		
		//index of selected item
		int index = t.select();
		LCD.clear();
	}
}
