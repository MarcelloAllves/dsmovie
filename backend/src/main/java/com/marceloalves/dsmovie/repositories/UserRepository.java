package com.marceloalves.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marceloalves.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
