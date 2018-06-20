package com.rotterdam.groep1.Urenregistratie.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rotterdam.groep1.Urenregistratie.api.TestclassEndpoint;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		
		//Hier registreer je je endpoints. Die moet daarna nog wel geïmporteerd worden.
		register(TestclassEndpoint.class); 
	}
}