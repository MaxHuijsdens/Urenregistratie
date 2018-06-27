package com.rotterdam.groep1.Urenregistratie.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rotterdam.groep1.Urenregistratie.controller.ContactpersoonService;
import com.rotterdam.groep1.Urenregistratie.domein.Contactpersoon;

@Path("testclass")
@Component
public class ContactpersoonEndpoint {

	@Autowired
	ContactpersoonService contactpersoonService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response toonAllen() {
		Iterable<Contactpersoon> tests = contactpersoonService.geefAllen();
		return Response.ok(tests).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postAccount(Contactpersoon t){
		Contactpersoon result = contactpersoonService.save(t);
		return Response.accepted(result.getId()).build();	
	}
	
}