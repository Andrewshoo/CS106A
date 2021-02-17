/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		double x = (getWidth() - (BRICK_WIDTH * BRICKS_IN_BASE))/2; //centers x pos
		double y = getHeight() - BRICK_HEIGHT; // starting from bottom of the window
		double l = BRICKS_IN_BASE;
		
		for(int i = 0; i < BRICKS_IN_BASE; i++){//loop for y (vertical)
			for(int j = 0; j < l; j++){         //loop for x (horizontal)
		
				double k = x + (j * BRICK_WIDTH);
				double n = y - (i * BRICK_HEIGHT);
				GRect bricks = new GRect (k, n, BRICK_WIDTH, BRICK_HEIGHT);
				add(bricks);
			}
			
			x+=BRICK_WIDTH/2; //shifts the x position by half a brick
			l--;//minus the brick	
		}
	}
}

