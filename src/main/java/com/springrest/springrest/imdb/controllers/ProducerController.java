package com.springrest.springrest.imdb.controllers;

import java.util.List;

import com.springrest.springrest.imdb.models.Producers;
import com.springrest.springrest.imdb.services.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/producers")
public class ProducerController {
    
    private final ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService){
        this.producerService = producerService;
    }

    @GetMapping
	public List<Producers> getProducers(){
        return producerService.getProducers();
    }
    @GetMapping(path="/producer{name}")
	public List<Producers> getProducerByName(@RequestParam String name){
        return producerService.getProducerByName(name);
    }
    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    public List<Producers> createActor(@RequestBody Producers producer){
        return producerService.createProducers(producer);
    }
}
