package com.bezkoder.spring.security.jwt.payload.response;

import com.bezkoder.spring.security.jwt.models.Role;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public @Data
class UserDetail {
    private Long id;
    private String username;
    private String nom;
    private String prenom;
    private String email;
    private String dateBirth;
    private List<String> roles;

    public UserDetail(Long id,String username, String nom, String prenom, String email, String dateBirth, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateBirth = dateBirth;
        this.roles = roles.stream()
                .map(r->r.getName().toString())
                .collect(Collectors.toList());
    }
}