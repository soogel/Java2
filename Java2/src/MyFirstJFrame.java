import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFirstJFrame extends JFrame {
	
	public MyFirstJFrame() {
		super("Mein erstes Windows-Fenster");
		setSize(480, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new JLabel("My first Label"));
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MyFirstJFrame mfjf = new MyFirstJFrame();
		mfjf.setVisible(true);
		

	}

}
