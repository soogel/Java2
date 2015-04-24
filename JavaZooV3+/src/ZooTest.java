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
		//zoo.listAllCreatures();
	}
	
}
