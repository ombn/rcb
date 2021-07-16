package com.xworkz.groups;

import java.util.ArrayList;
import java.util.List;

public class CompanyTester {

	public static void main(String[] args) {
		
		
		List<String> startUpCompanyList=new ArrayList<String>();// < 60--2 years 
		
		List<String> serviceBasedCompanyList=new ArrayList<String>();// 60%--> 100 or 2 + years 
		serviceBasedCompanyList.add("TCS");
		serviceBasedCompanyList.add("Accenture");
		serviceBasedCompanyList.add("Mind Tree");
		serviceBasedCompanyList.add("HCL");
		serviceBasedCompanyList.add("Infosys");
		serviceBasedCompanyList.add("Wipro");
		serviceBasedCompanyList.add("Mphasis");
		
		
		List<String> productBasedCompanyList=new  ArrayList<String>();// college--> 60 % 1 or 2 , min 5 years 
		productBasedCompanyList.add("Goolge");
		productBasedCompanyList.add("amazon");
		productBasedCompanyList.add("facebook");
		productBasedCompanyList.add("HP");
		productBasedCompanyList.add("Harman");
		productBasedCompanyList.add("Microsoft");
		productBasedCompanyList.add("Apple Inc.,");
		productBasedCompanyList.add("Informatica");
		
		startUpCompanyList.addAll(serviceBasedCompanyList);
		startUpCompanyList.addAll(productBasedCompanyList);
		System.out.println(startUpCompanyList.size());
		System.out.println(startUpCompanyList.get(3));// Girija- HCL , MindTree- Chitra
	}

}
