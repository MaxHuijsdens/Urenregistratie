package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rotterdam.groep1.Urenregistratie.domein.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}
