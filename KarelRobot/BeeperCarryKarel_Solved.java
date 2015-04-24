import stanford.karel.Karel;


public class BeeperCarryKarel_Solved extends Karel {

	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		putBeeper();
	}
	
}


