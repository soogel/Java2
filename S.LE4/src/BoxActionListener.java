//package de.dhbw.rv.personenerfassung.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//mport de.dhbw.rv.personenerfassung.modell.Person;

public class BoxActionListener implements ActionListener {

	private FramePersonenerfassung fpe;
	private PersonDao pDao;

	public BoxActionListener(FramePersonenerfassung fper) {
		fpe = fper;
		try {
			pDao = new PersonDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("OK!")) {
			Person tempPerson = new Person();
			tempPerson.setVorname(fpe.getVorname());
			tempPerson.setNachname(fpe.getNachname());
			System.out.println(tempPerson.getVorname() + " "
					+ tempPerson.getNachname());
			try {
				pDao.savePerson(tempPerson);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if (e.getActionCommand().equals("Abbruch")) {
			System.exit(0);
			try {
				pDao.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}





