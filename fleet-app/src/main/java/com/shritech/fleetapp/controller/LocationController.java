package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class LocationController {
	
	@RequestMapping("/locations")
	public String getLocation() {
		return "location";
	}
	

}
