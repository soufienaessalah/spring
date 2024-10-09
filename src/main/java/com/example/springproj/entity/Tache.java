package com.example.springproj.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tache")
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTache")
    private Long idTache;

    private LocalDate dateTache;
    private Integer duree;
    private Float tarifHoraire;

    @Enumerated(EnumType.STRING)
    private TypeTache typeTache;

    @ManyToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant etudiant;

    // Getters and Setters
}
