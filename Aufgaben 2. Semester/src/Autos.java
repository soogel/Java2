import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;


public class Autos {

	public static void main(String[] args) {

		Set<Fahrzeuge> fahrzeuge = new HashSet<>();
		
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 220));
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 220));
		fahrzeuge.add(new Fahrzeuge ("Audi", "Van", "gelb", 100, 125));
		fahrzeuge.add(new Fahrzeuge ("BMW", "Cabrio", "lintgruen", 180, 290));
		fahrzeuge.add(new Fahrzeuge ("BMW", "Cabrio", "lintgruen", 180, 290));
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 220));
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 220));
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 220));
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 220));
		fahrzeuge.add(new Fahrzeuge ("VW", "SUV", "schwarz", 140, 225));
		
		/*
		for (Fahrzeuge f : fahrzeuge) {
			JOptionPane.showMessageDialog(null, f.toString());
			System.out.println("Fabrikat: " + f.getHersteller() + ", " + "Typ: " + f.getTyp() + ", " + "Farbe: " + f.getAussenfarbe() + ", " + "KW: " + f.getKw() + ", " + "Höchstgeschwindigkeit: " + f.getHoechstgeschwindigkeit());
		}
		*/
		
		Set<Fahrzeuge> treeSet = new TreeSet<>(fahrzeuge);
		
		JOptionPane.showMessageDialog(null, treeSet);
		
		for (Fahrzeuge f: treeSet) {
			System.out.println(f);
		}
		System.out.println("=================================");
		
		TreeSet<Fahrzeuge> ts2 = new TreeSet<>(new FahrzeugeKwComparator());
		ts2.addAll(treeSet);
		for (Fahrzeuge f:ts2) {
			System.out.println(f);
		}

	}

}
