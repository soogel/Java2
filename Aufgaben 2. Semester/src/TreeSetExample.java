import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> myNameList = new TreeSet<>();
		myNameList.add("Müller");
		myNameList.add("Mayer");
		myNameList.add("Schmidt");
		myNameList.add("Müller");
		myNameList.add("Müller");
		myNameList.add("Schmidt");
		myNameList.add("schmidt");
		
		for (String s : myNameList){
			System.out.println(s);
		}
		
	}

}
