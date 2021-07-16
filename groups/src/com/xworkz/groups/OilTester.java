package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.groups.constants.OilColor;
import com.xworkz.groups.constants.OilType;
import com.xworkz.groups.dto.OilDTO;

public class OilTester {

	public static void main(String[] args) {

		OilDTO dto = new OilDTO("Gold Winner", OilType.SUNFLOWER, 170D, OilColor.GOLD, true, true, true, 99D);

		OilDTO dto1 = new OilDTO("Bajaj", OilType.ALMOND, 1000D, OilColor.GOLD, true, false, false, 99D);

		OilDTO dto2 = new OilDTO("dabur", OilType.NAVARATNA, 2D, OilColor.RED, true, false, false, 70D);

		

		Collection<OilDTO> collection = new ArrayList<OilDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto2);
		
		System.out.println("size"+collection.size());
		
		boolean r=collection.remove(dto2);// ???
		System.out.println(r);
		
		
		//collection.isEmpty()

		
	
		
	}

}
