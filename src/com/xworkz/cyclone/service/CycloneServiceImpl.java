package com.xworkz.cyclone.service;

import com.xworkz.cyclone.dao.CycloneDAO;
import com.xworkz.cyclone.dao.CycloneDAOImpl;
import com.xworkz.cyclone.dto.CycloneDTO;

public class CycloneServiceImpl implements CycloneService {

	private CycloneDAO cycloneDAO=new CycloneDAOImpl(); 
	
	public CycloneServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public void validateAndCreate(CycloneDTO cycloneDTO) {

		System.out.println("START : validateAndCreate " + cycloneDTO);

		try {
             boolean valid=false;
			if (cycloneDTO != null) {
				System.out.println("cycloneDTO is not null, can save ");
           
				String name = cycloneDTO.getName();
					name=name.trim();
				if (name != null && !name.isEmpty() ) {
					System.out.println("name is valid");
					valid=true;
				}
				else{
					System.out.println("name is invalid");
				}
				
				int speed=cycloneDTO.getSpeed();
				
				if(valid && speed>0)
				{
					System.out.println("speed is valid");
					valid=true;
				}
				else{
					System.out.println("speed in invalid");
					valid=false;
				}
				
				boolean dm=cycloneDTO.isDisasterManagement();
				
				if(valid  && dm)
				{
					System.out.println("dm is valid");
					valid=true;
				}
				else{
					System.out.println("dm is invalid");
					valid=false;
				}
				
				
				if(valid)
				{
					System.out.println("data is valid , saving using DAO");
					
					cycloneDAO.create(cycloneDTO);
				}
				

			} else {
				System.out.println("cycloneDTO is null and cannot save ");
			}

		} catch (Exception e) {
			System.err.println("Excception in validateAndCreate " + e.getMessage());
		}

		System.out.println("END : validateAndCreate " + cycloneDTO);
	}

}
