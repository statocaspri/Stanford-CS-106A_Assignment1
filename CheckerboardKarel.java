/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

//	 Karel distributes beepers in a patern to create a checkerboard. 
//	 When Karel is left standing facing the North, at the end of the loop, the programm is terminated.
		
		public void run() {
			while (notFacingNorth()){		
					putBeeper();
					goKarel();
					goKarel();					
			}
		}
								
//	 Checks if the path in front of Karel is clear and if true moves Karel one position further. 
//	 If path is blocked (the end of the street is reached)the code moves Karel one street up 
//	 and turns karel arround to be ready to walk the next street in the other direction.
		
		private void goKarel(){	
			if (frontIsClear()){
				move();
			} else {
				goUpAndTurn();
			}							
		}

//	 IF Karel is not standing facing the North(topwall is not reached), this code moves Karel to the start position of the next street.
			
			private void goUpAndTurn(){		
				if (notFacingNorth()){
						if (facingEast()){					
							turnWest();				
						} else {				
							turnEast();				
						}
				}
			}	
			
//		 This code turns Karel left and before making another move, the code checks to make sure the topwall is not yet reached.
//		 If false, Karel moves to the next street and turns face to the West. If true Karel is left standing facing the North.

			private void turnWest(){
				turnLeft();
				if (frontIsClear()){
					move();				
					turnLeft();
				}
			}
					
//		 This code turns Karel right and before making another move, the code checks to make sure the topwall is not yet reached.
//		 If false, Karel moves to the next street and turns his face to the East. If true Karel is left standing facing the North.
					
			private void turnEast(){
				turnRight();
				if (frontIsClear()){
					move();
					turnRight();
				}
			}		
	}
		



