package com.xworkz.cyclone;

import com.xworkz.cyclone.dto.CycloneDTO;
import com.xworkz.cyclone.service.CycloneService;
import com.xworkz.cyclone.service.CycloneServiceImpl;
import com.xworkz.cyclone.singleton.SFUtil;

public class CycloneTester {

	public static void main(String[] args) {

		try {
			CycloneDTO cycloneDTO1 = new CycloneDTO("Tsunami", 70, true, 150);					
			CycloneService cycloneService=new CycloneServiceImpl();			
			cycloneService.validateAndCreate(cycloneDTO1);
			
		} finally {
			SFUtil.closeFactory();
		}

	}

}
