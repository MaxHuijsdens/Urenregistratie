package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public abstract class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String naam;
	private String email;
	private String wachtwoord;
	
	@OneToOne (cascade = CascadeType.ALL)
	private Kandidaat kandidaat;
	
	@OneToOne (cascade = CascadeType.ALL)
	private Contactpersoon contactpersoon;
	
	@OneToOne (cascade = CascadeType.ALL)
	private Werknemer werknemer;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public Kandidaat getKandidaat() {
		return kandidaat;
	}
	public void setKandidaat(Kandidaat kandidaat) {
		this.kandidaat = kandidaat;
	}
	public Contactpersoon getContactpersoon() {
		return contactpersoon;
	}
	public void setContactpersoon(Contactpersoon contactpersoon) {
		this.contactpersoon = contactpersoon;
	}
	public Werknemer getWerknemer() {
		return werknemer;
	}
	public void setWerknemer(Werknemer werknemer) {
		this.werknemer = werknemer;
	}
	
	
	

}
