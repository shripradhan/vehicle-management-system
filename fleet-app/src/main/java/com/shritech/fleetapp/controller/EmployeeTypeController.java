package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class EmployeeTypeController {

	

	@RequestMapping("/employeetypes")
	public String getEmployeeType() {
		return "employee_type";
	}
	
}
