package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String naam;
	private String wachtwoord;
	private String email;
	private String telnr;
	//private int userLevel; //0 = kandidaat, 1 = contactpersoon, 2 = werknemer, 3 = admin
	//private Contactpersoon cp;
	//private Bedrijf b;
	
	public String getTelnr() {
		return telnr;
	}
	public void setTelnr(String telnr) {
		this.telnr = telnr;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}*/
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
