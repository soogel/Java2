import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class TabbedPaneExample extends JFrame{
	public TabbedPaneExample(){
		super("JScrollpane ex");
		setSize(300,200);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.add("Tab No. 1", new JButton("eins"));
		jtp.add("Tab No. 2", new JButton("zwei"));
		jtp.add("Tab No. 3", new JButton("drei"));
		
		Container c = getContentPane();
		c.add(jtp);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabbedPaneExample tpe = new TabbedPaneExample();
		tpe.setVisible(true);
	}

}
