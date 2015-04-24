package de.dhbw.rv.l03.ex;

import java.awt.Container;
import java.awt.Point;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExDialog extends JDialog {
	
	public ExDialog(JFrame parent) {
		super(parent);
		setSize(200, 100);
		setTitle("My First Dialog");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setModal(true);
		
		Point p = parent.getLocation();
		setLocation(p);
		
		Container c = getContentPane();
		c.add(new JLabel("Sie sind mit der Maus über den Text gefahren"));
	}
}
