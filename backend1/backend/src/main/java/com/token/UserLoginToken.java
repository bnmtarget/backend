package com.token;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class UserLoginToken {
    final private String email;
    final private String name;
    final private String password;
}
