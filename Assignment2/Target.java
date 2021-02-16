/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	private double RAD = 80;
	private double RAD_M = 50;
	private double RAD_S = 20;
	
	public void run() {
		double x = getWidth()/2;
		double y = getHeight()/2;
		oval(x - (RAD * 2)/2, y - (RAD * 2)/2, RAD);
		ovalInner(x - (RAD_M * 2)/2, y - (RAD_M * 2)/2, RAD_M);
		oval(x - (RAD_S * 2)/2, y - (RAD_S * 2)/2, RAD_S);
	}
	
	private GOval oval (double x, double y, double r){
		GOval oval = new GOval(x, y, r * 2, r * 2);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval);
		return oval;
	}
	
	private GOval ovalInner (double x, double y, double r){
		GOval oval = new GOval(x, y, r * 2, r * 2);
		oval.setFilled(true);
		oval.setColor(Color.WHITE);
		add(oval);
		return oval;
	}
		
	
	
}
