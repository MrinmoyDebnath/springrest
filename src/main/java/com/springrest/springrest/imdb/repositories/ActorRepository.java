package com.springrest.springrest.imdb.repositories;

import java.util.List;
import java.util.UUID;

import com.springrest.springrest.imdb.models.Actors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actors, UUID>{
    List<Actors> findByNameContainingIgnoreCase(String title);
}
