import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class ListExample {

	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<>();
		
		//Daten einfügen:
		myList.add("Müller");
		myList.add("Mayer");
		myList.add("Schmidt");
		
		//-----------------------------------
		// Daten auslesen:
		//Var. 1
		System.out.println(myList.get(0));
		
		//Var. 2
		for (int i = 0; i < myList.size(); i++){
			System.out.println(myList.get(i));
		}
		
		//Var. 3
		for (String s: myList){
			System.out.println(s);
		}
		
		//Var. 4
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
				

	}

}