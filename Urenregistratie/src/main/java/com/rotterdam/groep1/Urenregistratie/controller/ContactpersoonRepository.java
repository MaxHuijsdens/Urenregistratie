package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rotterdam.groep1.Urenregistratie.domein.Contactpersoon;

@Component
public interface ContactpersoonRepository extends CrudRepository<Contactpersoon, Long>{

}


