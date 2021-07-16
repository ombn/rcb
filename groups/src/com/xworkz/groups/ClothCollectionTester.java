package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothCollectionTester {

	public static void main(String[] args) {
		
		
		String silk="silk";
		String polyster="polyster";
		String cotton="cotton";
		String nylon="nylon";
        String synthetic="synthetic";
        String denim="denim";
        String velvet="velvet";
        String satin="satin";
        String woolen="woolen";
       
        //NOTE: YOU CANNOT ADD PRIMITIVE INTO COLLECTION
        // Auto-Boxing
        int marks=67;
		Collection<String> collection=new ArrayList<String>();
       collection.add(silk);
       collection.add(polyster);
       //collection.add(9986667354l);// WC Long
      // collection.add(67);// WC Integer
       
       Iterator<String> itr=collection.iterator();
       
       while(itr.hasNext())
       {
    	   String value=itr.next();
    	   System.out.println(value);
       }
       
       System.out.println("*********************");
       //Generics
       
    
       
	}
	
	
	
	public static Collection getCollection()
	{
		Collection coll=new ArrayList();
		coll.add(true);
		coll.add(false);
		coll.add("something");
		coll.add(89);
		coll.add(null);
		return coll;
		
	}

}
