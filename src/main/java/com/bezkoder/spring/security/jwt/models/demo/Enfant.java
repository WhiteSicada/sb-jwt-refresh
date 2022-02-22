package com.bezkoder.spring.security.jwt.models.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    private String firstName;
    private String lastName;
    private Integer civility;
    private Boolean isDisabled;
    private String numeroSecuriteSocial;
    private String numeroOrganisme;
    private Boolean beneficiaryOf;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client client;

    public Enfant() {
    }

    public Enfant(String dateNaissance, String regimeSocial, String justificatif, String firstName, String lastName, Integer civility, Boolean isDisabled, String numeroSecuriteSocial, String numeroOrganisme, Boolean beneficiaryOf) {
        this.dateNaissance = dateNaissance;
        this.regimeSocial = regimeSocial;
        this.justificatif = justificatif;
        this.firstName = firstName;
        this.lastName = lastName;
        this.civility = civility;
        this.isDisabled = isDisabled;
        this.numeroSecuriteSocial = numeroSecuriteSocial;
        this.numeroOrganisme = numeroOrganisme;
        this.beneficiaryOf = beneficiaryOf;
    }
}
