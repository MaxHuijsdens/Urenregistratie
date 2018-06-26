package com.rotterdam.groep1.Urenregistratie.domein;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	
	@Id
	private long id;
	
	@OneToMany
	private Set<Werknemer> werknemer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Werknemer> getWerknemer() {
		return werknemer;
	}

	public void setWerknemer(Set<Werknemer> werknemer) {
		this.werknemer = werknemer;
	}
	
	
}
