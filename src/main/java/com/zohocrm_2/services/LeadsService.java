package com.zohocrm_2.services;

import java.util.List;

import com.zohocrm_2.entities.Leads;

public interface LeadsService {
	public void saveLeads(Leads lead);
	public List<Leads> getAllLeads();
	public Leads getLeadById(Long id);
	public void deleteLeads(long id);

}
