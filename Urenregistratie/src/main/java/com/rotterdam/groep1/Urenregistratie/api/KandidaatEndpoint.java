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

import com.rotterdam.groep1.Urenregistratie.controller.KandidaatService;
import com.rotterdam.groep1.Urenregistratie.domein.Kandidaat;


@Path("kandidaat")
@Component
public class KandidaatEndpoint {
	@Autowired
	KandidaatService kandidaatService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response toonAllen() {
		System.out.println("ik ben een endpoint");
		Iterable<Kandidaat> tests = kandidaatService.geefAllen();
		for (Kandidaat k : tests) {
			System.out.println(k);
		}
		return Response.ok(tests).build();
	}
	
	
/*	@GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getKandidaatById(@PathParam("id") Long id){
        if(this.kandidaatService.existsById(id)) {
            Kandidaat employee = this.employeeWTService.findById(id);
            return Response.ok(employee).build();
        }
        System.out.println("EmployeeWT id in GET not found!");
        return Response.status(Status.NOT_FOUND).build();
    }	*/
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postAccount(Kandidaat d) {
		Kandidaat result = kandidaatService.save(d);
		return Response.accepted(result.getId()).build();
	}
}
