package com.example.springproj.service.impl;

import com.example.springproj.entity.Chambre;
import com.example.springproj.repository.ChambreRepository;
import com.example.springproj.service.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChambreServiceImpl implements ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> getAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public Chambre createChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Long id, Chambre chambre) {
        if (chambreRepository.existsById(id)) {
            chambre.setIdChambre(id);
            return chambreRepository.save(chambre);
        }
        return null;
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}
