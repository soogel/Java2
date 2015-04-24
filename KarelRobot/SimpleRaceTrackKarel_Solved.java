import stanford.karel.Karel;


public class SimpleRaceTrackKarel_Solved extends Karel {

	public void run() {
	
		// Endlosschleife:
		while (true) {
			
			// Gehe solange geradeaus bis es nicht mehr weiter geht, dann drehe dich nach links
			while (frontIsClear()) {
				move();
			}
			turnLeft();
			
			// Mache das ganze immer und immer wieder (vier Mal pro Runde).
		}
		
	}
	
}
