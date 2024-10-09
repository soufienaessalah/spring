package com.example.springproj.entity;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private LocalDate dateNaissance;

    @OneToMany(mappedBy = "etudiant")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "etudiant")
    private List<Tache> taches;

    // Getters and Setters
}
