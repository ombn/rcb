package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GroupsTester {

	public static void main(String[] args) {

		String chemical1 = "carbonmono";
		String chemical2 = "sulphur";
		String chemical3 = "Sodium Hydroxide";
		String chemical4 = "Chloride";
		String chemical5 = "Phosporus";
		String chemical6 = "cynadice";
		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(chemical2);// values
		added = collection.add(chemical4);
		added = collection.add(chemical6);
		added = collection.add(chemical5);
		added = collection.add(chemical3);
		added = collection.add(chemical1);
		added = collection.add("Sodium Chloride");
		System.out.println(added);
		int total = collection.size();
		System.out.println(total);
		String check = "Sodium Chloride";
		boolean contain = collection.contains(check);
		System.out.println("contain" + contain);
		boolean removed = collection.remove("Chilli Powder");
		collection.add(1991);
		Iterator iterator = collection.iterator();// impl Iterator
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println(obj);
		// sulphur,chloride,cynadice,phosporus,Sodium Hydroxide,carbonmono,Sodium
		// Chloride
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		Object secret = iterator.next();
		System.out.println("Secret" + secret); // Chloride = Girija, Phos= Chitra, Shatanu , Rakshita

	}

}
