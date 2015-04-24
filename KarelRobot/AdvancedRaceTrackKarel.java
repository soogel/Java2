import stanford.karel.Karel;


public class AdvancedRaceTrackKarel extends Karel {

	public void run() {
		while (true){
			move();
			System.out.println(getLocation().x + " " +getLocation().y);
			if (frontIsBlocked())
			{ turnLeft();
			if (frontIsBlocked())
			{ turnLeft();
			turnLeft();
			
		
			
				
			}
		}
		}
		
	}
	
}
