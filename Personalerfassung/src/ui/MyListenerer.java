package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.modell.Person;

public class MyListenerer implements ActionListener{
	FramePersonenerfassung fpf2;
	public MyListenerer(FramePersonenerfassung fpf){
		fpf2=fpf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		Person pp = new Person();
		pp.setNachname(fpf2.getNachnamefield().getText()) ;
		pp.setVorname(fpf2.getVornamefield().getText()) ;
		
		
		
		
	}
	

}
