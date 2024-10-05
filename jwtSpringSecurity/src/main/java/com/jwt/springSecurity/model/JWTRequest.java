package com.jwt.springSecurity.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JWTRequest {

    private String email;
    private String password;
}
