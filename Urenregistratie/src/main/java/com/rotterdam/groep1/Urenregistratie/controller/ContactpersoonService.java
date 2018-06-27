package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotterdam.groep1.Urenregistratie.domein.Contactpersoon;

@Service
@Transactional
public class ContactpersoonService {
	
	@Autowired
	ContactpersoonRepository contactpersoonRepository;
	
	public Iterable<Contactpersoon> geefAllen() {
		return contactpersoonRepository.findAll();
	}
	
	public Contactpersoon save(Contactpersoon t) {
		return contactpersoonRepository.save(t);
		
		//test
	}
	
}

