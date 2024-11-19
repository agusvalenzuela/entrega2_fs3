package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import com.example.model.producto;
import com.example.service.productoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/productos")
public class productoController {
    @Autowired
    private productoService productoService;

    @GetMapping
    public List<producto> getAllProductos(){
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Optional<producto> getProductoById(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }
    
    @PostMapping
    public producto creProducto(@RequestBody producto producto) {
        return productoService.createProducto(producto);
    }

    @PutMapping("/{id}")
    public producto updateProducto(@PathVariable Long id, @RequestBody producto producto){
        return productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
    }

    
    
    
    
}
