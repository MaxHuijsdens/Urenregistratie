package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.rotterdam.groep1.Urenregistratie.domein.Account;

@Component
public interface AccountRepository extends CrudRepository<Account, Long>{

}
