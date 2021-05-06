package com.springrest.springrest.imdb.repositories;

import java.util.List;
import java.util.UUID;

import com.springrest.springrest.imdb.models.Producers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends JpaRepository<Producers, UUID>{
    List<Producers> findByNameContainingIgnoreCase(String title);
}
