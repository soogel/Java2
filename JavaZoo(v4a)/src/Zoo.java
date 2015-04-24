import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

// Konkrete Klasse eines Zoos:
// • besitzt ein Array aus Lebewesen (Creatures)
// • kann eine Aufstellung aller enthaltenen Lebewesen ausgeben (listAllCreatures())
// • kann alle enthaltenen Lebewesen füttern (feedAllCreatures()) 
public class Zoo {
Collection<Creature> creatures = new HashSet<>();
Duck tina = new Duck ("Tina", 1, true);
		
	public void addAllCreatures() {
		
		creatures.add(tina);
		creatures.add(new Duck("Freddy", 1, false));
	}
	public void listHalfTheBirds(){
		List<Bird> halfTheBirds = new LinkedList<Bird>();
		halfTheBirds.add(tina);
	
		List<Bird> tinasDaughters = tina.getChildren(true);
		for (int i=0; i<tinasDaughters.size()/2; i++) {
			Bird tinasDaughter = tinasDaughters.get(i);
			halfTheBirds.add(tinasDaughter);
			halfTheBirds.addAll(tinasDaughter.getAllDescendants());
		}
		
		List<Bird> tinasSons = tina.getChildren(false);
		for (int i=0; i<tinasSons.size()/2; i++){
			Bird tinasSon = tinasSons.get(i);
			halfTheBirds.add(tinasSon);
		}
		
		System.out.println("HalfTheBirds ("+halfTheBirds.size()+"):");
		for (Bird bird: halfTheBirds) {
			System.out.println(bird.toString());
		}
	}
	public void listCreatureCount() {
		System.out.println("# Creature-Count: "+ creatures.size());
	}
	// In der Brutzeit sollen alle Tiere Nachkommen zeugen
	// und damit deren Population vergrößern:
	public void breedingSeason() {
		System.out.println("Breeding Season!");
		
		// Alle neuen Kinder werden in diesem Set gespeichert:
		Collection<Creature> allNewKids = new HashSet<Creature>();
		
		for (Creature creature : creatures) {
			// Jedes Lebewesen altert um ein Jahr:
			creature.setAge(creature.getAge() + 1);

			if (creature instanceof Bird) {
				Bird bird = (Bird) creature;
				// weibliche, kinderlose Vögel legen Eier: 
				if (bird.isFemale() && bird.getChildren().isEmpty()) {
					Collection<Bird> kids = bird.layEggs();
					allNewKids.addAll(kids);
					// man könnte auch schreiben:
					// allNewKids.addAll(bird.layEggs());
				}
			}
		}
		
		// Füge alle neuen Kinder der Creatures-Collection hinzu:
		creatures.addAll(allNewKids);
	}
	
	public void listAllCreatures() {
		System.out.println("Zoo: list of all creatures:");
		for (Creature creature : creatures) {
			if (creature != null) {
				System.out.println(creature);
			}
		}
	}
	
	public void feedAllCreatures() {
		System.out.println("Zoo: feeding all creatures");
	}

}