import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Studentenverwaltung {
	public static void main(String[] args) {

		Set<Studierender> studenten = new HashSet<>();

		studenten.add(new Studierender("Michael", "Mustermann", "WI2014-2",	new Date()));
		studenten.add(new Studierender("Michaela", "Mustermann", "WI2014-2", new Date()));
		studenten.add(new Studierender("Daniel", "Düsentrieb", "WI2014-2", new Date()));
		studenten.add(new Studierender("Martin", "Muster", "WI2014-2", new Date()));
		studenten.add(new Studierender("Martina", "Musterfrau", "WI2014-2", new Date()));

		studenten.add(new Studierender("Michael", "Mustermann", "WI2014-2", new Date()));
		studenten.add(new Studierender("Michaela", "Mustermann", "WI2014-2", new Date()));
		studenten.add(new Studierender("Daniel", "Düsentrieb", "WI2014-2", new Date()));
		studenten.add(new Studierender("Martin", "Muster", "WI2014-2", new Date()));
		studenten.add(new Studierender("Martina", "Musterfrau", "WI2014-2", new Date()));

		Studierender s1 = new Studierender("Michael", "Mustermann", "WI2014-2", new Date());
		Studierender s2 = new Studierender("Michael", "Mustermann", "WI2014-2", new Date());
		Studierender s3 = new Studierender("Martin", "Muster", "WI2014-2", new Date());

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		for (Studierender s : studenten) {
			System.out.println(s.getVorname() + " " + s.getNachname());
		}
		
		System.out.println("=========================================================");
		
		Set<Studierender> treeSet = new TreeSet<>(studenten);
		
		for (Studierender s : treeSet) {
			System.out.println(s);
		}
	}
}