package com.zohocrm_2.services;

import java.util.List;

import com.zohocrm_2.entities.Contacts;
import com.zohocrm_2.entities.Leads;

public interface ContactsService {

	public void saveContact(Contacts contact);

	public List<Contacts> getContacts();

	public Contacts getContactById(Long id);

}
