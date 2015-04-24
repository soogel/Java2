// Konkrete Klasse für Graspflanzen:
// • Nahrung für Pflanzenfresser (Herbivore) und
//   damit gleichzeitig auch Nahrung für Allesfresser (Omnivore).
// • hat standardmäßig das Alter 0. 
public class Grass extends Plant implements HerbivoreEatable {

	//
	// Konstruktor
	//
	public Grass() {
		setAge(0);
	}
	
}
