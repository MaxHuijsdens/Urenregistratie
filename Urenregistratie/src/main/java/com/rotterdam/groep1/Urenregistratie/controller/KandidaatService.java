package com.rotterdam.groep1.Urenregistratie.controller;

import javax.transaction.Transactional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;

@Component
public class KandidaatService {
	@Autowired
	KandidaatRepository kandidaatRepository;
	
	public Iterable<Kandidaat> geefAllen() {
		return kandidaatRepository.findAll();
	}
	
	public Kandidaat save(Kandidaat t) {
		return kandidaatRepository.save(t);
	}
	
	public Kandidaat getById(long id) {
		return kandidaatRepository.findById(id).orElse(null);
	}
	
	public void deleteById(long id) {
		kandidaatRepository.deleteById(id);
	}
}
