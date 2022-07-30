package com.controller;
import com.dto.UserResponseDto;
import com.dto.UserRequestDto;
import org.springframework.http.ResponseEntity;
import com.service.Service;
import com.exceptions.UnauthorizedException;
import org.springframework.http.HttpStatus;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RequestMapping(value = "/user")
public class Controller {

    private final Service service;

    public Controller(final Service service) {
        this.service = service;
    }



    @PostMapping(path = "/")
    public ResponseEntity<UserResponseDto> loginUser(@RequestBody @Valid UserRequestDto userRequestDto)
            throws UnauthorizedException{
        UserResponseDto userResponseDto = service.login(userRequestDto);
        return new ResponseEntity<>(userResponseDto, HttpStatus.ACCEPTED);
    }

    

}