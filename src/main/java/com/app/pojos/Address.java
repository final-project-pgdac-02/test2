package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
public class Address extends BaseEntity {
	
	
	@Column(name="detailed_address", length=200)
	@NotBlank
	private String detailedAddress;
	
	@Column(length = 30)
	@NotBlank
	private String city;
	
	@Column(length = 30)
	@NotBlank
	private String state;
	
	@Column(length = 30)
	@NotBlank
	private String country;
	
	@Column(length = 6, name="zip_code")
	@NotBlank
	@Length(min = 6, max = 6)
	private String zipCode;
	
	public Address() {
		super();
	}
	
	
	public String getDetailedAddress() {
		return detailedAddress;
	}


	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	
	
	
}
