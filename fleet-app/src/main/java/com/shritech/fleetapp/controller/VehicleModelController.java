package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class VehicleModelController {

	@RequestMapping("/vehiclemodel")
	public String getVehicleModel() {
		return "vehicle_model";
	}
	
}
