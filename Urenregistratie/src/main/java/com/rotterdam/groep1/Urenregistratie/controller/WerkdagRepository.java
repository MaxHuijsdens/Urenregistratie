package com.rotterdam.groep1.Urenregistratie.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;
import com.rotterdam.groep1.Urenregistratie.domein.Werkdag;

@Component
public interface WerkdagRepository extends CrudRepository<Werkdag, Long> {
	@Query("SELECT * from Maand m INNER JOIN Werkdag w On m.id  = w.maand_fk")
	List<Werkdag> findAllWerkdag();

}
