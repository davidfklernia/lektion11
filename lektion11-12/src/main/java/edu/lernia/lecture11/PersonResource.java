package edu.lernia.lecture11;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson() {
		Person person = new Person();
		person.setName("David");
		person.setAge(100);
		return person;
	}

}