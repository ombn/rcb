package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ListTester {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<String>();
		list.add("ISE");
		list.add("CSE");
		list.add("ME");
		list.add("CV");
		list.add("ECE");
		list.add("EEE");		
		list.add("AE");
		list.add("AU");
		list.add("CE");
		list.add("BT");
		list.add("TP");
		list.add("TC");
		list.add("BC");	
		// add(i,e),get(i), indexOf,remove
		System.out.println(list.get(8));
		
		list.add(8, "IT");				
		System.out.println(list.get(8));
		
		int indexOfBC=list.indexOf("EX");
		System.out.println(indexOfBC);
		
		
		System.out.println(list.size());
		
		
		ListIterator<String> itr=list.listIterator(50);// 14
		
		System.out.println("ITR Index "+itr.nextIndex());
		while(itr.hasPrevious())
		{	
			String e=itr.previous();			
			System.out.println(e);
		}
		System.out.println("**************************");
		while (itr.hasNext()) {
			String string =  itr.next();
			System.out.println(string);
			
		}
		
	
		System.out.println(list.size());
		
	}

}
