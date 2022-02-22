package com.bezkoder.spring.security.jwt.models.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "conjoints")
public @Data
class Conjoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer civility;
    private Boolean isDisabled;
    private String numeroSecuriteSocial;
    private String numeroOrganisme;
    private Boolean beneficiaryOf;
    private String dateNaissanceConjoint;
    private String regimeSocialConjoint;

    public Conjoint() {
    }
}
