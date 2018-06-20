package com.rotterdam.groep1.Urenregistratie.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		
		//Hier registreer je je endpoint. Die moet daarna nog wel geïmporteerd worden.
		//register(AutoEndpoint.class); 
	}
}