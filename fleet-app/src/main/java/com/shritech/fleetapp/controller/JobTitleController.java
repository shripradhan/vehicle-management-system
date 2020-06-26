package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class JobTitleController {
	
	@RequestMapping("/jobtitle")
	public String getJobTitle() {
		return "job_title";
	}
	
}
