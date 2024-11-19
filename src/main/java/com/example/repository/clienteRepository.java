package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.cliente;


public interface clienteRepository extends JpaRepository<cliente, Long> {
    
}
