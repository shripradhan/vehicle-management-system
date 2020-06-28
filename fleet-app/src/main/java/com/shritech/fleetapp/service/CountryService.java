package com.shritech.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shritech.fleetapp.model.Country;
import com.shritech.fleetapp.repositories.CountryRepository;

/**
* @author Shrikant Pradhan
*/

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepo;
	
	
	//Returns list of Countries
	public List<Country> getCountries(){
		return countryRepo.findAll();
	}
	
	//Add new Country
	public void saveCountry(Country country) {
		countryRepo.save(country);
	}

}
