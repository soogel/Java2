import stanford.karel.SuperKarel;


public class BeeperCollectingKarel extends SuperKarel {
	
	public void run() {
		int numberOfBeeper=0; //deklarieren
		
		
	for (int zeile=1 ; zeile <=7 ; zeile++ ){
		
		
		
		
		//zeile langlaufen
		for (int i=1 ; i <9 ; i++ ){
		if (beepersPresent()) { 
			pickBeeper();
			System.out.println("beeper aufgenommen");
			numberOfBeeper++;
			System.out.println("ich habe jetzt"+ numberOfBeeper + "aufgenommen");
					
		}		
		move();
			
		}// ende der Zeile
		
		
		//nach links laufen drehen
		turnLeft(); 
		turnLeft();
		
		//nach links laufen
		for (int i=1 ; i <9 ; i++ ){
			move();
		}
		if (zeile==7) {
			break;}
		//gehe nach oben
		turnLeft(); 
		turnLeft();
		turnLeft(); 
		move();
		
		//nächste zeile start position
		turnLeft(); 
		turnLeft();
		turnLeft(); 
	}
	turnLeft();
	for (int sp=1; sp <7; sp++){
		move();}
	
	turnLeft(); 
	
	//zeilen läufer
	for (int i=1 ; i <9 ; i++ ){
		move();
	}
	
	//lege Beeper ab
	for (;numberOfBeeper >0;numberOfBeeper-- ) {
		putBeeper();
	}	
	
	
	}
	
}
		
		
		
	
