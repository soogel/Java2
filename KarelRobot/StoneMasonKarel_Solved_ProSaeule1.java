import stanford.karel.*;

public class StoneMasonKarel_Solved_ProSaeule1 extends Karel {

	// Lösungsansatz: setze eine komplette Säule, dann setze die nächste Säule (von links nach rechts)
	// Diese Lösung verwendet:
	//  - eine for-schleife mit 4 Wiederholungen (eine für jede Säule)
	//  - zwei while-Schleifen zum Hoch- und Runterlaufen entlang der Säulen
	//  - drei if-Bedingungen
	public void run() {
		
		// Karel setzt eine Säule nach der anderen.
		// Da es 4 Säulen gibt, gibt es auch 4 Wiederholungen.
		for (int saeule=1; saeule <= 4 ; saeule++) {
			
			// Karel ist an der südwestlichen Ecke vom Spielfeld und schaut nach Osten.
			
			// Wenn in der untersten Zeile ein Beeper fehlt, dann setze hier einen ab. 
			if (!beepersPresent()) {
				putBeeper();
			}
			
			// Schaue nach Norden.
			turnLeft();
			
			// Solange Karel nach Norden gehen kann gehe einen Schritt nach Norden
			while (frontIsClear()) {
				move();
				
				// ...und setze falls nötig einen Beeper.
				if (!beepersPresent()) {
					putBeeper();
				}
			}
			
			// Jetzt ist Karel an der nördlichen Begrenzung angekommen und schaut nach Norden.
			// Umdrehen und nach Süden schauen.
			turnLeft();
			turnLeft();
			
			// Gehe wieder bis zum südlichen Spielfeldrand.
			while (frontIsClear()) {
				move();
			}
			
			// Schaue wieder nach Osten.
			turnLeft();
			
			// Gehe vier Schritte nach Osten, außer bei der letzten Säule (da gehts nicht mehr weiter nach Osten).
			if (saeule < 4) {
				move();
				move();
				move();
				move();
			}
			 
			// Jetzt steht Karel am Fuße der nächsten Säule (bzw. am östlichen Spielfeldrand) und schaut nach Osten.
		}
		
	}

}
