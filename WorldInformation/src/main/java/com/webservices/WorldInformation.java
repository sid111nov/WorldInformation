package com.webservices;

import java.util.List;

import com.webservices.models.Country;
import com.webservices.services.WorldInformationService;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;

@Path ("/worldinformation")
public class WorldInformation{
	
	WorldInformationService  worldInformationService = new WorldInformationService();
	
	@GET
	@Path("/getCountries")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountries(){
		System.out.println("reached point 1");
		List<Country> countryList = worldInformationService.getCountries();
		System.out.println(countryList);
		return countryList;
	}
	
	@POST
	@Path("/setCountry/{country}/{countryCode}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setCountry(@PathParam("country") String country,@PathParam("countryCode") String countryCode){
		worldInformationService.setCountry(country,countryCode);
	}

}
