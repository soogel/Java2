import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Abstrakte Klasse für Vögel:
// • haben ein Geschlecht (female: true/false)
// • haben ein Set an direkten Nachkommen (children - kann leer sein falls männlich oder kinderlos)
// • können Eier legen (layEggs()) - erzeugt ein Set aus Nachkommen desselben Typs
// • können mit den Flügeln flattern (flapWings())
// • können artspezifische Geräusche erzeugen (makeNoise())
public abstract class Bird extends Animal {
	
	
	public List<Bird> getAllDescendants(){
	List<Bird> descendants = new LinkedList<Bird>();
	
	for (Bird child : children){
		descendants.add(child);
		
		descendants.addAll(child.getAllDescendants());
	}
	return descendants;
	}
	
	public List<Bird > getChildren (boolean female ){
		List<Bird> filteredChildren = new LinkedList<Bird>();
		for (Bird child : children) {
			if (child.isFemale() == female){
				filteredChildren.add(child);
				}
		}
		return filteredChildren;
	}
	
	
	//
	// Attribute
	//
	boolean female = false;
	Set<Bird> children = new HashSet<Bird>();
	
	//
	// Methoden
	//
	public abstract Set<Bird> layEggs();
	
	public abstract void makeNoise();

	public void flapWings(int flapCount) {
		for (int i=1; i<=flapCount; i++) {
			System.out.println(getName() + ": flap #" + i);
		}
	}
	
	
	//
	// Akzessoren
	//
	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}
	
	public Set<Bird> getChildren() {
		return children;
	}
	
}

