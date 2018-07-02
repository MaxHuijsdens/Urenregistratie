package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;
import com.rotterdam.groep1.Urenregistratie.domein.Werkdag;
import com.rotterdam.groep1.Urenregistratie.domein.Werkgever;


@Service
@Transactional
public class WerkdagService {
	
	@Autowired
	WerkdagRepository werkdagRepository;
	
	public Iterable<Werkdag> geefAllen() {
		return werkdagRepository.findAll();
	}
		
}
