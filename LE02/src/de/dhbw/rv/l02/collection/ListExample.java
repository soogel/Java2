package de.dhbw.rv.l02.collection;

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
		
		// ----------------------------
		// Daten auslesen:
		System.out.println(myList.get(0));
		
		// Auslesen über klassiche for-Schleife:
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		// Auslesen über for-each
		for (String s : myList) {
			System.out.println(s);
		}
		
		// Auslesen über Iterator:
		Iterator<String> it = myList.iterator();
		while(it.hasNext())  {
			String s = it.next();
			System.out.println(s);
		}

	}

}
