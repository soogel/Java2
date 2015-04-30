package s.LE5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StopUhr extends JFrame {
	int time=0;
	public static JLabel label;
	public StopUhr() {
		super("Stop Uhr");
		
		
		
		setSize(150,100);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(2));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		label = new JLabel(""+time);
		
		//p1.add(start);
		//p1.add(stop);
		//p1.add(label);
		
		//c.add(p1);
		c.add(start);
		c.add(stop);
		c.add(label);
		
		
		myListener ml = new myListener(this);
		start.addActionListener(ml);
		stop.addActionListener(ml);
		
		
		
	}
	public  void  lauf(){
		for (int time= 0; time< 10 ; time++){
			try {
				Thread.sleep(1000);
				System.out.println(time);
				 label.setText(""+time); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(time);
			// label.setText(""+time); 
			 
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopUhr su = new StopUhr();
				su.setVisible(true);

	}

}
