
public class DeamonExample extends Thread {
	@Override
	public void run(){
		String name= getName();
		while(!isInterrupted()){
			System.out.println(name+ " still running");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonExample de= new DeamonExample();
		de.setName("Thread 02");
		de.start();
		
		DeamonExample deDeamon= new DeamonExample();
		deDeamon.setName("Daemon 01");
		deDeamon.setDaemon(true);
		deDeamon.start();
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		de.interrupt();
		System.out.println("Main Methode Beendet");
		
	}

}
