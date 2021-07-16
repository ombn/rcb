package com.xworkz.groups.dto;

import java.io.Serializable;

import com.xworkz.groups.constants.OilColor;
import com.xworkz.groups.constants.OilType;

public class OilDTO implements Serializable {

	private String brand;
	private OilType type;
	private Double price;
	private OilColor color;
	private boolean quality;
	private boolean refined;
	private boolean usedForCooking;
	private Double viscocity;

	public OilDTO() {
		System.out.println("invoked default OilDTO const");
	}

	public OilDTO(String brand, OilType type, Double price, OilColor color, boolean quality, boolean refined,
			boolean usedForCooking, Double viscocity) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.quality = quality;
		this.refined = refined;
		this.usedForCooking = usedForCooking;
		this.viscocity = viscocity;
	}

	@Override
	public String toString() {
		return "OilDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color + ", quality="
				+ quality + ", refined=" + refined + ", usedForCooking=" + usedForCooking + ", viscocity=" + viscocity
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals of Object class from oil dto");
		// return super.equals(obj);

		if (obj == null)
			return false;
		if (obj instanceof OilDTO) {
			OilDTO casted = (OilDTO) obj;
			if (this.type.equals(casted.getType()) && this.color.equals(casted.color)
					&& this.brand.equals(casted.getBrand())) {
				System.out.println("oil is equals " + this.brand);
				return true;
			} else {
				System.out.println("oil is not equals " + this.brand);
				return false;
			}
		}

		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public OilType getType() {
		return type;
	}

	public void setType(OilType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public OilColor getColor() {
		return color;
	}

	public void setColor(OilColor color) {
		this.color = color;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isRefined() {
		return refined;
	}

	public void setRefined(boolean refined) {
		this.refined = refined;
	}

	public boolean isUsedForCooking() {
		return usedForCooking;
	}

	public void setUsedForCooking(boolean usedForCooking) {
		this.usedForCooking = usedForCooking;
	}

	public Double getViscocity() {
		return viscocity;
	}

	public void setViscocity(Double viscocity) {
		this.viscocity = viscocity;
	}

}
