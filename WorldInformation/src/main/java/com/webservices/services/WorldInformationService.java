package com.webservices.services;

import java.util.List;

import com.webservices.dao.WorldInformationDAO;
import com.webservices.models.Country;

public class WorldInformationService {
	
	WorldInformationDAO worldInformationDAO = new WorldInformationDAO();

	public WorldInformationService() {
		
	}

	public List<Country> getCountries() {
		System.out.println("reached point-2");
		List<Country> countryList = worldInformationDAO.getCountries();
		return countryList;
	}

	public void setCountry(String country, String countryCode) {
		worldInformationDAO.setCountry(country,countryCode);
		
	}

}
