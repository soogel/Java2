package s.LE5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myListener implements ActionListener {
	private StopUhr suoe;
	MyThread mt ;
	public myListener(StopUhr suo){
		suoe=suo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")){
			System.out.println("Start");
			mt = new MyThread();
			
			mt.start();
			
		}
		else if (e.getActionCommand().equals("Stop")){
			System.out.println("Stop");
			mt.interrupt();
		}
				
			
		
	}

	

}
