package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.Entity;

@Entity
public class Kandidaat extends Account {
	double uurTarief;
	//Contactpersoon contact; --vraag voor felix. als je dit uncomment doet ie het niet
	
	public double getUurTarief() {
		return uurTarief;
	}

	public void setUurTarief(double uurTarief) {
		this.uurTarief = uurTarief;
	}

	public void registreeruren()
	{
		return;
	}
}
