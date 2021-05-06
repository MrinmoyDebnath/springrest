package com.springrest.springrest.imdb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class DefaultController {
    @GetMapping
	public String getPageNotFound(){
        return "Page Not Found";
	}
}
