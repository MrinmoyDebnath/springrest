package com.springrest.springrest.imdb.controllers;

import java.util.List;

import com.springrest.springrest.imdb.models.Actors;
import com.springrest.springrest.imdb.services.ActorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/actors")
public class ActorController {
    
    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService){
        this.actorService = actorService;
    }

    @GetMapping
	public List<Actors> getActors(){
        return actorService.getActors();
    }
    @GetMapping(path="/actor{name}")
	public List<Actors> getActorByName(@RequestParam String name){
        return actorService.getActorByName(name);
    }
    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    public List<Actors> createActor(@RequestBody Actors actor){
        return actorService.createActor(actor);
    }
}
