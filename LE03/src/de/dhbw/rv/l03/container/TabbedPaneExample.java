package de.dhbw.rv.l03.container;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPaneExample extends JFrame {

	public TabbedPaneExample() {
		super("TabbedPane Example");
		setSize(500, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.add("Tab No. 1", new JButton("Eins"));
		jtp.add("Tab No. 2", new JButton("Zwei"));
		jtp.add("Tab No. 3", new JButton("Drei"));
		
		Container c = getContentPane();
		c.add(jtp);
	}
	
	public static void main(String[] args) {
		TabbedPaneExample tpe = new TabbedPaneExample();
		tpe.setVisible(true);
	}

}
