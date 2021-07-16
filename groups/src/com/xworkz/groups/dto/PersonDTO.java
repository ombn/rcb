package com.xworkz.groups.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable,Comparable<PersonDTO> {

	private String name;
	private int age;

	public PersonDTO() {

	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(PersonDTO other) {
		
		int ageOfOther=other.getAge();
		if(this.age==ageOfOther)return 0;
		if(this.age>ageOfOther)return -1;
		if(this.age<ageOfOther)return 1;
		return 0;
	}

	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
