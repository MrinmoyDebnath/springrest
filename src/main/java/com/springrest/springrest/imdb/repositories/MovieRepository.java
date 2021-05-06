package com.springrest.springrest.imdb.repositories;

import java.util.List;
import java.util.UUID;

import com.springrest.springrest.imdb.models.Movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, UUID>{
    List<Movies> findByNameContainingIgnoreCase(String name);

    @Query(value = "SELECT * FROM movies, unnest(actors) a WHERE lower(a) ILIKE %:actor%", nativeQuery=true)
    List<Movies> getActorMovie(@Param("actor") String actor);
    
    List<Movies> findByProducerContainingIgnoreCase(String producer);
}
