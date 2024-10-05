package com.jwt.springSecurity.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JWTResponse {

    private String jwtToken;
    private String username;

}
