import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DiaLogSper extends JFrame{
	
	
	public DiaLogSper() {
		super("Event example");
		setSize(400, 300);
		setLocation(100,100);
		setTitle("DialogSper");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		
		// Erstellung der GUI
//		JButton button = new JButton("my Button");
//		c.add(button);
		
		
				JLabel jl = new JLabel("test");
				c.add(jl);
		c.setLayout(new FlowLayout());
		
		//Registrierung des ActionListeners
		DiaLogSperAc mAl = new DiaLogSperAc(null);
		c.addMouseListener(mAl);
		
	}
	

	public static void main(String[] args) {
		DiaLogSper eeff = new DiaLogSper();
		eeff.setVisible(true);
		
		//DiaLogSperDia dlsd = new DiaLogSperDia(eeff);
		//dlsd.setVisible(true);

	}

}
