import java.util.HashSet;
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
	public void eat(Eatable eatable) {
		System.out.println(getName() + ": eating a " + eatable.getClass().getSimpleName());
	}

	public void fly() {
		System.out.println(getName() + ": flying...");
	}

	public void makeNoise() {
		System.out.println(getName() + ": quak, quak!");
	}

	@Override
	public Set<Bird> layEggs() {
		Set<Bird> children = getChildren();
		if (isFemale() && children.isEmpty()){
			children.add(new Duck("Alfred", 0, false));
			children.add(new Duck("Roland", 0, false));
			children.add(new Duck("Beate", 0, true));
			children.add(new Duck("Chantalle", 0, true));
		} else {
			System.err.println("Cannot lay eggs!");
		}
		
		
		
		return children;
		
	}
	
	public void listAllChildren(){
		for (Bird child : children) {
			System.err.println(child);
		}
	}
}
 


