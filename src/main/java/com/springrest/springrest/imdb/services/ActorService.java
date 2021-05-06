package com.springrest.springrest.imdb.services;

import java.util.List;

import com.springrest.springrest.imdb.models.Actors;
import com.springrest.springrest.imdb.repositories.ActorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {
	private final ActorRepository actorRepository;

	@Autowired
	public ActorService(ActorRepository actorRepository){
		this.actorRepository = actorRepository;
	}
    public List<Actors> getActors(){
		return actorRepository.findAll();
	}
	public List<Actors> createActor(Actors actor){
		return List.of(actor);
	}
	public List<Actors> getActorByName(String name){
		return actorRepository.findByNameContainingIgnoreCase(name);
	}
}
