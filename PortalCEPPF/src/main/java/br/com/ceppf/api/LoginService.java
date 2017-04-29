package br.com.ceppf.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ceppf.business.LoginManager;
import br.com.ceppf.request.LoginIn;
import br.com.ceppf.response.LoginOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;

@Api
@Produces(value = MediaType.APPLICATION_JSON)
@Path("/login")
public class LoginService {

	@POST
	@ApiResponse(message = "Login of Users", response = LoginOut.class, code = 200)
	public Response login(LoginIn loginIn) {

		LoginManager loginManager = new LoginManager();

		return Response.ok().entity(loginManager.login(loginIn)).build();
	}
}
