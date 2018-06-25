package com.rotterdam.groep1.Urenregistratie.domein;

import javax.persistence.Entity;

@Entity
public class Werknemer extends Account implements Overzicht {
	public void keurGoed()
	{
		return;
	}
	
	public void checkWerknemer()
	{
		return;
	}

	@Override
	public void getOverzicht() {
		// TODO Auto-generated method stub
		
	}
}
