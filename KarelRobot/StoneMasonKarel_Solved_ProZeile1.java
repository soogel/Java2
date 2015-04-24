import stanford.karel.*;

public class StoneMasonKarel_Solved_ProZeile1 extends Karel {

	// Lösungsansatz: gehe Zeile für Zeile vor, von unten (Süden) nach oben (Norden)
	// Diese Lösung verwendet:
	//  - eine for-Schleife mit 5 Wiederholungen (eine für jede Zeile)
	//  - fünf if-Bedingungen
	public void run() {
		
		// Karel ist an der südwestlichen Ecke vom Spielfeld und schaut nach Osten.
		
		// Gehe Zeile für Zeile vor (von unten nach oben):
		for (int zeile=1 ; zeile <= 5 ; zeile++) {
			
			// erste Säule
			if (!beepersPresent()) {
				putBeeper();
			}
			move();
			move();
			move();
			move();
			
			// zweite Säule
			if (!beepersPresent()) {
				putBeeper();
			}
			move();
			move();
			move();
			move();
			
			// dritte Säule
			if (!beepersPresent()) {
				putBeeper();
			}
			move();
			move();
			move();
			move();
			
			// vierte Säule
			if (!beepersPresent()) {
				putBeeper();
			}
			
			// umdrehen und zurück zum westlichen Spielfeldrand
			turnLeft();
			turnLeft();
			move();
			move();
			move();
			move();
			move();
			move();
			move();
			move();
			move();
			move();
			move();
			move();
			
			// Am westlichen spielfeldrand angekommen, schaue nach Norden.
			turnLeft();
			turnLeft();
			turnLeft();
			
			// Wenn es nach Norden weiter geht, dann gehe ein Feld nach Norden.
			// Falls Karel schon in der obersten (5.) Reihe ist, geht es nicht weiter
			// und die for-Schleife beendet sich selbst (zeile <= 5).
			if (frontIsClear()) {
				move();
				turnLeft();
				turnLeft();
				turnLeft();
			}
		}
		
	}

}
