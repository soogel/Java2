package de.dhbw.rv.l03.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventExample2Listener implements ActionListener {
	
	private EventExample2 parent;

	public EventExample2Listener(EventExample2 parent) {
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(parent, "Button wurde geklickt");
	}
	
}




