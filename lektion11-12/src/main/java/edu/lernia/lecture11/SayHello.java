package edu.lernia.lecture11;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/sayhello")
public class SayHello {
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}/{value}")
	public String doGreeting(@PathParam("name") String someValue, @PathParam("value") Integer intValue, @QueryParam("language") String language) {
		String resp = "";
		
		for(int i = 0; i < intValue; i++) {
			resp += "Hello " + someValue + " with language " + language + " intValue:" + intValue + "\n";
		}
		
		return resp;
	}

}
