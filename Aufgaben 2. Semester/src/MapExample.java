import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<>();
		
		//Werte einfügen:
		myMap.put("Michael", 23);
		myMap.put("Michaela",  32);
		myMap.put("Bärbel", 19);
		myMap.put("Horst", 21);
		myMap.put("Horst", 31);
		
		//Auslesen der Map:
		System.out.println(myMap.get("Horst"));
		
		//Alle Schlüssel auslesen
		Set<String> keys = myMap.keySet();
		for (String key : keys){
			System.out.println(key);
		}
		//Alle Einträge auslesen
		Collection<Integer> values = myMap.values();
		for (Integer i : values){
			System.out.println(i);
		}
		
		Set<Entry<String, Integer>> entries = myMap.entrySet();
		for (Entry<String, Integer> e : entries){
			System.out.println(e);
			e.getKey();
			e.getValue();
		}

	}

}
