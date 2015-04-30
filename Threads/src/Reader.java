
public class Reader extends Thread {
	private Figur figur;
	public Reader(Figur figur) {
		this.figur= figur;
		
	}
	@Override
	public void run(){
		while(true){
			System.out.println(figur);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
