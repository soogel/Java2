import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class EventExampleFrame extends JFrame{
	
	
	
	public EventExampleFrame() {
		super("Event example");
		setSize(200, 100);
		setLocation(100,100);
		setTitle("My First Dialog");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		
		// Erstellung der GUI
		JButton button = new JButton("my Button");
		c.add(button);
		c.setLayout(new FlowLayout());
		
		//Registrierung des ActionListeners
		MyActionListen mAl = new MyActionListen();
		button.addActionListener(mAl);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventExampleFrame eef = new EventExampleFrame();
		eef.setVisible(true);

	}

}
