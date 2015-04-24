import stanford.karel.Karel;


public class SpiralEscapeKarel extends Karel {

	public void run() {
		System.out.println("1");
		int numberOfBeeper=0; //deklarieren
		//mache so lange wie geht
		System.out.println("2");
		while (true){
			System.out.println("3");
			//wenn links oder rechts frei, do
			
				System.out.println("4");
			//wenn beeper da, dann nimm ihn
				if (beepersPresent()) { 
				pickBeeper();
				System.out.println("beeper aufgenommen");
				numberOfBeeper++;
				System.out.println("ich habe jetzt"+ numberOfBeeper + "aufgenommen");
						
			}	
			//falls frei, lauf
		if (frontIsClear()) {
			move();
		}else if (getLocation().x==11 && getLocation().y==1){
			break;
		}
		
		// wenn nicht dreh dich
			else {turnLeft();}
		} 
			
		
		
	}
	
	
}

