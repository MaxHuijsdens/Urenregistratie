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

import com.rotterdam.groep1.Urenregistratie.controller.WerknemerService;
import com.rotterdam.groep1.Urenregistratie.domein.Werknemer;


@Path("werknemer")
@Component
public class WerknemerEndpoint {
	@Autowired
	WerknemerService werknemerService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response toonAllen() {
		Iterable<Werknemer> tests = werknemerService.geefAllen();
		return Response.ok(tests).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postAccount(Werknemer d) {
		Werknemer result = werknemerService.save(d);
		return Response.accepted(result.getId()).build();
	}
}
