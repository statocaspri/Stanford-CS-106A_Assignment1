/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

/* Karel needs to fill the stones/beepers which are missing from the columns, starts with an infinite number of beepers */
	  public void run() {
		  while (frontIsClear()) {
			  repairKarel();
		  }
		  repairKarel();
	  }
    	  
	  /* Pre-condition: at the bottom of a first column, facing East
	   * Post-condition: at the bottom of a next column that needs repair, facing East*/
	  private void repairKarel() {
		  moveUpColumn();
		  moveDownColumn();
		  moveToNextColumn();
	  }
    	  
	  /* Pre-condition: at the bottom of a column, facing East
	   * Post-condition: at the top of a column, facing North*/
	  private void moveUpColumn() {
		  turnLeft();
		  while(frontIsClear()) {
			  beeperCheck();
		      move();
		  }
		   beeperCheck();
	  }
	  
	  /* if there is no beeper, put one down */
	  private void beeperCheck() {
		  if(noBeepersPresent()) {
			  putBeeper();
		  }
	  }
	  
	  /* Pre-condition: at the top of a column, facing North*
	   * Post-condition: at the bottom of a column, facing East*/
	  private void moveDownColumn() {
		  turnAround();
		  while(frontIsClear()) {
		      move();
		  }
	      turnLeft();
	  }
	  
	  /* Pre-condition: at the bottom of a repaired column, facing East*
	   * Post-condition: at the bottom of a next column that needs repair, facing East*/
	  private void moveToNextColumn() {
		  if(frontIsClear()) {
			  for(int i=0; i<4; i++) {
				  move();
			  }
		  }
	  }
	  
}
