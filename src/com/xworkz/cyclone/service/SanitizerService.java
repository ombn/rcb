package com.xworkz.cyclone.service;

import java.util.List;

import com.xworkz.cyclone.dto.SanitizerDTO;

public interface SanitizerService {

	public SanitizerDTO fetchByBrandName(String name);

	public Integer fetchIdByQuantityAndBrandName(String brandName, Double quantity);

	public Object fetchBrandNameAndPriceById(int id);

	public List<SanitizerDTO> fetchAll();

	public List<String> fetchAllBrandName();

	public List<String> fetchAllBrandNameByQuantity();

	public List<Object[]> fetchAllBrandNameAndPrice();

	public List<?> fetchAllBrandNameAndCountByQuantity(Double quantity);

	public List<?> fetchAllBrandNameCountByPrice(double price);
	
	public int updateQuantityByBrandName(Integer quantity,String brandName);
	
	public int deleteByBrandName(String brandName);
	

}
