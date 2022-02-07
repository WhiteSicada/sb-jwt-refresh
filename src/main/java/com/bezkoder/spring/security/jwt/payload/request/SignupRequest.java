package com.bezkoder.spring.security.jwt.payload.request;

import lombok.Data;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.*;

public @Data
class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
    private String nom;
    private String prenom;
    private String dateBirth;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;


}
