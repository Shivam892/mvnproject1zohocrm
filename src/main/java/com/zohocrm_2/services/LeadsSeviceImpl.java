package com.zohocrm_2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_2.entities.Leads;
import com.zohocrm_2.repositories.LeadsRepository;

@Service
public class LeadsSeviceImpl implements LeadsService {
	
	@Autowired
	private LeadsRepository leadsRepo;

	@Override
	public void saveLeads(Leads lead) {
		leadsRepo.save(lead);
	}

	@Override
	public List<Leads> getAllLeads() {
		List<Leads> leads = leadsRepo.findAll();
		return leads;
	}

	@Override
	public Leads getLeadById(Long id) {
		Optional<Leads> findById = leadsRepo.findById(id);
		Leads lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeads(long id) {
		leadsRepo.deleteById(id);
	}

}
