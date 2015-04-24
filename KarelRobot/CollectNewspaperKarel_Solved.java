import stanford.karel.*;

public class CollectNewspaperKarel_Solved extends Karel {
	
	public void run() {
		
		// move to the newspaper
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		move();
		move();
		move();
		
		// pick up the beeper and turn around
		pickBeeper();
		turnLeft();
		turnLeft();
	
		// move back to the start
		move();
		move();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		putBeeper();
		move();
	}
	
}
