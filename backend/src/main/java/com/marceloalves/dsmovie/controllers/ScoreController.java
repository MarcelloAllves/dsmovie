package com.marceloalves.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marceloalves.dsmovie.dto.MovieDTO;
import com.marceloalves.dsmovie.dto.ScoreDTO;
import com.marceloalves.dsmovie.services.ScoreService;

/*
	Essa classe implementa o endpoint, ou seja, o endereço que acessamos do navegador, de um testador de requisição, como
	postman, postgre, etc. Onde sua resposta será nesse caso, a página de filmes.
 
*/

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
			
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){		
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}
