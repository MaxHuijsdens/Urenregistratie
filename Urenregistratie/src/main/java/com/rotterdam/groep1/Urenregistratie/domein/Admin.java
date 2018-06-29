package com.rotterdam.groep1.Urenregistratie.domein;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.ws.rs.core.Response;

@Entity
public class Admin implements Overzicht {
	
	@Id
	private long id;
	
	@OneToMany // afstemmen met de rest of het een has-a relatie of is-a relatie heeft.
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

	@Override
	public Response getOverzicht() {
		return null;
	}
	
	
}
