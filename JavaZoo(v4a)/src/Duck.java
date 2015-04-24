import java.util.Set;

// Konkrete Klasse für Enten:
// • können fliegen (Flyable)
// • sind Allesfresser (Omnivore)
// • sind genießbare Tiere (CarnivoreEatable)
public class Duck extends Bird implements Flyable, Omnivore, CarnivoreEatable {
	
	//
	// Konstruktor
	//
	public Duck(String name, int age, boolean female) {
		setName(name);
		setAge(age);
		setFemale(female);
	}

	//
	// Methoden
	//
	public Set<Bird> layEggs() {
		if (children.size() > 0) {
			System.out.println("ERROR: " + getName() + " cannot lay more eggs!");
		}
		if (isFemale()) {
			children.add(new Duck("Mikey", 0, false));
			children.add(new Duck("Lisa", 0, true));
			children.add(new Duck("Tobi", 0, false));
			children.add(new Duck("Cindy", 0, true));
			System.out.println(getName() + ": just laid " + children.size() + " eggs.");
		} else {
			System.out.println("ERROR: " + getName() + " I'm male and can't lay eggs!");
		}
		return children;
	}
	
	public void listAllChildren() {
		System.out.println(getName() + "'s children:");
		for (Bird child : children) {
			System.out.println(" - " + child);
		}
	}
	
	public void eat(Eatable eatable) {
		System.out.println(getName() + ": eating a " + eatable.getClass().getSimpleName());
	}

	public void fly() {
		System.out.println(getName() + ": flying...");
	}

	public void makeNoise() {
		System.out.println(getName() + ": quak, quak!");
	}

}
 

