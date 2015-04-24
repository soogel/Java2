// Lebewesen
// • umfasst Tiere, Pflanzen, Pilze und Einzeller
// • haben ein Alter (age)
public class Creature {

	//
	// Attribute
	//
	private int age = 0;
	
	
	//
	// Akzessoren
	//
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 30) {
			this.age = age;
		} else {
			System.err.println("ERROR: Invalid Age: " + age);
		}
	}
	
}
