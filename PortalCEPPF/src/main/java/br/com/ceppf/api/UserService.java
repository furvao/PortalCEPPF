package br.com.ceppf.api;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ceppf.business.UserManager;
import br.com.ceppf.request.UserIn;
import br.com.ceppf.response.LoginOut;
import br.com.ceppf.response.UserListOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;

@Api
@Produces(value=MediaType.APPLICATION_JSON)
@Path("/user")
public class UserService {

	@GET
	@ApiResponse(message = "List User", response = UserListOut.class, code = 200)
	public Response getFrequency(UserIn userIn) {

		UserManager userManager = new UserManager();
		UserListOut  userListOut = userManager.listUser();
		
		
		return Response.ok().entity(userListOut).build();
	}

	@POST
	@ApiResponse(message = "Save Frequency", response = Response.class, code = 200)
	public Response saveFrequency(UserIn userIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}

	@PUT
	@ApiResponse(message = "Update Frequency", response = Response.class, code = 201)
	public Response updateFrequency(UserIn userIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}

	@DELETE
	@ApiResponse(message = "Remove Frequency", response = Response.class, code = 200)
	public Response login(UserIn userIn) {

		LoginOut loginOut = new LoginOut();
		loginOut.setName("Fulvio");
		loginOut.setEmail("fulvioalmeidasilva@gmail.com");

		return Response.ok().entity(loginOut).build();
	}



}
