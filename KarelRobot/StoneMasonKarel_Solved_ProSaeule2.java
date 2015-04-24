import stanford.karel.*;

public class StoneMasonKarel_Solved_ProSaeule2 extends Karel {

	// Lösungsansatz: setze eine komplette Säule, dann setze die nächste Säule (von links nach rechts)
	// Diese Lösung verwendet:
	//  - eine while-Endlosschleife, welche aber am Methodenende beendet wird (mittels return)
	//  - zwei while-Schleifen zum Hoch- und Runterlaufen entlang der Säulen
	//  - drei if-Bedingungen
	public void run() {
		
		// Karel setzt eine Säule nach der anderen.
		// Die Gesamtanzahl der Säulen ist in dieser Variante nicht im vorhinein definiert.
		// Wir verwenden hier eine Endlosschleife, die später explizit mit "break" oder "return" abgebrochen werden muss. 
		while (true) {
			
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
			
			// Versuche, vier Schritte nach Osten zu gehen.
			// Falls Karel am östlichen Spielfeldrand angekommen ist, beende die gesamte Methode. 
			for (int schritteRechts=1 ; schritteRechts <= 4 ; schritteRechts++) {
				if (frontIsClear()) {
					move();
				} else {
					// Beende die komplette Methode.
					// Ein break wäre hier nicht ausreichend,
					// weil wir ja aus der äußersten while-Schleife ausbrechen wollen
					// und nicht aus dieser for-Schleife.
					return;
				}
			}
			
			// Jetzt steht Karel am Fuße der nächsten Säule (bzw. am östlichen Spielfeldrand) und schaut nach Osten.
		}
		
	}

}
