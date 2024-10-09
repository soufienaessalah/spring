package com.example.springproj.service;

import com.example.springproj.entity.Chambre;
import java.util.List;

public interface ChambreService {
    List<Chambre> getAllChambres();
    Chambre getChambreById(Long id);
    Chambre createChambre(Chambre chambre);
    Chambre updateChambre(Long id, Chambre chambre);
    void deleteChambre(Long id);
}
