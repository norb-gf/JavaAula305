package com.udemycursojava.aula305.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycursojava.aula305.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
