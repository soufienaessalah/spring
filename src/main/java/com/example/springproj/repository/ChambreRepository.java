package com.example.springproj.repository;

import com.example.springproj.entity.Chambre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends CrudRepository<Chambre, Long> {
}
