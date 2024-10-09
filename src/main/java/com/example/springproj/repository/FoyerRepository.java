package com.example.springproj.repository;

import com.example.springproj.entity.Foyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends CrudRepository<Foyer, Long> {
}
