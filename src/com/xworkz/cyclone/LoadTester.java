package com.xworkz.cyclone;

import com.xworkz.cyclone.dao.CycloneDAO;
import com.xworkz.cyclone.dao.CycloneDAOImpl;
import com.xworkz.cyclone.dto.CycloneDTO;
import com.xworkz.cyclone.singleton.SFUtil;

public class LoadTester {

	
	public static void main(String[] args) {
		
		
		CycloneDAO dao=new CycloneDAOImpl();
		
		CycloneDTO entity=((CycloneDAOImpl)dao).differenceBetweenGetAndLoad(501);
		System.out.println(entity);		
		SFUtil.closeFactory();		
	}
}
