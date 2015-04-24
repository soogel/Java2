// Konkrete Klasse zum Testen des Zoos:
// • Einstiegspunkt des Programms über die Main-Methode
// • erstellt ein Zoo-Objekt und ruft einige Methoden darauf auf
public class ZooTest {

	public static void main(String[] args) {
		new ZooTest().run();
	}
	
	public void run() {
		Zoo zoo = new Zoo();
		zoo.addAllCreatures();
		
		System.out.println("[1] ---------------");
		zoo.listAllCreatures();
		System.out.println("[2] ---------------");
		zoo.breedingSeason();
		System.out.println("[3] ---------------");
		zoo.listAllCreatures();
		System.out.println("[4] ---------------");
		zoo.breedingSeason();
	}
	
}

