package de.dhbw.rv.l03.menu;

import java.awt.event.InputEvent;
import java.security.KeyStore;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuExample extends JFrame {
	
	public MenuExample() {
		super("Menu Example");
		setSize(400, 200);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//1. Schritt JMenuBar Erstellen
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Datei");
		fileMenu.setMnemonic('D');
		JMenuItem open = new JMenuItem("Öffnen");
		open.setActionCommand("O");
		open.addActionListener(new MenuActioinListener());
		JMenuItem save = new JMenuItem("Speichern");
		save.setActionCommand("S");
		save.addActionListener(new MenuActioinListener());
		
		JMenu lastOpend = new JMenu("Zuletzt geöffnet...");
		JMenuItem d1 = new JMenuItem("Test.java");
		JMenuItem d2 = new JMenuItem("Layout.java");
		
		lastOpend.add(d1);
		lastOpend.add(d2);
		
		// MenuItems dem JMenu Datei zuordnen:
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(lastOpend);
		
		// Shortcuts definieren
		KeyStroke ksOpen = KeyStroke.getKeyStroke('O', InputEvent.CTRL_MASK);
		open.setAccelerator(ksOpen);
		
		// Mnemonic Key definieren: Aufrufbar über ALT + Key:
		open.setMnemonic('Ö');
		
		KeyStroke ksSave = KeyStroke.getKeyStroke('S', InputEvent.CTRL_MASK);
		save.setAccelerator(ksSave);
		save.setMnemonic('S');
		
		// Datei Menü der MenuBar hinzufügen
		menuBar.add(fileMenu);
		// JMenu Bar dem JFrame Hinzufügen
		setJMenuBar(menuBar);
		
		
		
	}

	public static void main(String[] args) {
		MenuExample me = new MenuExample();
		me.setVisible(true);
	}

}
