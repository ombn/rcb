package com.xworkz.cyclone.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sanitizer")
@NamedQueries({@NamedQuery(name="fetchIdByQuantityAndBrandName",
query="select san.sid from SanitizerDTO san where san.brandName=:bname and san.quantity=:qty"),
	@NamedQuery(name="fetchBrandNameAndPriceById",
	query="Select san.brandName,san.price from SanitizerDTO san where san.id=:sanid"),
	@NamedQuery(name="fetchAll",query="select san from SanitizerDTO san"),
	@NamedQuery(name="fetchAllBrandName",query="select san.brandName from SanitizerDTO san"),
	@NamedQuery(name="updateQuantityByBrandName",query="update SanitizerDTO san set san.quantity=:qty where san.brandName=:bn")})
public class SanitizerDTO implements Serializable {

	@Id
	@Column(name="S_ID")
	@GenericGenerator(name="XWORKZ",strategy="increment")
	@GeneratedValue(generator="XWORKZ")
	private Integer sid;
	@Column(name="S_BRAND_NAME")
	private String brandName;
	@Column(name="S_PRICE")
	private Double price;
	@Column(name="S_MFG_DATE")
	private Date mfgDate;
	@Column(name="S_QUANTITY")
	private Integer quantity;

	public SanitizerDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [sid=" + sid + ", brandName=" + brandName + ", price=" + price + ", mfgDate=" + mfgDate
				+ ", quantity=" + quantity + "]";
	}

}
