package com.webservices.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	private String country;
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String country, String countryCode) {
		this.country=country;
		this.countryCode=countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	
}
