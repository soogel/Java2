package de.dhbw.rv.l02.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> myNameList = new TreeSet<>();
		
		myNameList.add(new String("Müller"));
		myNameList.add("Mayer");
		myNameList.add("Schmidt");
		myNameList.add(new String("Müller"));
		myNameList.add(new String("Müller"));
		myNameList.add("Schmidt");
		myNameList.add("schmidt");
		
		for (String s : myNameList) {
			System.out.println(s);
		}

	}

}
