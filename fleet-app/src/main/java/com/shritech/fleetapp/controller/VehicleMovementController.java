package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class VehicleMovementController {

	@RequestMapping("/vehiclemovement")
	public String getVehicleMovement() {
		return "vehicle_movement";
	}
	
}
