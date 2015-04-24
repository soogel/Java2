import stanford.karel.Karel;


public class AdvancedRaceTrackKarel_Solved1 extends Karel {

	public void run() {
	
		// Endlosschleife:
		while (true) {
			
			while (frontIsClear()) {
				move();
			}
			
			// Karel ist jetzt in der Ecke Süd-Ost.
			turnLeft();
			
			while (frontIsClear()) {
				move();
			}
			// Karel ist jetzt bei Ost-Mitte.
			turnLeft();
			
			
			while (frontIsClear()) {
				move();
			}
			// Karel ist jetzt in der Mitte.
			turnLeft();
			turnLeft();
			turnLeft();
			
			while (frontIsClear()) {
				move();
			}
			// Karel ist jetzt bei Nord-Mitte.
			turnLeft();
			
			while (frontIsClear()) {
				move();
			}
			// Karel ist jetzt in der Ecke Nord-West.
			turnLeft();
			
			while (frontIsClear()) {
				move();
			}
			// Karel ist jetzt an der Ecke Süd-West.
			turnLeft();
			
			// Bis zur Start/Ziellinie gehen.
			move();
			move();
			move();
			
			// Dort einen Beeper setzen.
			putBeeper();
			
			// Dann geht's weiter mit der nächsten Wiederholung.
			
		}
		
	}
	
}
