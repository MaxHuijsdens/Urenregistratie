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

import com.rotterdam.groep1.Urenregistratie.controller.AccountService;
import com.rotterdam.groep1.Urenregistratie.controller.KandidaatService;
import com.rotterdam.groep1.Urenregistratie.domein.Account;


@Path("kandidaat")
@Component
public class KandidaatEndpoint extends AccountEndpoint {
	@Autowired
	KandidaatService kandidaatService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response toonAllen() {
		Iterable<Account> tests = kandidaatService.geefAllen();
		return Response.ok(tests).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postAccount(Account t){
		Account result = kandidaatService.save(t);
		return Response.accepted(result.getId()).build();	
	}
}
