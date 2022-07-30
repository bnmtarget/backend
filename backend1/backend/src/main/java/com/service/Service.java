package com.service;
import com.dto.UserRequestDto;
import com.dto.UserResponseDto;
import com.exceptions.UnauthorizedException;
import com.token.UserLoginToken;
import com.repository.UserRepository;
import com.util.UserUtil;
import com.entity.User;
import static com.enums.ServiceError.*;
import javax.validation.Valid;

public class Service implements ServiceInterface{
    private UserRepository userRepository;
    private String salt;

    public UserResponseDto login(@Valid UserRequestDto userRequestDto) throws  UnauthorizedException {
        String encryptedPassword = UserUtil.encryptPassword(userRequestDto.getPassword(), salt);
        User dbUser = userRepository.findByEmailAddress(userRequestDto.getEmail().toLowerCase());
        if (dbUser != null && encryptedPassword.equals(dbUser.getPassword())) {
            return new UserResponseDto(token);
        } else {
            throw new UnauthorizedException(CREDENTIAL_MISMATCH);
        }
    }
}
