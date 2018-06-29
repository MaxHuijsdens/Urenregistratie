package com.rotterdam.groep1.Urenregistratie.domein;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Werkgever {
	
	@Id
	private long id;
	private String naam;
	private String adres;
	
	
	@OneToMany (cascade = CascadeType.ALL)
	private List<Contactpersoon> contactpersoon;
	
	@OneToMany
	private Set<Kandidaat> kandidaat;

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
	public List<Contactpersoon> getContactpersoon() {
		return contactpersoon;
	}
	public void setContactpersoon(List<Contactpersoon> contactpersoon) {
		this.contactpersoon = contactpersoon;
	}
	public Set<Kandidaat> getKandidaat() {
		return kandidaat;
	}
	public void setKandidaat(Set<Kandidaat> kandidaat) {
		this.kandidaat = kandidaat;
	}
	
	
	
	

}
