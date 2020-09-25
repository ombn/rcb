package com.xworkz.cyclone.service;

import java.util.List;
import java.util.Objects;

import com.xworkz.cyclone.dao.SanitizerDAO;
import com.xworkz.cyclone.dao.SanitizerDAOImpl;
import com.xworkz.cyclone.dto.SanitizerDTO;

public class SanitizerServiceImpl implements SanitizerService {

	private SanitizerDAO dao = new SanitizerDAOImpl();

	public SanitizerServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public SanitizerDTO fetchByBrandName(String name) {

		System.out.println("Service:Start fetchByBrandName ");
		try {
			boolean valid = false;
			if (name != null && !name.trim().isEmpty()) {
				valid = true;
				System.out.println("name is valid, can call dao");
			} else {
				valid = false;
				System.out.println("name is invalid , cannot call dao");
			}
			if (valid) {
				SanitizerDTO dto = dao.fetchByBrandName(name);
				if (dto != null) {
					System.out.println("dto found from dao by brand name" + name);
					return dto;
				} else {
					System.out.println("dto not found drom dao by brand name" + name);
				}
			}

		} catch (Exception e) {
			System.err.println("exception in service fetchByBrandName" + e.getMessage());
		}

		System.out.println("Service:End fetchByBrandName ");
		return null;
	}

	@Override
	public Integer fetchIdByQuantityAndBrandName(String brandName, Double quantity) {
		try {

			boolean valid = false;
			if (Objects.nonNull(brandName) && !brandName.trim().isEmpty()) {
				valid = true;
				System.out.println("brandName is valid");
			} else {
				valid = false;
				System.out.println("brandName is invalid");
			}
			if (valid && Objects.nonNull(quantity) && quantity >= 0) {
				valid = true;
				System.out.println("quantity is valid");
			} else {
				valid = false;
				System.out.println("quantity is invalid");
			}
			if (valid) {
				System.out.println("data is valid , calling dao");
				Integer id = dao.fetchIdByQuantityAndBrandName(brandName, quantity);
				System.out.println("ID from dao" + id);
				return id;
			}

		} catch (Exception e) {
			System.err.println("exception in service fetchIdByQuantityAndBrandName" + e.getMessage());
		}
		return null;
	}

	public Object fetchBrandNameAndPriceById(int id) {

		try {
			return this.dao.fetchBrandNameAndPriceById(id);

		} catch (Exception e) {
			System.err.println("Excception in fetchBrandNameAndPriceById" + e.getMessage());
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<SanitizerDTO> fetchAll() {
		try {
			List<SanitizerDTO> list = this.dao.fetchAll();
			if (Objects.nonNull(list)) {
				System.out.println("List is found " + list.size());
				return list;
			} else {
				System.out.println("List is not found ");
			}

		} catch (Exception e) {
			System.err.println("Excception in fetchAll" + e.getMessage());

		}

		return null;
	}
	
	@Override
	public List<String> fetchAllBrandName() {
		try {
			List<String> list = this.dao.fetchAllBrandName();
			if (Objects.nonNull(list)) {
				System.out.println("List is found " + list.size());
				return list;
			} else {
				System.out.println("List is not found ");
			}

		} catch (Exception e) {
			System.err.println("Excception in fetchAllBrandName" + e.getMessage());

		}

		return null;
	}

	@Override
	public List<String> fetchAllBrandNameByQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> fetchAllBrandNameAndPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> fetchAllBrandNameAndCountByQuantity(Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> fetchAllBrandNameCountByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int updateQuantityByBrandName(Integer quantity, String brandName) {
			try{
				System.out.println("START:SERVICE updateQuantityByBrandName " + quantity + " " + brandName);
				return this.dao.updateQuantityByBrandName(quantity, brandName);				
			}
			catch (Exception he) {
				System.err.println("Exception in updateQuantityByBrandName ," + he.getMessage());
			}
		return 0;
	}

	@Override
	public int deleteByBrandName(String brandName) {
		// TODO Auto-generated method stub
		return 0;
	}
}
