package com.xworkz.cyclone.dao;

import java.util.List;

import com.xworkz.cyclone.dto.SanitizerDTO;

public interface SanitizerDAO {

	public SanitizerDTO fetchByBrandName(String name);
	public SanitizerDTO fetchByBrandNameAndQuantity(String name, Double quantity);
	// select sand.brandName from SanitizerDTO sand where sand.sid=2 and
	// sand.quantity=55
	public String fetchBrandNameByIDAndQuantity(int id, Double quantity);

	// select san.id from Sanitizer san where san.brandName='' and
	// san.quantity=45
	public Integer fetchIdByQuantityAndBrandName(String brandName, Double quantity);

	public SanitizerDTO fetchByBrandNameAndMfgDate(String bname, String mfgDate);

	public Long fetchCount();

	public Long fetchCountByPrice(Double price);

	public Double fetchMaxByPrice();

	public Double fetchSumByPrice();

	public Double fetchSecondMaxByPrice();
	
	public Object fetchBrandNameAndPriceById(int id);
	
	
	public List<SanitizerDTO> fetchAll();
	
	public List<String> fetchAllBrandName();
	
	
	public int updateQuantityByBrandName(Integer quantity,String brandName);
	
	

}
