package com.example.springproj.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne
    @JoinColumn(name = "idUniversite")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs;

    // Getters and Setters
}
