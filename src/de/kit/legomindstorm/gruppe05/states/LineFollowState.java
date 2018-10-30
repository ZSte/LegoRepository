package de.kit.legomindstorm.gruppe05.states;

import de.kit.legomindstorm.gruppe05.Context;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class LineFollowState implements State {
	
	//private boolean whiteFound = false;
	//private boolean gap = false;
	private final int TURN_TIME = 100;
	private Port colorSensorPort;
	private SensorModes colorSenMode;
	private SampleProvider colorSensorProv;
	private float[] colorSensorSample;

	/**
	 * Starts the LineFollowState
	 */
	public void start(Context c) {
		System.out.println("Entered LineFollow State");
		c.setState(this);
		colorSensorPort = LocalEV3.get().getPort("S4");
		colorSenMode = new EV3ColorSensor(colorSensorPort);
		colorSensorProv = colorSenMode.getMode("ColorID");
		
		// sample for the color sensor
		colorSensorSample = new float[colorSensorProv.sampleSize()];
		//float lastValue = 0;
		
		while(true) {
			followLine();
		}
	}
	
	/**
	 * Returns the State's name
	 */
	public String toString() {
		return "LineFollowState";
	}
	
	/**
	 * Starts driving forward and when no white color is detected searches
	 * for the line
	 */
	public void followLine() {
		while(isWhite()) {
			//whiteFound = true;
			Motor.A.forward();
			Motor.B.forward();
		}
		//whiteFound = false;
		searchWhite();
	}
	
	//public void driveForward() {
	//}
	
	public void turnRight(int i) {
		//
		Motor.A.rotate(i * TURN_TIME, true);
		Motor.B.rotate(- i * TURN_TIME, true);
		//whiteFound = isWhite();
	}
	
	public void turnLeft(int i) {
		//
		Motor.A.rotate(- i * TURN_TIME, true);
		Motor.B.rotate(i * TURN_TIME, true);
		//whiteFound = isWhite();
	}
	
	/**
	 * Returns if the robot is standing on the line
	 * @return
	 */
	public boolean isWhite() {
		return colorSensorSample[0] == 6;
	}
	
	/**
	 * Searches for the line on the right and on the left side
	 */
	public void searchWhite() {
		int i = 1;
		while(colorSensorSample[0] != 6 && i < 10 && !isWhite()/*whiteFound == false*/) {
			turnRight(i);
			if(isWhite()) {
				break;
			}
			turnLeft(2 * i);
			if(!isWhite()) {
				turnRight(i);
			}
		}
		//gap was found
		if(!isWhite()) {
			Motor.A.forward();
			Motor.B.forward();
			//wait for start of line
			Delay.msDelay(1000);
		}
	}
}
