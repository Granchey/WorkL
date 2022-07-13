package services;

import dto.UserDto;
import org.jose4j.lang.JoseException;

public interface LoginService {

    String buildToken(UserDto userDto) throws JoseException;
}
