package com.shritech.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* @author Shrikant Pradhan
*/

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String lounchHome() {
		return "index";
	}
}
