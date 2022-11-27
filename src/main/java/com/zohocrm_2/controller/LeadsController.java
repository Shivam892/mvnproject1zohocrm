package com.zohocrm_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_2.entities.Leads;
import com.zohocrm_2.services.LeadsService;

@Controller
public class LeadsController {
	
	@Autowired
	private LeadsService leadsService;
	
	@RequestMapping("/leads")
	public String showLeadsPage() {
		return "createLeads";
	}
	
	@RequestMapping("/saveLead")
	public String saveLeadsInfo(@ModelAttribute("lead") Leads leads, ModelMap modelMap) {
		leadsService.saveLeads(leads);
		modelMap.addAttribute("msg", "lead is saved!!");
		return "createLeads";
	}
	
	@RequestMapping("/getLeads")
	public String getLeads(ModelMap modelMap) {
		List<Leads> leads = leadsService.getAllLeads();
		modelMap.addAttribute("leads", leads);
		return "searchResults";
	}
	
	@RequestMapping("/getLeadInfo") //
	public String getLeadInfo(@RequestParam("id") Long id, ModelMap modelMap) {
		Leads lead = leadsService.getLeadById(id);
		modelMap.addAttribute("lead", lead);
		return "leadInfo";
	}

}
