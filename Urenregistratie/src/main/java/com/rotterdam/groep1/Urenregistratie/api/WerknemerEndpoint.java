package com.rotterdam.groep1.Urenregistratie.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rotterdam.groep1.Urenregistratie.controller.KandidaatService;
import com.rotterdam.groep1.Urenregistratie.controller.WerknemerService;
import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;
import com.rotterdam.groep1.Urenregistratie.domein.Werknemer;

import com.rotterdam.groep1.Urenregistratie.domein.Overzicht;

@Path("werknemer")
@Component
public class WerknemerEndpoint implements Overzicht {
	@Autowired
	WerknemerService werknemerService;
	
	@Autowired
	KandidaatService kandidaatService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOverzicht() { //De werknemer moet alle kandidaten in kunnen zien. Dit is de functie van onze interface.
		Iterable<Kandidaat> kandidatenLijst = kandidaatService.geefAllen();
		return Response.ok(kandidatenLijst).build();
	}
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createKandidaat(Kandidaat k) {
		return Response.ok(kandidaatService.save(k)).build();
	}
	
	@GET
	@Path("/view/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getKandidaat(@PathParam("id")Long id){
		Kandidaat k = kandidaatService.getById(id);
		if(k != null) 
			return Response.ok(k).build();
		return Response.status(Status.NOT_FOUND).build();
	}


	@PUT
	@Path("/edit/{kid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateKandidaat(@PathParam("kid") Long id, Kandidaat k){
		if (kandidaatService.getById(id) == null)
			return Response.status(Status.NOT_FOUND).build();
		
		k.setId(id);
		kandidaatService.save(k);
		
		return Response.accepted("GELUKT!").build();
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/delete")
	public Response deleteKandidaat(@QueryParam("id") Long id) {
		Kandidaat k = kandidaatService.getById(id);
		System.out.println(k);
		if (k != null) {
			kandidaatService.deleteById(id);
			return Response.noContent().build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
}

