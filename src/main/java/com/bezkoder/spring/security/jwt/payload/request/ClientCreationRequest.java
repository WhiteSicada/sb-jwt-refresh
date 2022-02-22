package com.bezkoder.spring.security.jwt.payload.request;

import com.bezkoder.spring.security.jwt.models.demo.Adress;
import com.bezkoder.spring.security.jwt.models.demo.Conjoint;
import com.bezkoder.spring.security.jwt.models.demo.Enfant;
import lombok.Data;

import java.util.List;

public @Data
class ClientCreationRequest {

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
    private Adress adress;
    private Conjoint conjoint;
    private List<Enfant> enfantList;
}
