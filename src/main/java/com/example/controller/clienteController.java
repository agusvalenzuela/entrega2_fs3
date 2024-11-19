package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import com.example.model.cliente;
import com.example.service.clienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/clientes")
public class clienteController {
    @Autowired
    private clienteService clienteService;

    @GetMapping
    public List<cliente> getAllProductos(){
        return clienteService.getAllClientes();
    }

    @GetMapping("/{rut}")
    public Optional<cliente> getProductoById(@PathVariable Long rut) {
        return clienteService.getClienteById(rut);
    }
    
    @PostMapping
    public cliente creProducto(@RequestBody cliente cliente) {
        return clienteService.createCliente(cliente);
    }

    @PutMapping("/{rut}")
    public cliente updateProducto(@PathVariable Long rut, @RequestBody cliente cliente){
        return clienteService.updateCliente(rut, cliente);
    }

    @DeleteMapping("/{rut}")
    public void deleteProducto(@PathVariable Long rut){
        clienteService.deleteCliente(rut);
    }

    
    
    
    
}
