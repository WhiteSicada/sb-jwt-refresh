package com.bezkoder.spring.security.jwt.models.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "enfants")
public @Data
class Enfant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateNaissance;
    private String regimeSocial;
    private String justificatif;

    public Enfant(String dateNaissance, String regimeSocial, String justificatif) {
        this.dateNaissance = dateNaissance;
        this.regimeSocial = regimeSocial;
        this.justificatif = justificatif;
    }

    public Enfant() {
    }
}
