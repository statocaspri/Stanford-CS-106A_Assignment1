/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		dropBeepers();
		cleanUpEnds();
		while (beepersPresent()) {
			pickUpBeeperEast();
			pickUpBeeperWest();
		}
		putBeeper();
	}   
	/*Precondition:  Karel is at the beginning of 1st Steet.  No beepers are present along 1st Street.
	 *Postcondition:  One beeper is placed at each corner along 1st Street. Karel is at the end of 
	 *1st street and must be facing West.
	 */
	private void dropBeepers() {
		putBeeper();
		while (frontIsClear()) {
			move();
			putBeeper();
		}
		turnAround();
	}
	/*Precondition: One beeper is placed at each corner along 1st Street.
	 *Postcondition: The beginning and end of 1st Street have no beepers present. Karel must 
	 *be facing East and on the first beeper present on 1st Street.
	 */
	private void cleanUpEnds() {
		pickBeeper();
		while (frontIsClear()) {
			move();
		}
			pickBeeper();
			turnAround();
			move();
		}
	/* Precondition:  Karel is facing East on the first present beeper at the beginning of 1st
	 * Street.
	 * Postcondition:  Karel is facing West on the last present beeper at the end of 1st Street.
	 */
	private void pickUpBeeperEast() {
		pickUpLastBeeper();
		}
	
	/* Precondition: Karel is facing West on the last present beeper at the end of 1st Street.
	 * Postcondition: Karel is facing East on the first present beeper at the beginning of 1st
	 * Street.
	 */
	private void pickUpBeeperWest() {
		pickUpLastBeeper();
		}
	
	/*Karel moves to the first spot where no beepers are present, turns around, and picks up the 
	 * first beeper.  Then Karel moves to the next beeper.
	 */
	private void pickUpLastBeeper() {
		while (beepersPresent()) {
			move();
	}
		turnAround();
		move();
		if (beepersPresent()) {
			pickBeeper();
			move();
	}
	}
	}

