package com.example.springproj.entity;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;

    // Getters and Setters
}
