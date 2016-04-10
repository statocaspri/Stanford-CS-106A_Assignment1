/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

  public void run() {
    moveToNewspaper();
    pickUpNewspaper();
    returnToStartPoint();
    
   }
    /*
   * Karel moves through the door to beeper
   */
  private void moveToNewspaper () {
	  move();
	  move();
	  turnRight();
	  move();
	  turnLeft();
	  move();
  }
  
  /*
   * makes Karel pick up beeper and turn around
   */
  private void pickUpNewspaper () {
	  pickBeeper();
	  turnLeft();
	  turnLeft();
	
} 

  /*
   * makes Karel return to start point, it can be used also for loop i<3...
   */
  private void returnToStartPoint() {
	  move();
	  move();
	  move();
	  turnRight();
	  move();
	  turnRight(); 
	  
  }
  
}
  
