package com.webservices.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

	@Id
	@Column(name="CITY_ID")
	private int cityId;
	private String city;
	@Column(name="IS_STATE_CAP")
	private boolean isStateCap;
	@Column(name="IS_COUNTRY_CAP")
	private boolean isCountryCap;
	@Column(name="STATE_CODE")
	private String stateCode;
	
	public City() {
		super();
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isStateCap() {
		return isStateCap;
	}

	public void setStateCap(boolean isStateCap) {
		this.isStateCap = isStateCap;
	}

	public boolean isCountryCap() {
		return isCountryCap;
	}

	public void setCountryCap(boolean isCountryCap) {
		this.isCountryCap = isCountryCap;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

}
