package com.rotterdam.groep1.Urenregistratie.controller;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rotterdam.groep1.Urenregistratie.domein.Werknemer;

@Service
@Transactional
public class WerknemerService {
	@Autowired
	WerknemerRepository werknemerRepository;
	
	public Iterable<Werknemer> geefAllen() {
		return werknemerRepository.findAll();
	}
	
	public Werknemer save(Werknemer t) {
		return werknemerRepository.save(t);
	}
	
}
