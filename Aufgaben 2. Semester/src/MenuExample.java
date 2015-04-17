import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MenuExample extends JFrame {
public MenuExample(){
	
	super("MenuExample");
	setSize(500,300);
	setLocation(200,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//1. Schritt JMenu erstellen
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("Datei");
	JMenuItem open = new JMenuItem("Öffnen");
	open.setActionCommand("open");
	JMenuItem save = new JMenuItem("save");
	open.setActionCommand("save");
	open.addActionListener(new MenuActionListener());
	save.addActionListener(new MenuActionListener());
	
	JMenu lastOpend = new JMenu("Zuletzt..");
	JMenuItem d1 = new JMenuItem("Test.java");
	JMenuItem d2 = new JMenuItem("Test.java");
	
	lastOpend.add(d1);
	lastOpend.add(d2);
	
	//MenuITEM DEM jmENU dATEI ZUORDNEN
	fileMenu.add(open);
	fileMenu.add(save);
	fileMenu.add(lastOpend);
	
	// Shortcuts
	KeyStroke ksSave = KeyStroke.getKeyStroke('S' InputEvent.CTRL_MASK);
	save.setAccelerator(ksSave);
	
	
	
	
	// Datei Menü der MenuBar hinzufügen
	menuBar.add(fileMenu);
	
	// JMenu Bar dem JFrame hinmzufügen
	setJMenuBar(menuBar);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuExample me =  new MenuExample();
		me.setVisible(true);

	}

}
