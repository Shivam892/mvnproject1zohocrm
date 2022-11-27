package com.zohocrm_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_2.entities.Contacts;
import com.zohocrm_2.entities.Leads;
import com.zohocrm_2.services.ContactsService;
import com.zohocrm_2.services.LeadsService;
import com.zohocrm_2.dto.SaveContactDetails;

@Controller
public class ContactsController {
	
	@Autowired
	private ContactsService contactService;
	
	@Autowired
	private LeadsService leadsService;
	
	@RequestMapping("/contacts")
	public String saveContacts(SaveContactDetails details, ModelMap modelMap) {
		
		Contacts contact = new Contacts();
		contact.setId(details.getId());
		contact.setFirstName(details.getFirstName());
		contact.setLastName(details.getLastName());
		contact.setCompany(details.getCompany());
		contact.setEmail(details.getEmail());
		contact.setMobile(details.getMobile());
		contact.setLeadSource(details.getLeadSource());
		
		contactService.saveContact(contact);
		
		leadsService.deleteLeads(details.getId());
		modelMap.addAttribute("msg2", "Lead is converted to sales");
		return "contactsSaved";
	}
	
	@RequestMapping("/getContacts")
	public String getContactsInfo(ModelMap modelMap) {
		List<Contacts> contacts = contactService.getContacts();
		modelMap.addAttribute("contacts", contacts);
		return "contactSearchResults";
	}
	
	@RequestMapping("/getContactInfo") 
	public String getContactInfo(@RequestParam("id") Long id, ModelMap modelMap) {
		Contacts contact = contactService.getContactById(id);
		modelMap.addAttribute("contact", contact);
		return "generateBill";
	}

}
