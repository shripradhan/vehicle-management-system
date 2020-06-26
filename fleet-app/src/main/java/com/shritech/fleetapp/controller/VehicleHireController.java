package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class VehicleHireController {

	@RequestMapping("/vehiclehire")
	public String getVehicleHire() {
		return "vehicle_hire";
	}
	
}
