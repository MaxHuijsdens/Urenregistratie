package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;

import com.rotterdam.groep1.Urenregistratie.domein.Contactpersoon;

public interface ContactpersoonRepository extends CrudRepository<Contactpersoon, Long> {

}
