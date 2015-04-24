import stanford.karel.Karel;


public class AdvancedRaceTrackKarel_Solved2 extends Karel {
	
	public void run() {
		
		// Endlosschleife:
		while (true) {
	 
			if (frontIsClear()) {
				move();
			} else if (leftIsClear()) {
				turnLeft();
			} else if (rightIsClear()) {
				turnLeft();
				turnLeft();
				turnLeft();
			}
			
			// Setze an der Zielgeraden einen Beeper:
			if (getLocation().x == 4 && getLocation().y == 1) {
				putBeeper();
			}
			
		}
		
	}
	
}
