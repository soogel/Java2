public class ThreadInterruptExample extends Thread {

	@Override
	public void run() {
		while (!isInterrupted()) {
			System.out.println("I am Still running");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				interrupt();
				
			}
		}
		System.out.println("Stopped");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadInterruptExample tie = new ThreadInterruptExample();
		tie.start();
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		tie.interrupt();

	}

}
