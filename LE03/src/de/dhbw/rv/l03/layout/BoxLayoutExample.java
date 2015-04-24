package de.dhbw.rv.l03.layout;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutExample extends JFrame {
	
	public BoxLayoutExample() {
		super("Box Layout Example");
		setSize(300, 200);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		JButton b1 = new JButton("Eins");
		JButton b2 = new JButton("Zwei");
		JButton b3 = new JButton("Drei");
		JButton b4 = new JButton("Vier");
		JButton b5 = new JButton("... und Fünf");
		
		b1.setAlignmentX(CENTER_ALIGNMENT);
		b2.setAlignmentX(CENTER_ALIGNMENT);
		b3.setAlignmentX(CENTER_ALIGNMENT);
		b4.setAlignmentX(CENTER_ALIGNMENT);
		b5.setAlignmentX(CENTER_ALIGNMENT);
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(Box.createVerticalStrut(100));
		c.add(b4);
		c.add(b5);
	}

	public static void main(String[] args) {
		BoxLayoutExample ble = new BoxLayoutExample();
		ble.setVisible(true);
	}

}
