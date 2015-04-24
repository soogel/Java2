import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// Konkrete Klasse eines Zoos:
// • besitzt ein Array aus Lebewesen (Creatures)
// • kann eine Aufstellung aller enthaltenen Lebewesen ausgeben (listAllCreatures())
// • kann alle enthaltenen Lebewesen füttern (feedAllCreatures())
public class Zoo {

	//
	// Attribute
	//
	
	//private Creature[] creatures = new Creature[1000];
	private Collection <Creature> creatures = new ArrayList<>();
	
	
	//
	// Methoden
	//
	public void addAllCreatures() {
		System.out.println("Zoo: adding creatures");
		creatures.add(new Duck("Freddy", 2, false));
		creatures.add(new Duck("Tina", 1, true));
		creatures.add(new Duck("Klara", 2, true));
		creatures.add(new Duck("Johnny", 2, false));
		creatures.add(new Ostrich("Carlos", 5,false));
		creatures.add(new Grass());
		creatures.add(new Worm());
		System.out.println("Zoo: added "+ creatures.size()+ " creature  ");
		
		Map<Duck, String> comments = new HashMap<>();
		Duck freddy = new Duck("Freddy", 2, false);
		comments.put(freddy, "Freddy ist sehr zutraulich");
		comments.put(freddy, "Freddy ist sehr zutraulich");
		//System.out.println("xx: "+ comments.get(freddy));
		
		Map<String, Duck> map = new HashMap <>();
		map.put ("Freddy", freddy);
		map.put("Die kleine Ente", freddy);
			//	System.out.println("XY: " + map.get("Freddy"));
		
		Set<String> keySet = map.keySet();
		for (String key : keySet){
			Duck duck = map.get(key);
			
			System.out.println(duck.toString());
			//System.out.println(map.get(key));
			
		}
		
		List <Double> spritList = new ArrayList<>();
		spritList.add(new Double (1.30));
		spritList.add(1.30);				// Autoboxing
		spritList.add(new Double (1.55)); 	// manuelles Boxing
		double myEntry = 1.65;				// Autoboxing
		spritList.add(myEntry);

		for (Double s: spritList ) {
			System.out.println(s);
		}
		
			
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