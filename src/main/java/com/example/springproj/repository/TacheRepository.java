package com.example.springproj.repository;

import com.example.springproj.entity.Tache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends CrudRepository<Tache, Long> {
}
