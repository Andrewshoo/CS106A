/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private double W = 150; //width of rect
	private double H = 50; //height of rect
	private double GAP = 50; //space between rectangles
	
	public void run() {
	
		double x = getWidth()/2;//vertical center
		double y = getHeight()/2;//horizontal center
		program(x, y - GAP - H, W, H);
		conPr(x, y, W, H);
		dialPr(x + (W + GAP), y, W, H);
		grPr(x - W - GAP, y, W, H);
		line(x,y);//a line between rectangles 
		
	}
	
	private void program (double x, double y, double w, double h) {
		
		GRect rect = new GRect(x - W/2 , y - H/2 , W, H);
		add(rect);
		GLabel label = new GLabel ("Program", x - W/2, y - H/2);
		label.move((W - label.getWidth())/2, (H + label.getAscent())/2 );
		add(label);
	}
	
	private void conPr (double x, double y, double w, double h) {
		
		GRect rect = new GRect(x - W/2 , y - H/2 , W, H);
		add(rect);
		GLabel label = new GLabel ("ConsoleProgram", x - W/2, y - H/2);
		label.move((W - label.getWidth())/2, (H + label.getAscent())/2 );
		add(label);
	}
	
	private void dialPr (double x, double y, double w, double h) {
		
		GRect rect = new GRect(x - W/2 , y - H/2 , W, H);
		add(rect);
		GLabel label = new GLabel ("DialogProgram", x - W/2, y - H/2);
		//centers the text
		label.move((W - label.getWidth())/2, (H + label.getAscent())/2 );
		add(label);
	}
	
	private void grPr (double x, double y, double w, double h) {
		
		GRect rect = new GRect(x - W/2 , y - H/2 , W, H);
		add(rect);
		GLabel label = new GLabel ("GraphicsProgram", x - W/2, y - H/2);
		label.move((W - label.getWidth())/2, (H + label.getAscent())/2 );
		add(label);
	}
	
	private void line (double x, double y) {
		
		GLine line = new GLine(x, y - GAP - H/2, x, y - H/2);
		add(line);
		GLine line2 = new GLine(x + W + GAP, y - H/2, x, y - GAP - H/2);
		add(line2);
		GLine line3 = new GLine(x - W - GAP, y - H/2, x, y - GAP - H/2);
		add(line3);
		
		
	}
	
	
	
	
		
}

