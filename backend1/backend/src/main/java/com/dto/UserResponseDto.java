package com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserResponseDto {

    private final long timeStamp = System.currentTimeMillis();
    private String token;
}