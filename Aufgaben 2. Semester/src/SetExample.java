import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		mySet.add(101);
		mySet.add(4711);
		mySet.add(815);
		mySet.add(42);
		mySet.add(122);
		mySet.add(4711);
		mySet.add(815);
		mySet.add(42);
		
		for(Integer i : mySet){
			System.out.println(i);
		}
			
			for (Iterator<Integer> it = mySet.iterator(); it.hasNext(); ){
				Integer i = it.next();
				System.out.println(i);
				
				//Löschen über Iterator
				if (i == 42) it.remove();
		}
			
			//Wert in Collection			
			System.out.println(mySet.contains(4711));
			System.out.println(mySet.contains(100000));
			

	}

}
