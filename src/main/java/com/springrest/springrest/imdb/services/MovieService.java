package com.springrest.springrest.imdb.services;

import java.util.List;

import com.springrest.springrest.imdb.models.Movies;
import com.springrest.springrest.imdb.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	private final MovieRepository movieRepository;

	@Autowired
	public MovieService(MovieRepository movieRepository){
		this.movieRepository = movieRepository;
	}
    public List<Movies> getMovies(){
		return movieRepository.findAll();
	}
	public List<Movies> createMovies(Movies movie){
		movieRepository.save(movie);
		return List.of(movie);
	}
	public List<Movies> getMovieByName(String name){
		return movieRepository.findByNameContainingIgnoreCase(name);
	}
	public List<Movies> getMovieByActor(String name){
		return movieRepository.getActorMovie(name);
	}
	public List<Movies> getMovieByProducer(String name){
		return movieRepository.findByProducerContainingIgnoreCase(name);
	}
}
