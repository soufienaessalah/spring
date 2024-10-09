package com.example.springproj.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;

    // Getters and Setters
}
