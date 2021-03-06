package br.com.ceppf.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ceppf.request.LessonIn;
import br.com.ceppf.response.LoginOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;

@Api
@Produces(value=MediaType.APPLICATION_JSON)
@Path("/lesson")
public class LessonService {

	@GET
	@ApiResponse(message = "List Frequency", response = LoginOut.class, code = 200)
	public Response getFrequency(LessonIn lessonIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}
	
	@POST
	@ApiResponse(message = "Save Frequency", response = Response.class, code = 200)
	public Response saveFrequency(LessonIn lessonIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}
	
	@PUT
	@ApiResponse(message = "Update Frequency", response = Response.class, code = 201)
	public Response updateFrequency(LessonIn lessonIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}
	
	@DELETE
	@ApiResponse(message = "Remove Frequency", response = Response.class, code = 200)
	public Response login(LessonIn lessonIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}
}
