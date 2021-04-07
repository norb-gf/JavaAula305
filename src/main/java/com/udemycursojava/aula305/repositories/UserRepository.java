package com.udemycursojava.aula305.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycursojava.aula305.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
	
}
