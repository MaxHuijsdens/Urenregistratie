package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Kandidaat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String telefoonnummer;
	private double Uurtarief;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "Account_fk", referencedColumnName = "id")
	private Account account;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "Contactpersoon_fk", referencedColumnName = "id")
	private Contactpersoon contactpersoon;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "Werkgever_fk", referencedColumnName = "id")
	private Werkgever werkgever;
	
	public long getId() {
		return id;	
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public double getUurtarief() {
		return Uurtarief;
	}
	public void setUurtarief(double uurtarief) {
		Uurtarief = uurtarief;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Contactpersoon getContactpersoon() {
		return contactpersoon;
	}
	public void setContactpersoon(Contactpersoon contactpersoon) {
		this.contactpersoon = contactpersoon;
	}
	
	

}