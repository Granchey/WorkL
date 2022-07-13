package Resources;

import dto.UserDto;
import org.jose4j.lang.JoseException;
import services.LoginService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    LoginService loginService;

    private String username = "Granit";

    private String password = "asdasd";

    @Inject
    public LoginResource(LoginService loginService) {
        this.loginService = loginService;
    }

    @POST
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    public String token(UserDto userDto) throws JoseException {
        return loginService.buildToken(userDto);
    }
}
