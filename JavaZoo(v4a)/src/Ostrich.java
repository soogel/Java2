import java.util.Set;

// Konkrete Klasse für Vogel-Strauße:
// • können nicht fliegen (kein Flyable)
// • sind Pflanzenfresser (Herbivore)
// • sind genießbare Tiere (CarnivoreEatable)
public class Ostrich extends Bird implements Herbivore, CarnivoreEatable {
	
	//
	// Konstruktor
	//
	public Ostrich(String name, int age, boolean female) {
		setName(name);
		setAge(age);
		setFemale(female);
	}
	
	//
	// Methoden
	//
	public Set<Bird> layEggs() {
		// TODO: diese Methode implementieren
		return children;
	}
	
	public void eat(HerbivoreEatable eatable) {
		System.out.println(getName() + ": eating a " + eatable.getClass().getSimpleName());
	}
	
	public void makeNoise() {
		System.out.println(getName() + ": guuuuh!");
	}
}
