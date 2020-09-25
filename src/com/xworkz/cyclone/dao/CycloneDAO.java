package com.xworkz.cyclone.dao;

import java.util.List;

import com.xworkz.cyclone.dto.CycloneDTO;

public interface CycloneDAO {

	public void create(CycloneDTO entity);

	public void saveList(List<CycloneDTO> list);

	public CycloneDTO fetchById(int id);

	public CycloneDTO update(CycloneDTO cycloneDTO);
	
	public void updateAreaAffectedById(double area, int pk);

	public default void updateAreaAffectedAndDisasterManagementById(double area, boolean dm, int pk) {

	}

	public void deleteById(int id);

	public default void updateNameById(String name, int pk) {

	}

}
