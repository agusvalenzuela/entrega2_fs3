package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.producto;
import com.example.repository.productoRepository;

import  java.util.List;
import java.util.Optional;

@Service
public class productoServiceImpl implements productoService {
    @Autowired
    private productoRepository productoRepository;

    @Override
    public List<producto> getAllProductos(){
        return productoRepository.findAll();
    }

    @Override
    public Optional<producto> getProductoById(Long id){
        return productoRepository.findById(id);
    }

    @Override
    public producto createProducto(producto producto){
        return productoRepository.save(producto);
    }

    @Override
    public producto updateProducto(Long id, producto producto){
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);

        }
        else{
            return null;
        }
    }
    @Override
    public void deleteProducto(Long id){
        productoRepository.deleteById(id);
    }
    
}
