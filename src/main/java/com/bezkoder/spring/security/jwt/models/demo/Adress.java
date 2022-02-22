package com.bezkoder.spring.security.jwt.models.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "adresses")
public @Data
class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String StreetName;
    private String StreetNumber;
    private String StreetType;
    private String repetition;
    private String cityName;
    private String cityZipCode;
    private String complement;
    private String codeInsee;

    public Adress() {
    }
}
