package com.marceloalves.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloalves.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
