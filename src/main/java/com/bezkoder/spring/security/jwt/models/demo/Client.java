package com.bezkoder.spring.security.jwt.models.demo;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateNaissanceSouscripteur;
    private String regimeSocialSouscripteur;
    private String codePostalVille;
    private Boolean conjoint;
    private String dateNaissanceConjoint;
    private String regimeSocialConjoint;
    private String dateEffet;
    private String dateEffetComplementaire;
    private Boolean nonFumeur;
    private Boolean nonPrisEnChargeCentPourCentSecu;
    private Boolean nonTitulaireRenteInvalidite;
    private Boolean pasEnArretProfessionnelle;
    private String gamme;

}
