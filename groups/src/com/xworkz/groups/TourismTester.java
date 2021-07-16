package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
import com.xworkz.groups.constants.TourismType;
import com.xworkz.groups.dto.TourismDTO;

public class TourismTester {

	public static void main(String[] args) {

		TourismDTO dto1 = new TourismDTO("Chamundi Hills", true, TourismType.TEMPLE, 1000, "MysorePak");
		TourismDTO dto2 = new TourismDTO("Maldives", true, TourismType.HONEYMOON, 5000, "SeaFood");
		TourismDTO dto3 = new TourismDTO("Dandeli", true, TourismType.ADVENTURE, 3000, "MANDAKI");
		TourismDTO dto4 = new TourismDTO("Murudeshwara", true, TourismType.BEACH, 2000, "SEAFOOD");
		TourismDTO dto5 = new TourismDTO("Goa", true, TourismType.BEACH, 3500, "ROS OMLETE");

		List<TourismDTO> list = new ArrayList<TourismDTO>();
		list.add(dto1);
		list.add(dto5);
		list.add(dto4);

		List<TourismDTO> list1 = new ArrayList<TourismDTO>();
		list1.add(dto2);
		list1.add(dto3);

		list1.addAll(list);
		System.out.println(list1);
		System.out.println(list1.size());

		boolean containsAll = list1.containsAll(list);
		System.out.println("containsAll" + containsAll);
		
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (List<TourismDTO>)
		//java.util.Collections.sort(list1);// list--> TourismDTO-->Comparable
		
		List<Integer> ageList=new ArrayList<Integer>();
		ageList.add(76);
		ageList.add(54);
		ageList.add(22);
	
		java.util.Collections.sort(list1);//list-->TourismDTO-->Comparable
		
		
		Iterator<TourismDTO> itr=list1.iterator();
		
		while (itr.hasNext()) {
			TourismDTO tourismDTO =  itr.next();
			System.out.println(tourismDTO.getPlace() + " "+tourismDTO.getCostEstimatePerHead());
			
		}
	}

}
