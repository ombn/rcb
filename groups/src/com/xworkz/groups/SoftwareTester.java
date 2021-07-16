package com.xworkz.groups;

import com.xworkz.groups.dto.SoftwareDTO;

public class SoftwareTester {

	public static void main(String[] args) {

		SoftwareDTO softwareDTO = new SoftwareDTO(95, "20.01", "Whatsapp", "Faceboo");

		SoftwareDTO softwareDTO1 = new SoftwareDTO(95, "20.01", "Whatsapp", "Facebook");

		System.out.println(softwareDTO == softwareDTO1);

		System.out.println(softwareDTO.getVersion() == softwareDTO1.getVersion());

		System.out.println(softwareDTO.equals(softwareDTO1));// null, any ref

	}

}
