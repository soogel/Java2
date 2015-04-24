import java.util.Set;

// Konkrete Klasse für Kolibris:
// • können fliegen (Flyable)
// • ernähren sich ausschließlich von Pflanzennektar (kein Herbivore)
// • sind genießbare Tiere (CarnivoreEatable)
public class Hummingbird extends Bird implements Flyable, CarnivoreEatable {

	//
	// Konstruktor
	//
	public Hummingbird(String name, int age, boolean female) {
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
	
	public void fly() {
		System.out.println(getName() + ": flying");
	}
	
	public void eat(FlowerNectar eatable) {
		System.out.println(getName() + ": eating " + eatable.getClass().getSimpleName());
	}

	public void makeNoise() {
		System.out.println(getName() + ": wheee!");
	}
	
}
