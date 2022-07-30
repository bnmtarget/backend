package com.dto;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class UserRequestDto {

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
