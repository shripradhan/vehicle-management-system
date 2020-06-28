package com.shritech.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shritech.fleetapp.model.Country;
import com.shritech.fleetapp.service.CountryService;

/**
* @author Shrikant Pradhan
*/
@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String getCountries(Model model) {
		
		List<Country> countries = countryService.getCountries();
		System.out.println(countries);
		model.addAttribute("countries", countries);
		
		return "country";
	}
	
	@PostMapping("/countries/new")
	public String addNewCountry(Country country) {
		countryService.saveCountry(country);
		return "redirect:/countries";
	}
	
	

}
