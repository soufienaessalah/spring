package com.example.springproj.repository;

import com.example.springproj.entity.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends CrudRepository<Bloc, Long> {
}
