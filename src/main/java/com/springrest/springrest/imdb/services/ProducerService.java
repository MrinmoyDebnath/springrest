package com.springrest.springrest.imdb.services;

import java.util.List;

import com.springrest.springrest.imdb.models.Producers;
import com.springrest.springrest.imdb.repositories.ProducerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	private final ProducerRepository producerRepository;

	@Autowired
	public ProducerService(ProducerRepository producerRepository){
		this.producerRepository = producerRepository;
	}
    public List<Producers> getProducers(){
		return producerRepository.findAll();
	}
	public List<Producers> createProducers(Producers producer){
		return List.of(producer);
	}
	public List<Producers> getProducerByName(String name){
		return producerRepository.findByNameContainingIgnoreCase(name);
	}
}
