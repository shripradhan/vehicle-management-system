package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class ContactController {

	@RequestMapping("/contacts")
	public String getContact() {
		return "contact";
	}
	
}
