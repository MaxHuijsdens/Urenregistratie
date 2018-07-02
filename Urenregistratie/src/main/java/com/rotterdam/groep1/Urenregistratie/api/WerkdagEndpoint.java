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

import com.rotterdam.groep1.Urenregistratie.controller.WerkdagService;
import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;
import com.rotterdam.groep1.Urenregistratie.domein.Testclass;
import com.rotterdam.groep1.Urenregistratie.domein.Werkdag;

@Path("werkdag")
@Component
public class WerkdagEndpoint {

	@Autowired
	WerkdagService werkdagService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response toonAllen() {
		Iterable<Werkdag> wd = werkdagService.geefAllen();
		return Response.ok(wd).build();
	}
	
/*	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postTestclass(Testclass t){
		Testclass result = testclassService.save(t);
		return Response.accepted(result.getId()).build();	
	}	*/
	
	
	
}