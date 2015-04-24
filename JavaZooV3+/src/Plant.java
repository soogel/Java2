// Abstrakte Klasse für Pflanzen:
// • Pflanzen sind Lebewesen mit Zellkern (Eukaryoten)
public abstract class Plant extends Creature {

	public String toString() {
		return "I'm a " +  getClass().getSimpleName()
				+ " and I'm " + getAge() + " years old.";
	}
	
}
