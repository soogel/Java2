import stanford.karel.*;

public class StoneMasonKarel_Solved_ProZeile2 extends Karel {

	// Lösungsansatz: gehe Zeile für Zeile vor, von unten (Süden) nach oben (Norden)
	// Diese Lösung verwendet:
	//  - eine for-Schleife mit 5 Wiederholungen (eine für jede Zeile)
	//  - eine for-Schleife mit 4 Wiederholungen (eine für jede Säule)
	//  - drei if-Bedingungen
	public void run() {
		
		// Karel ist an der südwestlichen Ecke vom Spielfeldrand und schaut nach Osten.
		
		// Gehe Zeile für Zeile vor (von unten nach oben):
		for (int zeile=1 ; zeile <= 5 ; zeile++) {
			
			// Für jede der vier Säulen, wiederhole die folgenden Schritte:
			for (int saeule=1 ; saeule <= 4 ; saeule++) {
				
				// Setze einen Beeper falls nötig.
				// Diese Überprüfung muss stattfinden, noch bevor sich Karel das erste Mal bewegt,
				// denn bereits an Karels Startpunkt fehlt ein Beeper.
				if (!beepersPresent()) {
					putBeeper();
				}
				
				// Gehe vier Schritte nach Osten (außer bei der vierten Säule, denn da ist ja der Spielfeldrand).
				if (saeule < 4) {
					move();
					move();
					move();
					move();
				}
			}
			
			// Karel ist jetzt am östlichen Spielfeldrand angekommen und schaut nach Osten.
			// Drehe dich um und gehe wieder zurück zum westlichen Spielfeldrand.
			turnLeft();
			turnLeft();
			while (frontIsClear()) {
				move();
			}
			
			// Karel ist jetzt am westlichen Spielfeldrand angekommen und schaut nach Westen.
			// Drehe dich nach Norden.
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
