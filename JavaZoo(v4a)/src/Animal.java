// Abstrakte Klasse für Tiere
// • Lebewesen (Creature), welche atmen
// • haben einen Namen (name) und können diesen aufsagen (sayName())
// • können sich bewegen (move())
public abstract class Animal extends Creature {

	//
	// Attribute
	//
	private String name = "?";

	
	//
	// Methoden
	//
	public void move() {
		System.out.println(getName() + ": moving");
	}
	
	public void sayName() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "I'm " + getName()
				+ " the " + getClass().getSimpleName()
				+" and I'm " + getAge() + " years old.";
	}

	
	// 
	// Akzessoren
	//
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 1 && name.length() < 100
				&& name.matches("[\\w \\.#-]+")) {
			this.name = name;
		} else {
			System.err.println("ERROR: Invalid Name: " + name);
		}
	}

}
