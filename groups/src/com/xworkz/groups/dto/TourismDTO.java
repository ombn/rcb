package com.xworkz.groups.dto;

import java.io.Serializable;

import com.xworkz.groups.constants.TourismType;

public class TourismDTO implements Serializable, Comparable<TourismDTO> {

	private String place;
	private boolean ambience;
	private TourismType type;
	private double costEstimatePerHead;
	private String famousFood;

	public TourismDTO() {

	}

	public TourismDTO(String place, boolean ambience, TourismType type, double costEstimatePerHead, String famousFood) {
		super();
		this.place = place;
		this.ambience = ambience;
		this.type = type;
		this.costEstimatePerHead = costEstimatePerHead;
		this.famousFood = famousFood;
	}

	@Override
	public int compareTo(TourismDTO dto) {
         System.out.println("Comparing dto"+dto);  
		double costFromOtherRef = dto.getCostEstimatePerHead();

		if (this.costEstimatePerHead == costFromOtherRef)
			return 0;
		if (this.costEstimatePerHead > costFromOtherRef)
			return +1;
		if (this.costEstimatePerHead < costFromOtherRef)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "TourismDTO [place=" + place + ", ambience=" + ambience + ", type=" + type + ", costEstimatePerHead="
				+ costEstimatePerHead + ", famousFood=" + famousFood + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals");
		if (obj == null)
			return false;
		if (obj instanceof TourismDTO) {
			TourismDTO casted = (TourismDTO) obj;
			if (casted.place.equals(this.place)) {
				return true;
			}
		}
		return super.equals(obj);
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public boolean isAmbience() {
		return ambience;
	}

	public void setAmbience(boolean ambience) {
		this.ambience = ambience;
	}

	public TourismType getType() {
		return type;
	}

	public void setType(TourismType type) {
		this.type = type;
	}

	public double getCostEstimatePerHead() {
		return costEstimatePerHead;
	}

	public void setCostEstimatePerHead(double costEstimatePerHead) {
		this.costEstimatePerHead = costEstimatePerHead;
	}

	public String getFamousFood() {
		return famousFood;
	}

	public void setFamousFood(String famousFood) {
		this.famousFood = famousFood;
	}
}
