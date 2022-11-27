package com.zohocrm_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm_2.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
