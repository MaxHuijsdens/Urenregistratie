package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Contactpersoon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String telefoonnummer;
	private String afdeling;
	
	@OneToOne
	@JoinColumn (name = "Account_fk", referencedColumnName = "id")
	private Account account;
	
	@OneToOne
	private Werkgever werkgever;
	
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Werkgever getWerkgever() {
		return werkgever;
	}
	public void setWerkgever(Werkgever werkgever) {
		this.werkgever = werkgever;
	}
	

}
