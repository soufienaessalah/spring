package com.example.springproj.service;

import com.example.springproj.entity.Etudiant;
import java.util.List;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(Long id);
    Etudiant createEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Long id, Etudiant etudiant);
    void deleteEtudiant(Long id);
}
