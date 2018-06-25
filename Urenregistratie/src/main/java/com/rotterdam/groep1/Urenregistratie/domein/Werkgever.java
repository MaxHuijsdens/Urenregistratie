package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Werkgever {
	
	@Id
	private long id;
	private String naam;
	private String adres;
	
	@OneToOne
	private Contactpersoon contactpersoon;
	
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
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public Contactpersoon getContactpersoon() {
		return contactpersoon;
	}
	public void setContactpersoon(Contactpersoon contactpersoon) {
		this.contactpersoon = contactpersoon;
	}
	
	

}
