package com.xworkz.cyclone.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CYCLONE")
public class CycloneDTO implements Serializable {

	@Id
	@GenericGenerator(name = "xworkz", strategy = "org.hibernate.id.IncrementGenerator")
	@GeneratedValue(generator = "xworkz")
	@Column(name = "C_ID")
	private int cid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SPEED")
	private int speed;
	@Column(name = "DISASTER_MANAGEMENT")
	private boolean disasterManagement;
	@Column(name = "AREA_AFFECTED")
	private double areaAffected;

	public CycloneDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public CycloneDTO(String name, int speed, boolean disasterManagement, double areaAffected) {
		super();
		this.name = name;
		this.speed = speed;
		this.disasterManagement = disasterManagement;
		this.areaAffected = areaAffected;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isDisasterManagement() {
		return disasterManagement;
	}

	public void setDisasterManagement(boolean disasterManagement) {
		this.disasterManagement = disasterManagement;
	}

	public double getAreaAffected() {
		return areaAffected;
	}

	public void setAreaAffected(double areaAffected) {
		this.areaAffected = areaAffected;
	}

	@Override
	public String toString() {
		return "CycloneDTO [cid=" + cid + ", name=" + name + ", speed=" + speed + ", disasterManagement="
				+ disasterManagement + ", areaAffected=" + areaAffected + "]";
	}
}
