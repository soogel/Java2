import java.awt.Point;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class DiaLogSperDia extends JDialog{
	public DiaLogSperDia(JFrame parent){
		super(parent);
		setSize(200, 100);
		setTitle("My First Dialog");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setModal(true);
		
		Point p = parent.getLocation();
		setLocation(p);
	}
}
