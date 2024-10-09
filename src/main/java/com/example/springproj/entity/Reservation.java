package com.example.springproj.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    private String idReservation;

    private LocalDate anneeUniversitaire;
    private Boolean estValide;

    @ManyToOne
    @JoinColumn(name = "idChambre")
    private Chambre chambre;

    @ManyToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant etudiant;

    // Getters and Setters
}
