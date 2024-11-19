package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.producto;


public interface productoRepository extends JpaRepository<producto, Long> {
    
}
