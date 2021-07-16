package com.xworkz.groups;

public class EqualsTester {

	public static void main(String[] args) {
		
		String name="Xworkz";
		String institute="Xworkz";
		
		if(name==institute)//true
		{
			System.out.println("name & institute is same");
		}
		
		String center=new String("Xworkz");
		if(name==center)//true
		{
			System.out.println("name & center is same");
		}
		
		if(name.equals(center))
		{
			System.out.println("name and center content is same");
		}

	}

}
