// Konkrete Klasse für einen Wurm:
// • Nahrung für Fleischfresser (Carnivore) und
//   damit gleichzeitig auch Nahrung für Allesfresser (Omnivore).
// • hat keinen richtigen Namen, sondern nur eine zufällig vergebene Nummer.
// • hat standardmäßig das Alter 0.
public class Worm extends Animal implements CarnivoreEatable {
	
	//
	// Konstruktor
	//
	public Worm() {
		int wormNumber = (int) (Math.random() * 10000);
		setName("Crawly-" + wormNumber);
		setAge(0);
	}
	
}
