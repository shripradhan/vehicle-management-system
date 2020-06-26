package com.shritech.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Shrikant Pradhan
*/
@Controller
public class InvoiceStatusController {

	@RequestMapping("/invoicestatus")
	public String getInvoiceStatus() {
		return "invoice_status";
	}
	
}
