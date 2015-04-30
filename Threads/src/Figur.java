
public class Figur {
private int vertical;
private char horizontal;
private boolean verfuegbar;
public  Figur(){
	verfuegbar=false;
}

public synchronized void  setPosition(int vertical, char horizontal){
	if(verfuegbar){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.vertical = vertical;
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.horizontal= horizontal;
	verfuegbar=true;
	notify();
	
	
		
}
public synchronized String toString(){
	if(!verfuegbar){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} verfuegbar = false;
	return horizontal + " / "+ vertical;
}

}
