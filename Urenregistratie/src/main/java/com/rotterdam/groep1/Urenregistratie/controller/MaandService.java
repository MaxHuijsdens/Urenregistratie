package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;
import com.rotterdam.groep1.Urenregistratie.domein.Maand;


@Service
@Transactional
public class MaandService {
	
	@Autowired
	MaandRepository maandRepository;
	
	public Iterable<Kandidaat> geefAllen() {
		return maandRepository.findAll();
	}
}
