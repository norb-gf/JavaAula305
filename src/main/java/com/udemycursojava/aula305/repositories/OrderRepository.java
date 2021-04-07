package com.udemycursojava.aula305.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycursojava.aula305.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
