package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;
import com.rotterdam.groep1.Urenregistratie.domein.Maand;
import com.rotterdam.groep1.Urenregistratie.domein.Werkdag;

import com.rotterdam.groep1.Urenregistratie.domein.Maand;


@Component
public interface MaandRepository extends CrudRepository<Maand, Long> {
	
}
