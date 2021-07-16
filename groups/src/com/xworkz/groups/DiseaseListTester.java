package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DiseaseListTester {

	public static void main(String[] args) {

		List<String> diseases = new ArrayList<String>();
		diseases.add("Corona");
		diseases.add("HIV");
		diseases.add("Blood Cancer");
		diseases.add("Dengue");
		diseases.add("Brain Tumour");
		;
		diseases.add("Diabeties");
		diseases.add("Thyroid");
		diseases.add("Sleeping-Pavitra");
		System.out.println(diseases.size());

		// for-each, for-loop, iterator,listIterator

		Iterator<String> disItr = diseases.iterator();
		while (disItr.hasNext()) {
			String string = disItr.next();
			System.out.println(string);
		}
//The method sort(List<T>) in the type Collections is not applicable for the arguments (Collection<String>)
		Collections.sort(diseases);

		System.out.println("Below data is sorted");

		for (int z = 0; z < diseases.size(); z++) {

			if ("HIV".equals(diseases.get(z))) {
				System.out.println("HIV is found in indez" + z);
				diseases.remove(z);
			}
			System.out.println(diseases.get(z));
		}
	}

}
