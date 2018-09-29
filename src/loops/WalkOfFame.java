
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(0);
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.penDown();
		rob.setSpeed(10);
		// 3. Set the size of the star to 30.
		for(int O = 0; O<10; O++) {

			for(int i = 0; i<5; i++) {
				rob.move(50);
				rob.turn(144);
			}
			rob.setAngle(55);
			rob.move(54);
		}
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
