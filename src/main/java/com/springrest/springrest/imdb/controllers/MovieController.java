package com.springrest.springrest.imdb.controllers;

import java.util.List;

import com.springrest.springrest.imdb.models.Movies;
import com.springrest.springrest.imdb.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {
    
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
	public List<Movies> getMovies(){
        return movieService.getMovies();
    }
    @GetMapping(path="/movie{name}")
	public List<Movies> getMovieByName(@RequestParam String name){
        return movieService.getMovieByName(name);
    }
    @GetMapping(path="/actor{name}")
	public List<Movies> getMovieByActor(@RequestParam String name){
        return movieService.getMovieByActor(name);
    }
    @GetMapping(path="/producer{name}")
	public List<Movies> getMovieByProducer(@RequestParam String name){
        return movieService.getMovieByProducer(name);
    }
    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json" )
    public List<Movies> createActor(@RequestBody Movies movie){
        System.out.print(movie);
        return movieService.createMovies(movie);
    }
}
