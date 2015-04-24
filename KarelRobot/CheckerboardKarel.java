import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		
		while (true) { if (frontIsClear()) {
		
		while (true) {
			
			//soalnge frei mache das..
		if (frontIsClear()) {  
		putBeeper();
		if (frontIsClear()) { 
			
			
		
		move();}
		else {break;}
		if (frontIsClear()) { 
			
			
			
			move();}
			else {break;}
		
		}
		// wenn nicht höre auf
		else {
			break;}
			
		
		
	}// while true { schleife
		
		//gehe zur nächsten zeile
		turnLeft();
		move();
		turnLeft();
		
		while (true) {
			// von rechts nach links jetzt
			if (frontIsClear()) {  
				putBeeper();
				if (frontIsClear()) { 
					
					
				
				move();}
				else {break;}
				if (frontIsClear()) { 
					
					
					
					move();}
					else {break;}
				
				}
				// wenn nicht höre auf
				else {
					break;}
			
			
			
			
			}
		//geh zur nächsten linken zeile
		turnLeft();
		turnLeft();
		turnLeft();
		if (frontIsClear()){
		move();}
		else {break;}
		turnLeft();
		turnLeft();
		turnLeft();
			
		
		
		}
		else {break;}
		
		
		
	
}//run
} // hauptmethode
}
