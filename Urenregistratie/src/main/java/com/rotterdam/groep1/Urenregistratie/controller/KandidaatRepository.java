package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;

@Repository
public interface KandidaatRepository extends CrudRepository<Kandidaat, Long> {

}
