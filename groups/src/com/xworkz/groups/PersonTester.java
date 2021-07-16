package com.xworkz.groups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.groups.dto.PersonDTO;

public class PersonTester {

	public static void main(String[] args) {
	
		PersonDTO dto1=new PersonDTO("Aishwarya", 21);
		PersonDTO dto2=new PersonDTO("Darshan", 23);
		PersonDTO dto3=new PersonDTO("Sunil", 26);
		PersonDTO dto4=new PersonDTO("Sachin", 24);
		
		List<PersonDTO> list=new ArrayList<>();
		list.add(dto1);
		list.add(dto3);
		list.add(dto2);
		list.add(dto4);
		
		
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
				
		Collections.sort(list);//List Impl
		
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
	}

}
