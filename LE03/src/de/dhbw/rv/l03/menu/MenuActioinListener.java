package de.dhbw.rv.l03.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActioinListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("O")) {
			System.out.println("Öffnen");
		}
		else if (e.getActionCommand().equals("S")) {
			System.out.println("Save");
		}

	}

}
