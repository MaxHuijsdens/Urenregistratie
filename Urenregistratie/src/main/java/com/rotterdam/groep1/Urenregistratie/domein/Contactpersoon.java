package com.rotterdam.groep1.Urenregistratie.domein;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Contactpersoon extends Account{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String telefoonnummer;
	private String afdeling;
	
	@OneToMany(fetch=FetchType.EAGER)
	private Set<Kandidaat> kandidaat;
		
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public String getAfdeling() {
		return afdeling;
	}
	public void setAfdeling(String afdeling) {
		this.afdeling = afdeling;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Set<Kandidaat> getKandidaat() {

		return kandidaat;
	}
	public void setKandidaat(Set<Kandidaat> kandidaat) {
		this.kandidaat = kandidaat;
	}
	
	
}
