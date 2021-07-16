package com.xworkz.groups.dto;

public class SoftwareDTO {

	private int size;
	private String version;
	private String name;
	private String company;

	public SoftwareDTO() {

	}

	public SoftwareDTO(int size, String version, String name, String company) {
		super();
		this.size = size;
		this.version = version;
		this.name = name;
		this.company = company;
	}

	@Override
	public boolean equals(Object obj) {// obj with any object
		System.out.println("default equal impl....inherited from object");
		if (obj == null)
			return false;
		if (obj instanceof SoftwareDTO) {
			System.out.println("obj passed is Software i can check ");

			SoftwareDTO casted = (SoftwareDTO) obj;
			if (this.name.equals(casted.name) && this.version.equals(casted.version)
					&& this.company.equals(casted.company)) {
				System.out.println("both software is same");
				return true;
			}

		} else {
			System.out.println("obj passwed is not softwar , i wont check ");
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
