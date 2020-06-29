package com.shritech.fleetapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/countries/findById")
	@ResponseBody
	public Optional<Country> findById(Integer id) {
		return countryService.findById(id);
	}
	
	
	@RequestMapping(value = "/countries/update", method = {RequestMethod.PUT , RequestMethod.GET})
	public String updateCountry(Country country) {
		countryService.saveCountry(country);
		return "redirect:/countries";
	}
	
	

}
