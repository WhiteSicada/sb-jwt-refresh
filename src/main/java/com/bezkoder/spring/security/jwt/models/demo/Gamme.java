package com.bezkoder.spring.security.jwt.models.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "gammes")
public @Data
class Gamme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Gamme(String name) {
        this.name = name;
    }

    public Gamme() {
    }

}
