import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Fenster extends JFrame {
	
	public Fenster() {
		super("Fenster");
		setSize(450, 250);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new JLabel("Hello world"));
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Fenster mfjf = new Fenster();
		mfjf.setVisible(true);
		
		MyFirstDialog mdf = new MyFirstDialog(mfjf);
		mdf.setVisible(true);
		
		
		

	}

}
