import javax.swing.JFrame;


public class MyFirstJFrame extends JFrame {
	
	public MyFirstJFrame() {
		super("Mein erstes Windows-Fenster");
		setSize(480, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MyFirstJFrame mfjf = new MyFirstJFrame();
		mfjf.setVisible(true);
		

	}

}
