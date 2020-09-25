package com.xworkz.cyclone;

import com.xworkz.cyclone.service.SanitizerService;
import com.xworkz.cyclone.service.SanitizerServiceImpl;
import com.xworkz.cyclone.singleton.SFUtil;

public class SanitizerTester {

	public static void main(String[] args) {

		try {

			SanitizerService sanitizerService = new SanitizerServiceImpl();

			int effectedRows = sanitizerService.updateQuantityByBrandName(100, "Lenovo");
			if (effectedRows > 0) {
				System.out.println("DB updated" + effectedRows);
			} else {
				System.out.println("DB not updated" + effectedRows);
			}

		} finally {
			SFUtil.closeFactory();
		}
	}

}
