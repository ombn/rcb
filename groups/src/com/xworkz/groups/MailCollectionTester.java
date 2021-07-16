package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MailCollectionTester {

	public static void main(String[] args) {
		
		String ctc="contact@x-workz.in";
		String hr="hr@x-workz.in";
		String harsha="harsha.vardhan.xworkz@gmail.com";
		String dhanya="dhanya.xworkz@gmail.com";
		String ranjitha="ranjitha.xworkz@gmail.com";
		
		
		Collection<String> collection=new ArrayList<String>();
		collection.add(ranjitha);
		collection.add(ctc);
		collection.add(harsha);
		collection.add(dhanya);
		collection.add(hr);
		
		Iterator<String> itr=collection.iterator();
		
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}

	}

}
