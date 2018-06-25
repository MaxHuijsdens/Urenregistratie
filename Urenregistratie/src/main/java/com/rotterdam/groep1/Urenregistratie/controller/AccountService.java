package com.rotterdam.groep1.Urenregistratie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rotterdam.groep1.Urenregistratie.domein.Account;
@Component
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	public Iterable<Account> geefAllen() {
		return accountRepository.findAll();
	}
	
	public Account save(Account t) {
		return accountRepository.save(t);
	}
	
}
