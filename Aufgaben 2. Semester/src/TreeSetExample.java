import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> myNameList = new TreeSet<>();
		myNameList.add("M�ller");
		myNameList.add("Mayer");
		myNameList.add("Schmidt");
		myNameList.add("M�ller");
		myNameList.add("M�ller");
		myNameList.add("Schmidt");
		myNameList.add("schmidt");
		
		for (String s : myNameList){
			System.out.println(s);
		}
		
	}

}
