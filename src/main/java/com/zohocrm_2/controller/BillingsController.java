package com.zohocrm_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm_2.entities.Billings;
import com.zohocrm_2.services.BillingsService;

@Controller
public class BillingsController {
	
	@Autowired
	private BillingsService billingsService;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billings bill, ModelMap modelMap) {
		Billings billings = billingsService.generateOneBill(bill);
		modelMap.addAttribute("billing", billings);
		return "billingInfo";
	}

}
