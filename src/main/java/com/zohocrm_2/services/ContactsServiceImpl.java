package com.zohocrm_2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_2.entities.Contacts;
import com.zohocrm_2.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepository contactRepo;

	@Override
	public void saveContact(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getContacts() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts getContactById(Long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

}
