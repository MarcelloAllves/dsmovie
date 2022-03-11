package com.marceloalves.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloalves.dsmovie.entities.Score;
import com.marceloalves.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
