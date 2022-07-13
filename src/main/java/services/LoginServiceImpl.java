package services;

import auth.Keys;
import dto.UserDto;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.lang.JoseException;

import javax.inject.Inject;
import javax.ws.rs.BadRequestException;

import static org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA256;

public class LoginServiceImpl implements LoginService {

    private String username = "Granit";
    private String password = "asdasd";

    Keys keys;

    @Inject
    public LoginServiceImpl(Keys keys) {
        this.keys = keys;
    }

    @Override
    public String buildToken(UserDto userDto) throws JoseException {
        final JwtClaims claims = new JwtClaims();
        claims.setSubject(userDto.getUsername());
        claims.setStringClaim("username", userDto.getUsername());
        claims.setStringClaim("password", userDto.getPassword());
        claims.setExpirationTimeMinutesInTheFuture(5);

        final JsonWebSignature jws = new JsonWebSignature();
        jws.setPayload(claims.toJson());
        jws.setAlgorithmHeaderValue(HMAC_SHA256);
        jws.setKey(keys.getSignatureKey());
        jws.setHeader("typ", "JWT");

        String jwt = jws.getCompactSerialization();

        if (!(username.equals(userDto.getUsername()))) {
            throw new BadRequestException("Wrong username");
        }
        if (!(password.equals(userDto.getPassword()))) {
            throw new BadRequestException("Wrong Password");
        }
        return jwt;
    }
}
