package de.dhbw.rv.l02.collection.studierender;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Studentenverwaltung {

	public static void main(String[] args) {
		
		Set<Student> studenten = new HashSet<>();
		
		Date d = new Date();
		
		studenten.add(new Student("Michael", "Mustermann", "WI2014-2", d));
		studenten.add(new Student("Michaela", "Mustermann", "WI2014-2", d));
		studenten.add(new Student("Daniel", "Düsentrieb", "WI2014-2", d));
		studenten.add(new Student("Martin", "Muster", "WI2014-2", d));
		studenten.add(new Student("Martina", "Musterfrau", "WI2014-2", d));
		
		studenten.add(new Student("Michael", "Mustermann", "WI2014-2", d));
		studenten.add(new Student("Michaela", "Mustermann", "WI2014-2", d));
		studenten.add(new Student("Daniel", "Düsentrieb", "WI2014-2", d));
		studenten.add(new Student("Martin", "Muster", "WI2014-2", d));
		studenten.add(new Student("Martina", "Musterfrau", "WI2014-2", d));
		
		
		for (Student s : studenten) {
			System.out.println(s.getVorname() + " " + s.getNachname());
		}
		
		System.out.println("=============================================");
		
		Set<Student> treeSet = new TreeSet<>(studenten);
		
		for (Student s: treeSet) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Testen der Eigenschaften der equals Methode im Student:
		Student s1 = new Student("Michael", "Mustermann", "WI2014-2", d);
		Student s2 = new Student("Michael", "Mustermann", "WI2014-2", d);
		Student s3 = new Student("Michael", "Mustermann", "WI2014-2", d);
		
		assert(s1.equals(s1));
		assert(s1.equals(s2) == s2.equals(s1));
		assert(s1.equals(s2) && s2.equals(s3) && s1.equals(s3));
		
		

	}

}
