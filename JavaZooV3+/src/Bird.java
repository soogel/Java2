import java.util.HashSet;
import java.util.Set;

// Abstrakte Klasse für Vögel:
// • können mit den Flügeln flattern (flapWings())
// • können Eier legen (layEggs())
// • können artspezifische Geräusche erzeugen (makeNoise())
public abstract class Bird extends Animal {
	
	//
	// Attribute
	//
	
	private boolean female = false;
	 Set <Bird > children = new HashSet<>();
	
	
	
	//
	// Methoden
	//
	public void flapWings(int flapCount) {
		for (int i=1; i<=flapCount; i++) {
			System.out.println(getName() + ": flap #" + i);
		}
	}
	
	public abstract Set<? extends Bird> layEggs() ;
	
	public abstract void makeNoise();
	
	//
	// Akzessor
	//
	
	
	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public Set <Bird > getChildren() {
		return children;
	}

	public void setChildren(Set <Bird > children) {
		this.children = children;
	}
	
}
