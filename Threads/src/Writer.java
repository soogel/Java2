
public class Writer extends Thread{

	private Figur figur;
	
	public Writer(Figur figur){
		this.figur=figur;
		
	}
	
	@Override 
	public void run(){
		int vertical =1;
		char horizontal = 'A';
		
		while (vertical <= 8 && horizontal <= 'H'){
			figur.setPosition(vertical, horizontal);
			vertical++;
			horizontal++;
			
		}
	}
	
}
