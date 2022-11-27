package com.zohocrm_2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_2.entities.Billings;
import com.zohocrm_2.repositories.BillingsRepository;

@Service
public class BillingsServiceImpl implements BillingsService {
	
	@Autowired
	private BillingsRepository billingsRepo;

	@Override
	public Billings generateOneBill(Billings bill) {
		Billings billings = billingsRepo.save(bill);
		return billings;
	}

}
