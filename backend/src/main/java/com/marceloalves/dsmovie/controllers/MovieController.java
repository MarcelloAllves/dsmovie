package com.marceloalves.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marceloalves.dsmovie.dto.MovieDTO;
import com.marceloalves.dsmovie.services.MovieService;

/*
	Essa classe implementa o endpoint, ou seja, o endereço que acessamos do navegador, de um testador de requisição, como
	postman, postgre, etc. Onde sua resposta será nesse caso, a página de filmes.
 
*/

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		
		return service.findAll(pageable);
		
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id){
		
		return service.findById(id);
		
	}

}
