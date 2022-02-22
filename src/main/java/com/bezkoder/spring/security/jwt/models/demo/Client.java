package com.bezkoder.spring.security.jwt.models.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public @Data
class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateNaissanceSouscripteur;
    private String regimeSocialSouscripteur;
    private String nom;
    private String prenom;
    private Integer civilite;
    private Integer email;
    private Integer phone;
    private Integer mobile;
    private Boolean isDisabled;
    private String imatriculation;
    private String birthPlace;
    private String birthCountry;
    private String dateEffet;
    private String dateEffetComplementaire;
    private Boolean nonFumeur;
    private Boolean nonPrisEnChargeCentPourCentSecu;
    private Boolean nonTitulaireRenteInvalidite;
    private Boolean pasEnArretProfessionnelle;

    @OneToOne
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private Adress adress;

    @OneToOne
    @JoinColumn(name = "conjoint_id", referencedColumnName = "id")
    private Conjoint conjoint;

    public Client() {
    }

    public Client(String dateNaissanceSouscripteur, String regimeSocialSouscripteur, String nom, String prenom, Integer civilite, Integer email, Integer phone, Integer mobile, Boolean isDisabled, String imatriculation, String birthPlace, String birthCountry, String dateEffet, String dateEffetComplementaire, Boolean nonFumeur, Boolean nonPrisEnChargeCentPourCentSecu, Boolean nonTitulaireRenteInvalidite, Boolean pasEnArretProfessionnelle, Adress adress, Conjoint conjoint) {
        this.dateNaissanceSouscripteur = dateNaissanceSouscripteur;
        this.regimeSocialSouscripteur = regimeSocialSouscripteur;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.isDisabled = isDisabled;
        this.imatriculation = imatriculation;
        this.birthPlace = birthPlace;
        this.birthCountry = birthCountry;
        this.dateEffet = dateEffet;
        this.dateEffetComplementaire = dateEffetComplementaire;
        this.nonFumeur = nonFumeur;
        this.nonPrisEnChargeCentPourCentSecu = nonPrisEnChargeCentPourCentSecu;
        this.nonTitulaireRenteInvalidite = nonTitulaireRenteInvalidite;
        this.pasEnArretProfessionnelle = pasEnArretProfessionnelle;
        this.adress = adress;
        this.conjoint = conjoint;
    }
}
