package s.LE5;

public class MyThread extends Thread {
	int time=0;
	@Override
	public void run(){
		while( !isInterrupted()  ){
			try {
				Thread.sleep(1000);
				System.out.println(time);
				StopUhr.label.setText(""+time); 
				time++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				interrupt();
			}
			// System.out.println(time);
			// label.setText(""+time); 
			 
		}
		
	}

}
