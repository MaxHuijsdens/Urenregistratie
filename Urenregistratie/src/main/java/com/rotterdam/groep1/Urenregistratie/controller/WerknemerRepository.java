package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;

import com.rotterdam.groep1.Urenregistratie.domein.Werknemer;

public interface WerknemerRepository extends CrudRepository<Werknemer, Long> {

}
