package com.rotterdam.groep1.Urenregistratie.controller;

import javax.transaction.Transactional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KandidaatService extends AccountService {
	@Autowired
	KandidaatRepository kandidaatRepository;
}
