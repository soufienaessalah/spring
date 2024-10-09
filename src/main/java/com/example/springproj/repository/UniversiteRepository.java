package com.example.springproj.repository;

import com.example.springproj.entity.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends CrudRepository<Universite, Long> {
}
